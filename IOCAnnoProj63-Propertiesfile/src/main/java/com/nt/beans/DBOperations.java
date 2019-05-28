package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbo")
public class DBOperations {
	@Value("${jdbc.driver}")
	private String  driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.user}")
	private String dbuser;
	@Value("${jdbc.pwd}")
	private String dbpwd;
	@Value("${java.vm.specification.vendor}")
	private String javaVendor;
	
	
	@Override
	public String toString() {
		return "DBOperations [driver=" + driver + ", url=" + url + ", dbuser=" + dbuser + ", dbpwd=" + dbpwd +",javaVendor= "+javaVendor+"]";
	}
	
	
	

}
