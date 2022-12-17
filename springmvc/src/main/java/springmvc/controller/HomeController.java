package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home url");
		
		model.addAttribute("name", "rajan prajapati");
		model.addAttribute("age", 25);
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	
}
