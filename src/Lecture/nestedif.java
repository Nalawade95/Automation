package Lecture;

public class nestedif {
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = 8;
		if(a>b)
		{
		     if(a>c)
		    {
			System.out.println("a is bigger");
		    }
		     else
		     {
		    	 System.out.println("c is bigger");
		     }
		}
	else
		{
			if(b>c)
			{
				System.out.println("b is bigger");
			}
			 else
			 {
				 System.out.println("c is bigger");
			 }
			 }
			}
}
