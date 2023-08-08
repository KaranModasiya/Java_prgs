class Animal{
	void sound()
	{
		System.out.println("Sound of animal.");
	}
}
class Dog extends Animal{
	@Override
	void sound()
	{
		System.out.println("Barking..");
	}
}
class Overriding{
	public static void main(String args[]){
		Dog d = new Dog();
		d.sound();
	}
}