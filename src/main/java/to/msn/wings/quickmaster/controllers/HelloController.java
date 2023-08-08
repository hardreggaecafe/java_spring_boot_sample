package to.msn.wings.quickmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	public String index() {
		return ("こんにちは世界");
	}
	@GetMapping("/greet")
	public String greet(Model model) {
		model.addAttribute("message","こんちわ！World");
		return "greet";
	}
}