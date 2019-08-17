package com.nayak.warreactjspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class WarReactjsPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarReactjsPracticeApplication.class, args);
	}

}

class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*");
	}
}

@RestController
@RequestMapping("/api/v1")
class MainController {

	@GetMapping
	public ResponseEntity basic() {
		return ResponseEntity.ok("Testing mic testing 1 2 3");
	}
}

@Configuration
class ContainerConfig implements ErrorPageRegistrar {
	@Override
	public void registerErrorPages(ErrorPageRegistry registry) {
		registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/index.html"));
	}
}