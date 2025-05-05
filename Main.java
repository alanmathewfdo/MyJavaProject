package com.liftprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Lift> liftObject = new ArrayList<Lift>();
		LiftObjectCreate lo = new LiftObjectCreate();
		LiftServiceImp liftService = new LiftServiceImp();
		System.out.println("Enter number of Lifts : ");
		int liftCount = scan.nextInt();
		liftObject = lo.addLift(liftCount);
		for(Lift i : liftObject) {
			liftService.moveTo(i,true);
		}
		
	}
}