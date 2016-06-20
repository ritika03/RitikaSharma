package com.footstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	

	    @RequestMapping("/")
	    public String home(){
	        return "index";
	    }
	    
	    @RequestMapping("/aboutus")
	    public String aboutus()
	    {
	    	return "aboutus";
	    }
	    
	   @RequestMapping("/contactus")
	   public String contactus()
	   {
		   return "contactus";
	   }
	    }




