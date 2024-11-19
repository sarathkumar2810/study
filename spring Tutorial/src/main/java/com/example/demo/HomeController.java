package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView home(String name, HttpSession session) {
		
		//HttpSession session = req.getSession();		//  to get data name from url
		//String name = req.getParameter("name");
		ModelAndView mv = new ModelAndView();
		//System.out.println("Hi " + name);			//  to print name=sarath in console
		//session.setAttribute("name", name);
		mv.addObject("name", name);
		mv.setViewName("home");
		
		return mv;
	}

}
