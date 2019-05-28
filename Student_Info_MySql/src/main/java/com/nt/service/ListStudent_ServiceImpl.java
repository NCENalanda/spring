package com.nt.service;

import com.nt.dao.ListStudent_InfoDAO;

public class ListStudent_ServiceImpl implements ListStudent_Service {
	private ListStudent_InfoDAO dao;
	public ListStudent_ServiceImpl(ListStudent_InfoDAO dao) {
		// TODO Auto-generated constructor stub
		this.dao=dao;
	}

	public String findName(int sid) {
		// TODO Auto-generated method stub
		String name=dao.getName(sid);
		return name;
	}

}
