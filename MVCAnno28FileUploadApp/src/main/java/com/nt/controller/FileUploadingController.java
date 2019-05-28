package com.nt.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.nt.command.UploadCommand;

@Controller
public class FileUploadingController {
	
	@RequestMapping(value="upload.htm",method=RequestMethod.GET)
	public  String showForm(@ModelAttribute("uplCmd") UploadCommand cmd){
		return "upload_form";
	}
	
	@RequestMapping(value="upload.htm",method=RequestMethod.POST)
	public String  upload(Map<String,Object> map,
			                               @ModelAttribute("uplCmd") UploadCommand cmd){
		String fname1=null,fname2=null;
		MultipartFile file1=null,file2=null;
		OutputStream os1=null,os2=null;
		InputStream is1=null,is2=null;
		//get the names of the uploaded files
		file1=cmd.getFile1();
		file2=cmd.getFile2();
		fname1=file1.getOriginalFilename();
		fname2=file2.getOriginalFilename();
		try{
		//create OutputStreams pointing to dest files on server machine file system
		os1=new FileOutputStream("e:\\springuploads\\"+fname1);
		os2=new FileOutputStream("E:\\springuploads\\"+fname2);
		//create InputStream representing uploaded files 
		is1=file1.getInputStream();
		is2=file2.getInputStream();
		//perform file copy operation to complete FileUploading
		IOUtils.copy(is1,os1);
		IOUtils.copy(is2,os2);
		}//try
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			//close streams
			try{
				if(os1!=null){
					os1.close();
				}
			}
			catch(IOException ioe){
			 ioe.printStackTrace();
			}
			try{
				if(os2!=null){
					os2.close();
				}
			}
			catch(IOException ioe){
			 ioe.printStackTrace();
			}
			try{
				if(is1!=null){
					is1.close();
				}
			}
			catch(IOException ioe){
			 ioe.printStackTrace();
			}
			try{
				if(is2!=null){
					is2.close();
				}
			}
			catch(IOException ioe){
			 ioe.printStackTrace();
			}
		}//finally
		//add the names of the uploaded files to model attribute
		map.put("fname1", fname1);
		map.put("fname2",fname2);
		return "success_upload";
	  }//method
}//class
