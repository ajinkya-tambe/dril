import java.util.*;

abstract class Marks
{
    abstract double getPercentage();
}

class A extends Marks
{
	double marks1,marks2,marks3;
	A(double marks1,double marks2,double marks3)
	{
		this.marks1= marks1;
		this.marks2= marks2;
		this.marks3= marks3;
    	}

    	double getPercentage() 
	{
		return (marks1+marks2+marks3)/3;
    	}
}

class B extends Marks
{
	double marks1,marks2,marks3,marks4;
	B(double marks1,double marks2,double marks3,double marks4)
	{
		this.marks1= marks1;
		this.marks2= marks2;
		this.marks3= marks3;
		this.marks4 = marks4;
    	}
	double getPercentage() 
	{
		return (marks1+marks2+marks3+marks4)/4;
    	}
}

public class CalculatePercentage 
{
	public static void main (String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		A a = new A(90, 90, 90);
        	double aMarks = a.getPercentage();
        	B b = new B(10, 10, 10, 20);
        	double bMarks = b.getPercentage();
        	System.out.println(aMarks + " " + bMarks);

    	}
}
