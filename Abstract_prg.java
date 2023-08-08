abstract class Animal{
	abstract void sound();
}
class Dog extends Animal{
	void sound()
	{
		System.out.println("Barking..");
	}
}
class Abstract_prg{
	public static void main(String args[]){
		Dog d = new Dog();
		d.sound();
	}
}