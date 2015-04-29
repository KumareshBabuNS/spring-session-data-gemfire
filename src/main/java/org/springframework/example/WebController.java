package org.springframework.example;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebController {

	@RequestMapping("/index")  
    public ModelAndView indexPage(HttpSession httpSession) { 
		Item item = new Item();
		item.setSku(UUID.randomUUID().toString());
		item.setArea("A51");
		item.setStock(10);
		
		httpSession.setAttribute("msg","This is a message in a Session");
		httpSession.setAttribute("obj",item);
		
		return new ModelAndView("views/index", "msg", "Setting Session for the 1st time.");
	}
	
	@RequestMapping("/other")  
    public ModelAndView otherPage(HttpSession httpSession) { 
		return new ModelAndView("views/other", "msg", "You should have Session...");
	}
}
