package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CarDTO;
import com.example.demo.dto.StudentDTO;

@Controller
public class QuizController3 {

	@GetMapping("/return/q1")
	public void q1(Model model) {
		
		model.addAttribute("q1", "첫번째 퀴즈입니다.");
	}
	
	@GetMapping("/return/q2")
	public String q2(Model model) {
		
		model.addAttribute("q2", "두번째 퀴즈입니다.");
		return "return/test";
	}
	
	@ResponseBody
	@GetMapping("/return/q3")
	public StudentDTO q3() {
		StudentDTO studentDTO = new StudentDTO(1, "둘리", 3);
		return studentDTO;
	}
	
	@ResponseBody
	@GetMapping("/return/q4")
	public CarDTO q4() {
		CarDTO carDTO = new CarDTO("현대", "코나", "블랙");
		return carDTO;
	}
	
	@ResponseBody
	@GetMapping("return/q5")
	public List<StudentDTO> q5() {
		List<StudentDTO> list = new ArrayList<>();
		list.add(new StudentDTO(1, "둘리", 3));
		list.add(new StudentDTO(2, "또치", 1));
		list.add(new StudentDTO(3, "도우너", 2));
		return list;
	}
	
	@GetMapping("return/q6")
	public ResponseEntity q6() {
		return new ResponseEntity<>("response fail..", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("return/q7")
	public ResponseEntity<CarDTO> q7() {
		CarDTO carDTO = new CarDTO("현대", "코나", "블랙");
		return new ResponseEntity<CarDTO>(carDTO, HttpStatus.OK);
	}
}














