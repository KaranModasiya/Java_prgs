class Animal{
	void eat()
	{
		System.out.println("Eating..");
	}
}
class Dog extends Animal{
	void sound()
	{
		System.out.println("Barking..");
	}
}
class Bulldog extends Dog{
	void info()
	{
		System.out.println("They bark very rarely.");
	}
}
class Cat extends Animal{
	void sound()
	{
		System.out.println("Meow meow..");
	}
}
class Hybrid_inheritance{
	public static void main(String args[]){
		Bulldog d = new Bulldog();
		d.eat();
		d.sound();
		d.info();

		Cat c = new Cat();
		c.eat();
		c.sound();
	}
}