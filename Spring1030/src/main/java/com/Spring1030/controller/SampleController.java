package com.Spring1030.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Spring1030.domain.SampleDTO;
import com.Spring1030.domain.SampleDTOList;
import com.Spring1030.domain.TodoDTO;


@Controller
@RequestMapping("/sample/*")
public class SampleController {
	
	@RequestMapping("")  //위에 requestMappign과 합쳐진다 sample/뒤에 오는것
	public void basic() {
		System.out.println("basic...........");
	}
	
	@RequestMapping(value="/basic", method= {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		System.out.println("basic get................");
	}

	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		System.out.println("basic get only get...............");
	}
	@PostMapping("/basicOnlyGet")
	public void basicGet3() {
		System.out.println("basic get only get...............");
	}
//	@RequestMapping(value="/basicOnlyGet", method=RequestMethod.POST)
//	public void basicGet3(@RequestParam("name") String name) {
//		System.out.println("basic get only get..............." + name);
//	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		System.out.println(" " + dto);
		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam ("name")String name, @RequestParam("age") int age) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		return "ex02";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		System.out.println("ids: " + ids);
		return "ex02List";
	}
	
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		System.out.println("array ids: " + Arrays.toString(ids));
		return "02exArray";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		System.out.println("list dto: " + list);
		return"ex02Bean";
	}
	
//	@InitBinder //들어온 파라미터 수집해서 변환처리
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
//	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		System.out.println("todo: " + todo);
		return "ex03";
	}
	
	@RequestMapping("/modelTest")
	public String home(Model model) {
		model.addAttribute("serverTime", new java.util.Date());
		model.addAttribute("green", "바나나우유");
		//여기세 SampleDTO 객체를 여러개 생성하고 데이터 추가하여 5개정도의 객체를 al에 추가하여 그 데이터를 key와 value로 연결하고
		//model.addAtribute를 이용하고 jstl each문으로 작성하세요
		
		
		ArrayList<SampleDTO> al = new ArrayList<SampleDTO>();
		
		al.add(SampleDTO.builder().name("박성연").age(25).build());
		al.add(SampleDTO.builder().name("Monica").age(24).build());
		al.add(SampleDTO.builder().name("가지가지").age(26).build());
		al.add(SampleDTO.builder().name("박재연").age(20).build());
		al.add(SampleDTO.builder().name("박모니카").age(27).build());
		
		model.addAttribute("al", al);
		
		
		return "modelTest";
	}
	
	//jsp파일을 생성하여 그 파일에서 출력이 되도록
}
