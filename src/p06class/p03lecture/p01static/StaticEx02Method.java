package p06class.p03lecture.p01static;

public class StaticEx02Method {

	public static void main(String[] args) {
		
		Class02.method2();
		System.out.println(Math.random());
		//인스턴스가 있어야만 올바르게 된다
		Class02 c1 = new Class02();
		c1.method1();
	}
}


class Class02{
	
	void method1() {
		System.out.println("인스턴스 메소드");
	}
	
	static void method2() {
		System.out.println("스태틱 메소드");
	}
}