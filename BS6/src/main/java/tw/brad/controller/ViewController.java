package tw.brad.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tw.brad.service.CustomersServiceImpl;

@Controller
public class ViewController {
	ModelAndView modelBrad01 = new ModelAndView("brad01");
	ModelAndView modelBrad02 = new ModelAndView("brad02");
	
	@Autowired
	private CustomersServiceImpl customersService;
	
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
	
	@RequestMapping("/brad03")
	public String brad03(Model model) {
		model.addAttribute("companyName", "Brad Big Company");
		
		//List<Customers> customers = customersService.getAll();
		List<String> names = new LinkedList<String>();
		names.add("Test1");
		names.add("Test2");
		names.add("Test3");
		
		model.addAttribute("names", names);
		
		return "brad03";
	}
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	
	
	
}
