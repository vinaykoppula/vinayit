package in.vinayit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public ModelAndView displayWelcomeMsg() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg","Welcome to vinayit......!!!");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
