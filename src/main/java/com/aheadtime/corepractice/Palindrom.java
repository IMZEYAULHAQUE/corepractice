package com.aheadtime.corepractice;

import java.util.HashMap;
import java.util.Map;

public class Palindrom {
	
	public static void main(String[] args) {
		System.out.println(getPalindrom("AABBCCCdf"));
	}

	public static String getPalindrom(String str) {
		char[] arr = str.toCharArray();
		Map<String, Integer> map = new HashMap<>();
		Integer count = null;
		for (char c : arr) {
			count = map.get(String.valueOf(c));
			if (count != null) {
				count++;
			} else {
				count = 1;
			}
			map.put(String.valueOf(c), count);
		}

		boolean isPalindrom = true;
		String singleOccurence = null;
		String prefix = "";
		String postfix = "";

		for (String key : map.keySet()) {

			count = map.get(key);

			if ((count % 2) == 1) {
				if (singleOccurence == null) {
					singleOccurence = key;

					for (int i = 0; i < count / 2; i++) {
						prefix += key;
						postfix = key + postfix;
					}

				} else {
					isPalindrom = false;
					break;
				}

			} else {
				for (int i = 0; i < count / 2; i++) {
					prefix += key;
					postfix = key + postfix;

				}
			}

		}

		if (isPalindrom) {

			return prefix + (singleOccurence == null ? "" : singleOccurence) + postfix;

		}

		else {
			return null;
		}

	}

}
