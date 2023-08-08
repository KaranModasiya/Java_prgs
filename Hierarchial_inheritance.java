class Animal{
	void eat()
	{
		System.out.println("Eating..");
	}
}
class Dog extends Animal{
	void sound()
	{
		System.out.println("Woof woof..");
	}
}
class Cat extends Animal{
	void sound()
	{
		System.out.println("Meow meow..");
	}
}
public class Hierarchial_inheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sound();

		Cat c = new Cat();
		c.eat();
		c.sound();
	}
}