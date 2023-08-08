class Student
{
   String name;
   int roll_no;
   int age;
   
   Student()
   {
       System.out.println("Student class Constructor called");
       this.name = "Name";
       this.roll_no = 0;
       this.age = 0;
   }
   Student(int roll_no)
   {
   	this.name = "Name";
       this.roll_no = roll_no;
       this.age = 0;
   }
   void student_info()
   {
       System.out.println("Student name: " + this.name);
       System.out.println("Student roll no: " + this.roll_no);
       System.out.println("Student age: " + this.age);
   }
}
class Constructor_prg {
    
    public static void main(String[] args) {
        Student s1 = new Student(10);
        s1.student_info();
        s1.name = "Karan" ;
        s1.roll_no = 0013;
        s1.age  = 25 ;
               
        s1.student_info();
    }
}