package com.Spring1030.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GreenDTO {
	
	public GreenDTO() {};
	
	public GreenDTO(String tire, String bus, int tank) {
		this.tire = tire;
		this.bus = bus;
		this.tank = tank;
	}
	
	public GreenDTO setTire(String tire) {
		this.tire = tire;
		return this;
	}
	public GreenDTO setBus(String bus) {
		this.bus = bus;
		return this;
	}
	public GreenDTO setTank(int tank) {
		this.tank = tank;
		return this;
	}
	

	private String tire;
	private String bus;
	private int tank;
	
	

}
