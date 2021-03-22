package _06_duck;

public class Cat {
	int age;
	String name;

	Cat(String name, int age) {
		this.age = age;
		this.name = name;
	}

	void meow() {
		System.out.println("Meow!");
	}

	void leap() {
		System.out.println("The Cat Leaps");
	}
}
