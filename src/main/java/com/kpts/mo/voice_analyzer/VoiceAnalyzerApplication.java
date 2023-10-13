package com.kpts.mo.voice_analyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.kpts.mo.controller","com.kpts.mo.service"})
@EntityScan(basePackages = {"com.kpts.mo.models"})
@EnableJpaRepositories("com.kpts.mo.repositories")
public class VoiceAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoiceAnalyzerApplication.class, args);
	}

}
