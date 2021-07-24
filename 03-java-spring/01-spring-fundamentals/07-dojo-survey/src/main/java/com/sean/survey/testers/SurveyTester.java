package com.sean.survey.testers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sean.survey.models.Survey;

@Controller
public class SurveyTester {
	@RequestMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("locations", new String[] {"San Jose", "Oakland", "Seattle", "Dallas"});
		viewModel.addAttribute("languages", new String[] {"Java", "Python", "JavaScript", "Ruby"});
		return "index.jsp";
	}
	
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String survey(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment, Model viewModel) {
		viewModel.addAttribute("result", new Survey(name, location, language, comment));
		return "result.jsp";
	}
	
}
	