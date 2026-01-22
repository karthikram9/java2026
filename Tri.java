import java.util.Scanner;
    public class Tri
    {
        public static void main(String args[])
        {
            //area of a triangle
            Scanner sc =new Scanner(System.in);
            double height =0;
            double width =0;
            double area=0;

            System.out.print("Enter height of triangle: ");
            height = sc. nextDouble();
            System.out.print("Enter width of triangle: ");
            width = sc. nextDouble();

            area = (height *width);

            System.out.println("Area is : "+area);

            sc.close();
            

        }
    }