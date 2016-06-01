package com.acadgild.buildings;

public class BuildingOne extends BuildingInfo{

	
	public void buildingOne(){
		color = "RED";
		name = "First Building";
		size = 20;
		numOfPeople = 3000;
		
		System.out.println(" The color is " + color);
		System.out.println(" The name is " + name);
		System.out.println(" The occupency is " + numOfPeople);
		System.out.println(" The size is " + size);
		
	}
}