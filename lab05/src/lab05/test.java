package lab05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		// set for store both file
		ArraySet<String> setA = new ArraySet<>();
		ArraySet<String> setB = new ArraySet<>();
		// create a scanner for scanning a file by line 
		Scanner s;
		try {
			s = new Scanner(new File(args[0]));
			while (s.hasNextLine()) {
				String str = s.nextLine(); 
				// get all the line in scanner
//				System.out.println(str);
				setA.add(str);
			}
			s = new Scanner(new File(args[1]));
			while (s.hasNextLine()) {
				String str = s.nextLine(); 
				// get all the line in scanner
//				System.out.println(str);
				setB.add(str);
			}
			
			System.out.println("Union of Set A and B: "+ setA.union(setB));
			System.out.println("Intersection of Set A and B: "+ setA.intersection(setB));
			System.out.println("Is Set A a subset of B: "+ setA.is_subset_of(setB));
			System.out.println("Is Set B a subset of A: "+ setB.is_subset_of(setA));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
