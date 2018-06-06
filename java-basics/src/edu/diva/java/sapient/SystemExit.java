package edu.diva.java.sapient;

public class SystemExit {
	public static void main(String[] args) {
		SystemExit se = new SystemExit();
		int i = se.check();
		System.out.println(i);
	}
	
	int check() {
		try {
			System.out.println("try");
			return 1;
		} catch(Exception e) {
			System.out.println("cathc");
			return 2;
		} finally {
			System.exit(0);
			System.out.println("finally");
			return 3;
		}
	}
}
