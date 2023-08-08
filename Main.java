class Student
{
	String name;
	int roll_no;
	int age;

	void student_info()
	{
		System.out.println("Student name: " + this.name);
		System.out.println("Student roll no: " + this.roll_no);
		System.out.println("Student age: " + this.age);
	}
}
class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Karan" ;
		s1.roll_no = 0013;
		s1.age  = 25 ;

		s1.student_info();
	}
}