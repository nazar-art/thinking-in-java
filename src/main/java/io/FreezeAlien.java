package io;

//: io/Alien.java
//A serializable class.
import java.io.*;

@SuppressWarnings("serial")
class Alien implements Serializable {
} 

public class FreezeAlien {
	
	public static void main(String[] args) throws Exception {
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream(Location.LOC + "X.file"));
		Alien quellek = new Alien();
		out.writeObject(quellek);
		out.close();
	}
}
