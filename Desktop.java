package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("Desktop Size is Huge");
	}
	
	public static void main(String[] args) {
		
		Desktop D1 = new Desktop();
		Computer C1 = new Computer();
		D1.desktopSize();
		C1.computerModel();
		
	}

}
