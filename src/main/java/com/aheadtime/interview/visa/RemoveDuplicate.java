package com.aheadtime.interview.visa;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		System.out.println("Hello Java");
	}

	public Integer[] removeDuplicate(Integer[] arr) {

		if (arr != null && arr.length > 1) {

			Set<Integer> unique = new LinkedHashSet<>(arr.length);

			for (int i = 0; i < arr.length; i++) {

				unique.add(i);

			}

			return (Integer[]) unique.toArray();

		}

		return arr;

	}
	
	// rest components
	// spring rest, data, hibernate, 
	// data center running oracle
	// maven,war, tomcat, 
	
	// main component : OAuth, Authorization and Authentiation, OIDC, 

}
