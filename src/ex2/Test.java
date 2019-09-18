package ex2;

public class Test {

	public static void main(String[] args) {
		
		B b=new B();
		b.m1();
		b.m1();   //m1==B
		b.m2();   //m2==A
		b.m3();	  //m3==B
		
		/*System.out.println("================");
		A a=new A();
		a.m1();
		a.m2();*/
		
		/*A a=new B();
		a.m1();
		a.m2();
		*/
		
		
	}
	
}
