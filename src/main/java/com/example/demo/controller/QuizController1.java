package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/method/q")
public class QuizController1 {

	@ResponseBody
	@GetMapping
	public String get() {
		System.out.println("게시물 조회!");
		return "ok";
	}
	
	@ResponseBody
	@PostMapping
	public String post() {
		System.out.println("게시물 등록!");
		return "ok";
	}
	
	@ResponseBody
	@PutMapping
	public String put() {
		System.out.println("게시물 수정!");
		return "ok";
	}
	
	@ResponseBody
	@DeleteMapping
	public String delete() {
		System.out.println("게시물 삭제!");
		return "ok";
	}
	
}












