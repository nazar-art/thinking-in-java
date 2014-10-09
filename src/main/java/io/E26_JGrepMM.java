package io;

//: io/E26_JGrepMM.java
//{Args: ./src/io/E26_JGrepMM.java \b[Ssct]\w+ }
/********************** Exercise 26 *********************
 * Modify strings/JGrep.java to use Java nio memory-mapped
 * files.
 ********************************************************/
import java.io.*;
import java.util.regex.*;
import java.nio.channels.*;
import java.nio.*;
import java.nio.charset.*;

import static net.mindview.util.Print.*;

public class E26_JGrepMM {
	public static void main(String[] args) throws Exception {
		
		if (args.length < 2) {
			print("Usage: java E26_JGrepMM file regex");
			System.exit(0);
		}
		
		Pattern p = Pattern.compile(args[1]);
		
		@SuppressWarnings("resource")
		FileChannel fc = new FileInputStream(args[0]).getChannel();
		ByteBuffer buffer = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
		CharBuffer cb = Charset.forName(System.getProperty("file.encoding")).decode(buffer);
		
		String[] fileAsArray = cb.toString().split("\n");
		int index = 0;
		Matcher m = p.matcher("");
		for (String line : fileAsArray) {
			m.reset(line);
			while (m.find())
				print(index++ + ": " + m.group() + ": " + m.start());
		}
		fc.close();
	}
}
