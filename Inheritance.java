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
class Inheritance{
	public static void main(String args[]){
		Dog d = new Dog();
		d.eat();
		d.sound();
	}
}