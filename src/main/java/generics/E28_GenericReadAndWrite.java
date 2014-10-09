package generics;

/*
 * Exercise 28: (4) Create a generic class Generic1<T> with a single method that takes an
 *	argument of type T. Create a second generic class Generic2<T> with a single method that
 *	returns an argument of type T. 
 *   Write a generic method with a contravariant argument of the first
 *	generic class that calls its method. Write a second generic method with a covariant argument of
 *	the second generic class that calls its method. Test using the typeinfo.pets library.
 */

class Generic1<T> {
	void set(T arg) {
	}
}

class Genric2<T> {
	T get() {
		return null;
	}
}

public class E28_GenericReadAndWrite {
	
	static <T> void f1(Generic1<? super T> obj, T item) {
		obj.set(item);
	}

	static <T> T f2(Genric2<? extends T> obj) {
		return obj.get();
	}

	public static void main(String[] args) {
		//Generic1<Rodent> g1 = new Generic1<>();
	}
}
