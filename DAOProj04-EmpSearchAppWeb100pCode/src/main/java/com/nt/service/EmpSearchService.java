package com.nt.service;

import java.util.List;
import java.util.Map;

public interface EmpSearchService {
	public List<Map<String,Object>> searchEmpsByDesgs(String desg[]);

}
