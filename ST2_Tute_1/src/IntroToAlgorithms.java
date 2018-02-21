//Christian Westenfelder
//20/02/2018 | University of Canberra
//Initial Introduction Week 1 Tutorial

import java.util.*;

public class IntroToAlgorithms {
	
	public static void main(String []args) {
		System.out.println("Intro to Algorithms");
		Scanner in = new Scanner(System.in);
		System.out.print("Please insert the first number: "); int x = in.nextInt();
		System.out.print("Please insert the second number: "); int y = in.nextInt();
		System.out.print("The Sum of the two numbers is = "); int z = sum(x, y);
		System.out.println(z);
	}
	
	static int sum(int a, int b){
		return (a + b);
	}
}
