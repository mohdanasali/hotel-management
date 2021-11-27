import java.util.Scanner;
class practise{
public static void main(String[]args)
{
int a;
int b;
int res;
Scanner sc=new Scanner(System.in);
System.out.print("enter the value of a=>");
a=sc.nextInt();
System.out.print("enter the value of b=>");
b=sc.nextInt();
try{
res=a/b;
System.out.println(res);
}
catch(ArithmeticException e)
{
System.out.println("you are tying to divide the value by zero");
}
finally{
System.out.println("finally block executed");
}
}
}