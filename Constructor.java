import java.io.*;
public class Main
{
int x;
public Main()
{
System.out.println("Default constructor");
x=1;
}
public Main(int x)
{
System.out.println("Parameterized constructor");
this.x=x;
}
public Main(Main t)
{
System.out.println("Copy constructor");
this.x=t.x;
}

void show()
{
System.out.println("X: "+x);
}

public static void main(String args[])
{
	Main t1=new Main();
	Main t2=new Main(23);
	Main t3=new Main(t2);
	t1.show();
	t2.show();
	t3.show();
}
}
