package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CarDTO;
import com.example.demo.dto.StudentDTO;

@Controller
@RequestMapping("/param")
public class QuizController2 {

	// 파라미터 형태
	// 간단 -> @RequestParam 또는 @PathVariable
	// 복잡 -> @RequestParam, @PathVariable 보다는 @RequestBody

	@ResponseBody
	@GetMapping("/q1")
	public String q1(@RequestParam(name = "str") String str) {

		System.out.println("String타입 파라미터 수집: " + str);
		return "ok";
	}

	@ResponseBody
	@GetMapping("/q2")
	public String q2(@RequestParam(name = "fl") float fl, @RequestParam(name = "bo") boolean bo) {

		System.out.println("float타입 파라미터 수집: " + fl + ", boolean타입 파라미터 수집: " + bo);
		return "ok";
	}

	@ResponseBody
	@GetMapping("/q3")
	public String q3(@RequestParam(name = "arr") char[] arr) {

		System.out.println("char형 배열 수집: " + Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("배열의 개수: " + arr.length);

		return "ok";
	}

	@ResponseBody
	@PostMapping("/q4")
	public String q4(@RequestBody StudentDTO dto) {

		System.out.println("객체 수집: " + dto);
		return "ok";
	}

	@ResponseBody
	@PostMapping("/q5")
	public String q5(@RequestBody StudentDTO[] arr) {

		System.out.println("객체타입 리스트 수집: " + Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println("리스트의 개수: " + arr.length);
		return "ok";
	}

	@ResponseBody
	@PostMapping("/q6")
	public String q6(@RequestBody ArrayList<CarDTO> list) {

		System.out.println("객체타입 리스트 수집: " + list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("리스트 마지막 요소: " + list.get(list.size() - 1));
		return "ok";
	}

}
