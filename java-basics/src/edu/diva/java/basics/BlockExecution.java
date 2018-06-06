package edu.diva.java.basics;

class OBE {
	static {
		System.out.println("outer clas loaded");
	}
	{
		System.out.println("out instance created");
	}
	
	public static class IBE {
		static {
			System.out.println("inner static loaded");
		}
		{
			System.out.println("inner instance created");
		}
	}
}

public class BlockExecution {
public static void main(String[] args) throws ClassNotFoundException {
	//Class.forName("edu.diva.java.basics.OBE");
	OBE ob = new OBE();
	OBE.IBE ib = new OBE.IBE();
	
}
}
