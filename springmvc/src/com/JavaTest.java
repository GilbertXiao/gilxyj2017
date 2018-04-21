package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;








@Controller
public class UserAction {
	
	@RequestMapping("/hello")
	public String helloMethod(Model model) throws Exception{
		System.out.println("comming ....");
		System.out.println("comming ....");
		return "/success.jsp";
		
	}
	


	
}
