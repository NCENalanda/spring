package com.nt.dao;

import java.util.Map;

public interface LoginDAO {
    public  Map<String,Object>   authenticate(String user,String pwd);
}
