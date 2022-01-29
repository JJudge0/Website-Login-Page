package net.codejava;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	

	public static void main(String[] args)
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword= "Recycle1?";
		String encodedPassword = encoder.encode(rawPassword);
		System.out.println(encodedPassword);
		//OUT PUT LOG SHOWS THIS ON THE CONSOLE: $2a$10$nuSlGwexYo6fbcrV6B3jF.aD.Re4MW56R9vsh8Xe/OFQndJO26Rhq
		//good practice to hash passwords within database
	}
	
	
}
