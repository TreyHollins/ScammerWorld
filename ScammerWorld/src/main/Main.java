/*
 * David Hollins
 * 2/25/2020
 */
package main;

import java.util.ArrayList;
import java.util.Collections;

import people.Victim;

public class Main {

	public static void main(String[] args) {
		ArrayList<Victim> v = new ArrayList<Victim>();
		
		v.add(new Victim("Jenny", 800000.00));
		v.add(new Victim("John", 500000.00));
		v.add(new Victim("Jack", 1000.00));
		
		Collections.sort(v);
		
		for (int i = 0; i < v.size(); i++) {
			Victim tmp = v.get(i);
			System.out.println(tmp.getName() + ":" + tmp.getAmountScammed());
		}

	}
}