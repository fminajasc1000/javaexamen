package com.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/*
 * Clase para generar el cifrado de las contraseñas
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
public class Passgenerator {
	public static void main(String[] args) {
		/*
		 * El String que mandamos al metodo encode es el password que queremos cifrar.
		 * 
		 * */
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		System.out.println(bCryptPasswordEncoder.encode("1234"));
	}
}
