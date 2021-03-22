package _06_duck;

public class DuckRunner {
public static void main(String[] args) {
	Duck daffy = new Duck("donuts", 5);
	daffy.quack();
	daffy.waddle();
	Cat c = new Cat("Polly", 15);
	c.meow();
	c.leap();
}
}
