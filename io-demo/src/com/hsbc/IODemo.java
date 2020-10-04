package com.hsbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("demo.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int fileCounter = 0;
			int bufferCounter = 0;
			int c = 0;
//			while((c = fileReader.read()) != -1) {
//				fileCounter++;
//				System.out.print((char)c);
//			}
//			System.out.println();
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				bufferCounter++;
				System.out.println(line);
			}
			System.out.println("File Counter: "+fileCounter);
			System.out.println("Buffer Counter: "+bufferCounter);
			bufferedReader.close();
			fileReader.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
