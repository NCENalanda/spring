package com.nt.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("filesService")
public class ListFilesServiceImpl implements ListFilesService {
   private static final String  DOWNLOAD_FOLDER="E:\\Springuploads";
	@Override
	public List<String> getAllFiles() {
		File folder=null;
		folder=new File(DOWNLOAD_FOLDER);
		File files[]=null;
		List<String> list=null;
		//get All Files 
		if(folder.isDirectory()){
			files=folder.listFiles();
		}
		//copy file names to List  collection
		list=new ArrayList();
		for(File fname:files){
			   if(!fname.isDirectory()){
				   list.add(fname.getName());
			   }
		}
		return list;
	}//method
}//class
