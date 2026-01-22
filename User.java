import java.util.Scanner;
public class User
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name : ");
        String name =sc.nextLine();
        System.out.print("\nEnter your age : ");
        int age =sc.nextInt();
        System.out.print("\nEnter your cgpa :");
        double gpa =sc.nextDouble();

        
        System.out.println("hi  "+name );
        System.out.println("you are "+age+"years old now!");
        System.out.println("your gpa is: "+gpa);

        sc.close();

    }
}