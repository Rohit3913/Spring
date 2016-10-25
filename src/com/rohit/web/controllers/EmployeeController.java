package com.rohit.web.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.catalina.connector.Request;
import org.apache.tomcat.jni.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rohit.web.DAO.EmployeeDAO;
import com.rohit.web.Model.Employee;
import com.rohit.web.services.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeDAO empDAO;
	@Autowired
	@Qualifier("empService")
	EmployeeService EmpService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showHome(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) {

		ModelAndView mav = new ModelAndView("EmployeeCreation");
		Map<String, Object> model = mav.getModel();
		mav.addObject("empList", EmpService.getEmployee());

		httpSession.setAttribute("name2", "Rakesh2");
		model.put("name", "<b>Rakesh</b><br>");
		return mav;
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String addEmployee(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession,
			@Valid Employee employee,BindingResult result) {
		if(result.hasErrors()){
			for (ObjectError error : result.getAllErrors()) {
				System.out.println(error.getDefaultMessage());
			}
		
		}else{
		empDAO.createEmp(employee);
		}return  "sucess";
		
	}
}
