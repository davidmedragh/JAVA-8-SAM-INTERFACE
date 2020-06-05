package com.dmedragh.tutorials;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void afficheMessage(SamInterface samInterface) {
		samInterface.declenche("coucou les lambda");

		
	}
	public static void main(String[] args) {
		
		afficheMessage(new SamInterfaceImpl());
		afficheMessage(s -> System.out.println(s));
		MaFrame f = new MaFrame();
		

	}
	
	

}
