package com.ep.cucumber.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataContext {

	public static String loginpersonname;
	
	public String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public static String getLoginpersonname() {
		return loginpersonname;
	}

	public static void setLoginpersonname(String loginpersonname) {
		DataContext.loginpersonname = loginpersonname;
	}

	public static String employeeId;


	public static String getEmployeeId() {
		return employeeId;
	}

	public static void setEmployeeId(String employeeId) {
		DataContext.employeeId = employeeId;
	}
	
	  public HashMap<String, String> valueMap = new HashMap<String, String>();
	  
	  
      public static List<Map<String, String>> employeeList = new ArrayList<>();

}
