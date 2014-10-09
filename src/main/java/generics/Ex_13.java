package generics;

import generics.coffee.Sweets;
import generics.coffee.CandiesGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/*
 * Exercise 13: (4) Overload the fill( ) method so that the arguments and return types are
 *	the specific subtypes of Collection: List, Queue and Set. This way, you don’t lose the type
 * 	of container. Can you overload to distinguish between List and LinkedList?
 */

class Generators {
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen,
			int n) {
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}

	public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			list.add(gen.next());
		return list;
	}

	public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			queue.add(gen.next());
		return queue;
	}

	public static <T> Set<T> fill(HashSet<T> set, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++)
			set.add(gen.next());
		return set;
	}
}

public class Ex_13 {
	public static void main(String[] args) {
		// Collection<Character> coffee = Generators.fill(new
		// ArrayList<Character>(),
		// new CountingGenerator.Character(), 4);
		// for (Character c : coffee)
		// System.out.println(c);
		// Collection<Integer> fnumbers = Generators.fill(new
		// ArrayList<Integer>(),
		// new Fibonacci(), 12);
		// for (int i : fnumbers)
		// System.out.print(i + ", ");

		List<Sweets> coffeeList = Generators.fill(new ArrayList<Sweets>(),
				new CandiesGenerator(), 4);
		for (Sweets c : coffeeList)
			System.out.println(c);
		System.out.println();
		
		Queue<Integer> iQueue = Generators
				.fill((Queue<Integer>) new LinkedList<Integer>(),
						new Fibonacci(), 12);
		for (int i : iQueue)
			System.out.print(i + " ");
		System.out.println();
		
		Set<Boolean> bSet = Generators.fill(new HashSet<Boolean>(),
				new CountingGenerator.Boolean(), 10);
		for (Boolean b : bSet)
			System.out.println(b);
	}

}
