package com.liftprogram;

import java.util.Scanner;

public class Lift {

	private int totalFloor;
	private int peopleCount;
	private int currentPostion = 0;
	private int lastPostion;
	private final int leftId;
	
	Scanner scanner = new Scanner(System.in);
	public Lift(int leftId) {
		this.leftId = leftId;
		System.out.println("Enter the Number of people");
		
		peopleCount = scanner.nextInt();
		
		while(true) {
			if(peopleCount <= 7) {
				break;
			}else {
				System.out.println("Enter less then eight people only allowed.");
				peopleCount = scanner.nextInt();
			}
				
		}
	}
	public int getFirstfloorNo() {
		return totalFloor;
	}
	public void setFirstfloorNo(int totalFloor) {
		this.totalFloor= totalFloor;
	}
	public int getPeopleCount() {
		return peopleCount;
	}
	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	public int getCurrentPostion() {
		return currentPostion;
	}
	public void setCurrentPostion(int currentPostion) {
		this.currentPostion = currentPostion;
	}
	public int getLastPostion() {
		return lastPostion;
	}
	public void setLastPostion(int lastPostion) {
		this.lastPostion = lastPostion;
	}
	public int getLeftId() {
		return leftId;
	}	
}
