package com.tnsif.ExceptionHandling.checked;

public class CheckedexceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		CheckedException.acceptText();
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

}
}
