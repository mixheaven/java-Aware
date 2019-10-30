package com.test.Docteur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DocteurApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocteurApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String indeax() {
		return "Greetings from Spring Boot!";
	}
	@RequestMapping("/docteur")
	@ResponseBody
	public String index() {
		return "<ul>" +
				"<li><a href = /docteur/4> Docteur 4</a></li>"+
				"<li><a href = /docteur/8> Docteur 8</a></li>"+
				"<li><a href = /docteur/2> Docteur 2</a></li>"+
				"<li><a href = /docteur/6> Docteur 6</a></li>"+
				"</ul>";
	}

	@RequestMapping("/docteur/4")
	@ResponseBody
	public String doc4() {
		return "Tom Baker";
	}

	@RequestMapping("/docteur/8")
	@ResponseBody
	public String  doc8() {
		return "Paul McGann";
	}
	@RequestMapping("/docteur/2")
	@ResponseBody
	public String doc2() {
		return "Patrick Troughton";
	}
	@RequestMapping("/docteur/6")
	@ResponseBody
	public String  doc6() {
		return "Colin Baker";
	}

	@RequestMapping("/docteura")
	@ResponseBody
	public String doc() {
		return "<li><a href = /docteur> Docteur </a></li>";
	}

}
