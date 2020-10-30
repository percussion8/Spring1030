package com.Spring1030.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SampleDTO {
	
	public SampleDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;
	
//	public static SampleDTOBuilder builder() {
//        
//        return SampleDTOBuilder();
//    }
}
