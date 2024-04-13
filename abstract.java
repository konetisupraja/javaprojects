abstract class Self
{
	abstract void show();
	
	
	
	void print()
	{
System.out.println("print() method");
	}
}

 class Main extends self
{
	 void show()
	{
System.out.println("show() method");
	}
	 
	void display()
	{
System.out.println("display() method");
	}
public static void main(String[] args)
	{
	
	    Main obj = new Main();
	    obj.show();
	    obj.display();
	    obj.print();
	    }
}
	
