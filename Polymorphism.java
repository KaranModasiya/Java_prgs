class Polymorphism {
  int n1, n2;
  
  Polymorphism()
  {
    n1 = 0;
    n2 = 0;
  }
  
  void add()
  {
    int sum = n1 + n2;
    System.out.println("num1 + num2 = " + sum);
  }
  
  void add(int n)
  {
    n2 = n;
    int sum = n1 + n2;
    System.out.println("num1 + num2 = " + sum);
  }
  
  void add(int n1, int n2)
  {
    this.n1 = n1;
    this.n2 = n2;
    int sum = this.n1 + this.n2;
    System.out.println("num1 + num2 = " + sum);
  }
  
  public static void main(String args[])
  {
    Polymorphism obj1 = new Polymorphism();
    
    obj1.add();
    obj1.add(5);
    obj1.add(5,10);
    
    obj1.n1 = 15;
    obj1.n2 = 20;
    obj1.add();
  }
}