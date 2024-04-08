package org.ttrzcinski.sb_sec_ba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class
}, scanBasePackages = "org.ttrzcinski.sb_sec_ba")
public class SbSecBaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbSecBaApplication.class, args);
	}

}
