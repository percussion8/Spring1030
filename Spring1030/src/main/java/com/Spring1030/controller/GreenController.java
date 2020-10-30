package com.Spring1030.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Spring1030.domain.GreenDTO;
import com.Spring1030.domain.SampleDTO;

@Controller
@RequestMapping("/green/*")
public class GreenController {
	
	@GetMapping("/test")
	public String test1(Model model) {
		//test1
		GreenDTO g1 = new GreenDTO("미슐랭", "경기버스", 2);
		GreenDTO g2 = new GreenDTO("금호", "마을버스", 1);
		GreenDTO g3 = new GreenDTO("신발보다", "시내버스", 3);
		GreenDTO g4 = new GreenDTO("싸다", "순환버스", 10);
		GreenDTO g5 = new GreenDTO("앗!타이어", "셔틀버스", 7);
		ArrayList<GreenDTO> test1 = new ArrayList<GreenDTO>();
		test1.add(g1);
		test1.add(g2);
		test1.add(g3);
		test1.add(g4);
		test1.add(g5);
		model.addAttribute("test1", test1);
		
		
		//test2
		GreenDTO g6 = new GreenDTO().setTire("미슐랭").setBus("경기버스").setTank(2);
		GreenDTO g7 = new GreenDTO().setTire("금호").setBus("마을버스").setTank(1);
		GreenDTO g8 = new GreenDTO().setTire("신발보다").setBus("시내버스").setTank(3);
		GreenDTO g9 = new GreenDTO().setTire("싸다").setBus("순환버스").setTank(10);
		GreenDTO g10 = new GreenDTO().setTire("앗!타이어").setBus("셔틀버스").setTank(7);
		ArrayList<GreenDTO> test2 = new ArrayList<GreenDTO>();
		test2.add(g6);
		test2.add(g7);
		test2.add(g8);
		test2.add(g9);
		test2.add(g10);
		model.addAttribute("test2", test2);
		
		
		
		//test3
		String[] tires = {"미슐랭", "금호", "신발보다", "싸다", "앗!타이어"};
		String[] buses = {"경기버스", "마을버스", "시내버스", "순환버스", "셔틀버스"};
		int[] tanks = {2,1,3,10,7};
		ArrayList<GreenDTO> test3 = new ArrayList<GreenDTO>();
		
		for(int i=0; i<tires.length; i++) {
			GreenDTO dto = new GreenDTO();
			dto.setTire(tires[i]).setBus(buses[i]).setTank(tanks[i]);
			test3.add(dto);
		}
		model.addAttribute("test3", test3);
		
		
		//test4
		ArrayList<GreenDTO> test4 = new ArrayList<GreenDTO>();
		
		test4.add(GreenDTO.builder().tire("미슐랭").bus("경기버스").tank(2).build());
		test4.add(GreenDTO.builder().tire("금호").bus("마을버스").tank(1).build());
		test4.add(GreenDTO.builder().tire("신발보다").bus("시내버스").tank(3).build());
		test4.add(GreenDTO.builder().tire("싸다").bus("순환버스").tank(0).build());
		test4.add(GreenDTO.builder().tire("앗!타이어").bus("셔틀버스").tank(7).build());
		
		model.addAttribute("test4", test4);
		
		
		
		
		
		
		return "green";
	}
	
	
	@GetMapping("/test2")
	public String test2(Model model) {
		GreenDTO g1 = new GreenDTO().setTire("미슐랭").setBus("경기버스").setTank(2);
		GreenDTO g2 = new GreenDTO().setTire("금호").setBus("마을버스").setTank(1);
		GreenDTO g3 = new GreenDTO().setTire("신발보다").setBus("시내버스").setTank(3);
		GreenDTO g4 = new GreenDTO().setTire("싸다").setBus("순환버스").setTank(10);
		GreenDTO g5 = new GreenDTO().setTire("앗!타이어").setBus("셔틀버스").setTank(7);
		model.addAttribute("g1", g1);
		model.addAttribute("g2", g2);
		model.addAttribute("g3", g3);
		model.addAttribute("g4", g4);
		model.addAttribute("g5", g5);
		
		
		return "green";
	}
	
	@GetMapping("/test3")
	public String test3(Model model) {
		String[] tires = {"미슐랭", "금호", "신발보다", "싸다", "앗!타이어"};
		String[] buses = {"경기버스", "마을버스", "시내버스", "순환버스", "셔틀버스"};
		int[] tanks = {2,1,3,10,7};
		
		for(int i=0; i<tires.length; i++) {
			GreenDTO dto = new GreenDTO();
			dto.setTire(tires[0]).setBus(buses[0]).setTank(tanks[0]);
			model.addAttribute("g"+(i+1), dto);
		}
		return "green";
	}
	
	
	@RequestMapping("/test4")
	public String test4(Model model) {
		
		ArrayList<GreenDTO> dtos = new ArrayList<GreenDTO>();
		
		dtos.add(GreenDTO.builder().tire("미슐랭").bus("경기버스").tank(2).build());
		dtos.add(GreenDTO.builder().tire("금호").bus("마을버스").tank(2).build());
		dtos.add(GreenDTO.builder().tire("신발보다").bus("시내버스").tank(2).build());
		dtos.add(GreenDTO.builder().tire("싸다").bus("순환버스").tank(2).build());
		dtos.add(GreenDTO.builder().tire("앗!타이어").bus("셔틀버스").tank(2).build());
		
		model.addAttribute("dtos", dtos);
		
		
		return "green1";
	}

}
