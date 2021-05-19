package com.xiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.text.DefaultCaret;

@SpringBootApplication
public class ShiroSpringbootApplication {

	private static DefaultCaret.SafeScroller SpringApplication;

	public static void main(String[] args) {
		SpringApplication.run(ShiroSpringbootApplication.class, args);
	}

}
