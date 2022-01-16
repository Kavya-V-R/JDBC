package com.xworkz.Map;

import java.util.Map;
import java.util.TreeMap;

public class OccuranceOfLetter {
	public static void main(String args[]) {
		String name = "kavya";
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		char[] charArray = name.toCharArray();
		for (char letter : charArray) {
			if (map.containsKey(letter)) {
				Integer value = map.get(letter);
				value++;
				map.put(letter, value);

			} else {
				map.put(letter, 1);
			}
		}
		System.out.println(map);
	}
}
