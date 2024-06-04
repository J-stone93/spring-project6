package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.BookDTO;

@Controller
@RequestMapping("/return2")
public class ReturnController2 {

	@ResponseBody
	@GetMapping("/ex1")
	public String ex1() {
		return "Hi~";
	}
	
	@ResponseBody
	@GetMapping("/ex2")
	public int ex2() {
		return 100;
	}
	
	@ResponseBody
	@GetMapping("/ex3")
	public BookDTO ex3() {
		
		BookDTO bookDto = new BookDTO("자바프로그래밍입문", "한빛컴퍼니", 20000);
		return bookDto;
	}
	
	@ResponseBody
	@GetMapping("/ex4")
	public List<BookDTO> ex4() {
		List<BookDTO> list = new ArrayList<>();
		list.add(new BookDTO("자바프로그래밍입문", "한빛컴퍼니", 20000));
		list.add(new BookDTO("스프링부트웹프로젝트", "구멍가게코딩단", 20000));
		list.add(new BookDTO("모두의리눅스", "길벗출판사", 20000));
		return list;
	}
	
	@GetMapping("/ex5")
	public ResponseEntity ex5() {
//		return new ResponseEntity(HttpStatus.OK); // 200 ok 성공코드
		return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR); // 강제로 오류 만들기
	}
	
	@GetMapping("/ex6")
	public ResponseEntity<String> ex6() {
		return new ResponseEntity<String>("success..", HttpStatus.OK); // 200 ok 응답 + 문자열
	}
	
	@GetMapping("/ex7")
	public ResponseEntity<BookDTO> ex7() {
		BookDTO bookDto = new BookDTO("자바프로그래밍입문", "한빛컴퍼니", 20000);
		return new ResponseEntity<BookDTO>(bookDto, HttpStatus.OK); // 200 ok 응답 + Book객체
	}
} 













