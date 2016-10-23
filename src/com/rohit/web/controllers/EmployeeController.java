package com.rohit.web.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.web.DAO.EmployeeDAO;
import com.rohit.web.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	@Qualifier("empService")
	EmployeeService EmpService;
	@RequestMapping("/")
	public ModelAndView showHome(HttpServletRequest request, HttpServletResponse response,HttpSession httpSession) {
		
		ModelAndView mav = new ModelAndView("home");
		Map<String, Object> model=mav.getModel();
		mav.addObject("empList",EmpService.getEmployee());
		
		httpSession.setAttribute("name2", "Rakesh2");
		model.put("name", "<b>Rakesh</b><br>");
		return mav;
	}
}
