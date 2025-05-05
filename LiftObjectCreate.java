package com.liftprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class LiftObjectCreate {

	Scanner scan = new Scanner(System.in);

	ArrayList<Lift> liftObject = new ArrayList();

	public ArrayList<Lift> addLift(int count) {
		int id = 0;
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter " + i + " Lift id : ");
			id = scan.nextInt();
			liftObject.add(new Lift(id));
		}
		return liftObject;
	}
}
