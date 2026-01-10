package access_Specifier_Study;

public class Overloading_concept_test {

	public static void main(String[] args) {

		Overloading_concept_test ob1 = new Overloading_concept_test();

		ob1.m1();
		m1(456); // ob1.m1(234345);
		ob1.m1(1.22f);

	}
	public void m1() {

		System.out.println("Hi m1 non static method from Overloading_concept_test class");
	}
	public static void m1(int i) {

		System.out.println("Hi m1 static method with 1 paramwter from Overloading_concept_test class");
	}
	public float m1(float k) {

		System.out.println("Hi m1 non static method with some return type from Overloading_concept_test class");
		return k;

	}

}
