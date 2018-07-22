package pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/greet")
	public String sayHello(Model model) {
		model.addAttribute("greet","Hello World");
		return "hello";
	}

}
