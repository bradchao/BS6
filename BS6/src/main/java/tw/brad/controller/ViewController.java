package tw.brad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	ModelAndView modelBrad01 = new ModelAndView("brad01");
	ModelAndView modelBrad02 = new ModelAndView("brad02");
	
	public ViewController() {
		modelBrad01.addObject("mesg", "Hello, Brad01");
		modelBrad02.addObject("mesg", "Hello, Brad02");
		System.out.println("ViewController()");
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("companyName", "Brad Big Company");
		return "index";
	}
	
	@RequestMapping("/brad01")
	public ModelAndView brad01() {
		return modelBrad01;
	}
	
	@RequestMapping("/brad02")
	public ModelAndView brad02() {
		return modelBrad02;
	}
	
}
