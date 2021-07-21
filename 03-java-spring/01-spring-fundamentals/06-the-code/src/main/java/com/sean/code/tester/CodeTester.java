package com.sean.code.tester;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeTester {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String code(Model viewModel, @RequestParam("code") String code, RedirectAttributes redirectAttr) {
		if(code.equals("bushido")) {
			ArrayList<String> codeDisplay = new ArrayList<String>();
			codeDisplay.add("Loyalty");
			codeDisplay.add("Courage");
			codeDisplay.add("Veracity");
			codeDisplay.add("Compassion");
			codeDisplay.add("Honor");
			viewModel.addAttribute("codeDisplay", codeDisplay);
			return "code.jsp";
		} else {
			redirectAttr.addFlashAttribute("errorMessage", "You must train harder!");
			return "redirect:/";
		}
	}
	
}
