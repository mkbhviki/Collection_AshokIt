package Predicate;

import java.util.function.BiPredicate;

public class Bypredicate {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> bip=(i,j) -> (i+j) >=20;
		System.out.println(bip.test(5, 6));
		System.out.println(bip.test(8, 12));
		System.out.println(bip.test(9, 78));
	}

}
