package typeinfo.reflection;

/*
 * Exercise 22: (3) Modify SimpleDynamicProxy.java so that it measures method-call
 *	times.
 */

import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;

	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.printf("arguments are %s%n", args);
		System.out.println("**** proxy: " + proxy.getClass() + ", method: "
				+ method + ", args: " + args);
		if (args != null)
			for (Object arg : args)
				System.out.println("  " + arg);
		
		long start = System.nanoTime();
		Object ret = method.invoke(proxied, args);
		long elapsed = System.nanoTime() - start;
		System.out.printf("%nMethod was calling %d ns%n", elapsed);
		return ret;
	}
}

public class Ex_21_SimpleDynamicProxy {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		
		// Insert a proxy and call again:
		Interface proxy = (Interface) Proxy.newProxyInstance(
				Interface.class.getClassLoader(),
				new Class[] { Interface.class }, new DynamicProxyHandler(real));
		
		consumer(proxy);
	}

}
