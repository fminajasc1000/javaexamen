package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Controlador
 * @Version 1.0 09/05/2021
 * @author Francisco Minajas
 * 
 * */
@Controller
public class AppController {
	/*
	 * Este metodo sirve para que si coloca cualquiera de los dos "/" o "/login"
	 * nos lleve directo a "index"
	 * @return "index"
	 * */
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	/*
	 * Este metodo sirve para que si coloca "/menu"
	 * nos regrese a menu
	 * @return "menu"
	 * */
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	/*
	 * Este metodo sirve para que si coloca "/user"
	 * nos regrese a user
	 * @return "user"
	 * */
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	/*
	 * Este metodo sirve para que si coloca "/admin"
	 * nos regrese a admin
	 * @return "menu"
	 * */
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
}