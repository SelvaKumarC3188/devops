package com.onesoft.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/get")
public String get(){
	return "sariya";
}
}
