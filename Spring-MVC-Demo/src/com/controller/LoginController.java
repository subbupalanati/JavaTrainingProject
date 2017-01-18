package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
 @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
 public String view(HttpServletRequest request,HttpServletResponse res)
 {
	 return "login";
}
 @RequestMapping(value = {"/submit"}, method = RequestMethod.POST)
 public String validate(HttpServletRequest request,HttpServletResponse res)
 {
		
String username=request.getParameter("username");
String password=request.getParameter("password");
if(username =="subbu" && password=="1234")
{
	return "success";
}
else 
{
	return "failure";
}
	
			
 }
}
