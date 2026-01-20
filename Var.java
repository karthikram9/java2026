public class Var
{
    public static void main(String args[])
    {
        //primitive data types
        int year=202;
        int age=25;
        int dob=2006;

        double price=45.8;
        double discount=9.3;
        double salestax=1.4;

        char grade='R';
        char currency='r';
        char Symbol='$';

        boolean isSale=false;
        boolean isStudent=true;
        boolean isRaider=true;
        if(isRaider)
        {
                 System.out.println("im a raider damn idiot");
        }
        else
        {
                    System.out.println("must be a raider fish");
        }
       
        System.out.println("my age is : "+age);
        System.out.println("my dob is : "+dob);
        System.out.println("this year is : "+year);
        System.out.println(" price is : "  +  Symbol + " "+ price );

        //reference data types
        String name ="karthik ram";
        String phno="6303062005";
        String email="fake123l@gmail.com";

        System.out.println("my name is : "+name);
        System.out.println("my phone number is : "+phno);
        System.out.println("my email is : "+email);
    }
}