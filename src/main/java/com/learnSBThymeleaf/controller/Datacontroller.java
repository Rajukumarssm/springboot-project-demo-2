package com.learnSBThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//controller tb use krenge jb controller direct reponse index.html ko na dekar koi or html file pr jayega 
// restcontroller direct response index.html pr asit print kr dega 
@Controller
public class Datacontroller {

	@GetMapping("/view")
	public String viewinfo() {
		return "viewinfo";
		// html file ka name asit hoga chahiye no chNGE jis pr jana hai i.e in return
		// above not return string viewinfo rather it goes to viewinfo html file and
		// print in that html file

	}

}
