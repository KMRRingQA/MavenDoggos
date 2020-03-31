package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class DoggoCompetition {
	public static List<String> placement(int num1) {
		List<String> placementList = new ArrayList<>();
		String place = "";
		for (int i = 1; i < 101; i++) {
			if (i == 11 || i == 12) {
				place = i + "th";
			} else if (i % 10 == 1) {
				place = i + "st";
			} else if (i % 10 == 2) {
				place = i + "nd";
			} else if (i % 10 == 3) {
				place = i + "rd";
			} else {
				place = i + "th";
			}
			placementList.add(place);
		}
		for (int i = 0; i < 100; i++) {
			if (i == num1 - 1) {
				System.out.print("\t");
				continue;
			}
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(placementList.get(i) + "\t");
		}
		placementList.remove(num1 - 1);
		return placementList;
	}

}
