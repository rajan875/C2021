package org.mphasis;

		import org.springframework.stereotype.Controller;  
		import org.springframework.web.bind.annotation.RequestMapping;  
		
		@Controller  
		public class HelloController {  
		@RequestMapping("/hello") 
		
		    public String redirect()  
		    {  
		        return "seepage";  
		    }     
		@RequestMapping("/helloagain")  
		public String display()  
		{  
		    return "main";  
		}  
	 
	}

