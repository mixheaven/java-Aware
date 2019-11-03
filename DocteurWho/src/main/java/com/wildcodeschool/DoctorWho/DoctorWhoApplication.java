package com.wildcodeschool.DoctorWho;


import com.wildcodeschool.DocteurWho.Doctor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;


@Controller
@SpringBootApplication
public class DoctorWhoApplication {
	private Doctor[] doctor = {
			new Doctor("William Hartnell"),
			new Doctor("Patrick Troughton"),
			new Doctor("Jon Pertwee"),
			new Doctor("Tom Baker"),
			new Doctor("Peter Davison"),
			new Doctor("Colin Baker"),
			new Doctor("Sylvester McCoy"),
			new Doctor("Paul McGann"),
			new Doctor("Christopher Eccleston"),
			new Doctor("David Tennant"),
			new Doctor("Matt Smith"),
			new Doctor("Peter Capaldi"),
			new Doctor("Jodie Whittaker")};


	public static void main(String[] args) {
		SpringApplication.run(DoctorWhoApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/doctor")
	@ResponseBody
	public String doctor() {
		String html = "";
		html+="<ul>";

		for(int i=0;i <doctor.length;i++) {
			html += "<li><a href=\"/doctor/" + i + "\">"+doctor[i].getName() +"</a></li>";
		}
		html+="</ul>";
		return html;
	}



	@RequestMapping(value= "/doctor/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Doctor authorWithId(@PathVariable("id") int id) {
		if (id < 0 || id > doctor.length)
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor not found ");
		if(id <=8)
			throw  new ResponseStatusException(HttpStatus.SEE_OTHER, "It moved");
		return doctor[id];
	}
}