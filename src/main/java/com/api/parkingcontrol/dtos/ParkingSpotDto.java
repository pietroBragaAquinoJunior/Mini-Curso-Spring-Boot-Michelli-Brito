package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ParkingSpotDto {
	@NotBlank
	@Size(max = 10)
	private String parkingSpotNumber;
	@NotBlank
	@Size(max = 7)
	private String licensePlateCar;
	@NotBlank
	@Size(max = 70)
	private String brandCar;
	@NotBlank
	@Size(max = 70)
	private String modelCar;
	@NotBlank
	@Size(max = 70)
	private String colorCar;
	@NotBlank
	@Size(max = 130)
	private String responsibleName;
	@NotBlank
	@Size(max = 30)
	private String apartment;
	@NotBlank
	@Size(max = 30)
	private String block;
}
