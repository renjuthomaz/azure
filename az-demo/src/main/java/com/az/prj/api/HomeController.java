package com.az.prj.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("ping")
	public String ping(@RequestHeader(name = "co-id", required = true) String coId) {
		System.out.println(coId);
		return "OK";
	}
}
