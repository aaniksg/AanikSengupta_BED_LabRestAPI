package org.greatlearning.sms.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptPasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPasswordAdmin = passwordEncoder.encode("admin");
		String encodedPasswordUser = passwordEncoder.encode("user");

		System.out.println(encodedPasswordAdmin);
		System.out.println(encodedPasswordUser);
	}
}
