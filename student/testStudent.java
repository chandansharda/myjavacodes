import java.util.Scanner;

public class testStudent
{
    public static void main(String[] args)
    {
        System.out.println("Please select the Course type \n 1. Full Time \n 2. Part Time");
        Student1 student;
        Scanner input = new Scanner(System.in);
        String str = input.next();

        if(str.equals("1")){
            student = new FullTimeStudent("Full Time");
            student.calculateFee();
        }
        else if(str.equals("2")){
            student = new PartTimeStudent("Part Time");
            student.calculateFee();
        }
        else {
            System.out.println("Invalid Selection type it should be either 1 or 2");
        }
    }
}


/**
 * @author ${chandan sharda , piyush sharma}
 *
 */