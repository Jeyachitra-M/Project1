package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
@RequestMapping(value={"/","Header"})
public String show()
{
	return "Header";
}
@RequestMapping(value="/home")
public String showHome()
{
	return "Header";
}
@RequestMapping(value="/login")
public String showLoginPage()
{
	return "Login";
}

@RequestMapping(value="/register")
public String showRegisterPage()
{
	return "Register";
}

@RequestMapping(value="/contactus")
public String showContactUs()
{
	return "ContactUs";
}

@RequestMapping(value="/aboutus")
public String showAboutUs()
{
	return "AboutUs";
}

	
}
