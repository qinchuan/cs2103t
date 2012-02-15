package team34;

import team34.student.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		Student stu = new Student();
		
		Faciliator f=stu;
		f.quitEvent(f, 1);
		System.out.println("haha");
	}

}
