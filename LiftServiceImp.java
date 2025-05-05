package com.liftprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LiftServiceImp implements LiftService {
	Scanner scan = new Scanner(System.in);
	HashSet<Integer> select;

	@Override
	public void moveTo(Lift lift, boolean click) {
		select = new HashSet<Integer>();
		if (click == true) {
			click(lift);
			up(lift, select);
			
		} else {
			System.out.println("button Not clicked");
		}

	}

	@Override
	public void moveTo(Lift lift) {
		lift.setCurrentPostion(0);
		System.out.println("lift moved to 0th floor");
	}

	@Override
	public void liftTurnOn(Lift lift) {
		System.out.println("Lift Turned On");
		lift.setCurrentPostion(0);
		System.out.println("lift in zeroth floor");
	}

	@Override
	public void liftTurnOff(Lift lift) {
		System.out.println("Lift turned off");
	}

	public void click(Lift lift) {
		System.out.println("Enter Floor Numbers");
		int len =lift.getPeopleCount();
		System.out.println(len);
		for (int i = 0; i < len; i++) {
			 int a = scan.nextInt();
    		select.add(a);
		}
	}
	
	private void up(Lift lift, HashSet<Integer> select) {
		for(int i : select) {
			System.out.println("lift stoped floor No : "+i);
		}
		 List<Integer> list = new ArrayList<>(select);
		lift.setLastPostion(list.get(list.size() - 1));
	}
	
	private void down(Lift lift, HashSet<Integer> select) {
		List<Integer> list = new ArrayList<>(select);
		Collections.reverse(list);
		for(int i : select) {
			System.out.println("lift stoped floor No : "+i);
		}
		lift.setLastPostion(list.get(list.size() - 1));
		select.clear();
	}

}
