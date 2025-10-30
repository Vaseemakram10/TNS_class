package com.tnsif.ExceptionHandling.checked;

import java.io.*;

public class CheckedException {
		// TODO Auto-generated method stub
		static String acceptText( ) throws IOException {
		BufferedReader br = null;// read data of char, array, lines 
		InputStreamReader isr=new InputStreamReader(System.in);
			String s= br.readLine();
			return s.toString();
		}
}
