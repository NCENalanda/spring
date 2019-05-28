package com.nt.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.service.ListFilesService;

@Controller
public class FileDownloadController {
	@Autowired
    private ListFilesService service; 
	  
	@RequestMapping(value="/home.htm")
	public  String showFiles(Map<String,Object> map){
		List<String> list=null;
		//use service
		list=service.getAllFiles();
		//keep list in model attribute
		map.put("filesList",list);
		return "list_files";
	}
	
	@RequestMapping(value="/download.htm")
	public String  download(@RequestParam("fname") String fname,
			                                       HttpServletResponse res){
		InputStream  is=null;
		OutputStream os=null;
		try{
		//locate the file to be downloaded (InputStream)
		is=new FileInputStream("E:\\springuploads\\"+fname);
		//create Output stream pointing response obj
		os=res.getOutputStream();
		//Give instruction browser to make content as downloadable file
		res.addHeader("Content-Disposition","attachment;fileName="+fname);
		IOUtils.copy(is, os);
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		return null;
		
		
	}
	
}
