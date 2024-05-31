//package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller // 컨트롤러로 지정 + 빈(객체) 생성해서 담기
//public class MappingController1 {
//	
//	// HTML문서 없이 메세지 바다에 데이터를 직접 담는 기능
//	@ResponseBody //@ResponseBody와 메소드의 String타입으로 html파일이 아닌 data를 받아옴
//	
//	// GET + localhost:8080/board
////	@RequestMapping(value = "/board", method = RequestMethod.GET)
//	@GetMapping("/board") // 의미가 위에 같음
//	public String list() {
//		System.out.println("게시물 조회...");
//		return "ok";
//	}
//	
//	// Post + localhost:8080/board 주소가 같아도 방식이 달라서 가능함
//	@ResponseBody
//	@PostMapping("/board")
//	public String save() {
//		System.out.println("게시물 등록...");
//		return "ok";
//	}
//	// Put + localhost:8080/board
//	@ResponseBody
//	@PutMapping("/board")
//	public String modify() {
//		System.out.println("게시물 수정...");
//		return "ok";
//	}
//	// Delete + localhost:8080/board
//	@ResponseBody
//	@DeleteMapping("/board")
//	public String remove() {
//		System.out.println("게시물 삭제...");
//		return "ok";
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
