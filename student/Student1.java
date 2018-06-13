import java.util.Scanner;

/**
 * @author ${chandan sharda}
 *
 */
abstract class Student1
{
    public String name;
    public boolean value = false;
    public int credits;
    public double fee;


    public final double COST_PER_CREDIT_HOUR = 100.00;

    public Student1(String name)
    {
        this.name = name;
    }


    public abstract void calculateFee();
    public abstract void setFee();


    public int takeInput()
    {
        Scanner s = new Scanner(System.in);

        System.out.println(" Enter the Credits Hour");
        credits = s.nextInt();
        return credits;
    }
}


class FullTimeStudent extends Student1 {
    public FullTimeStudent(String name) {
        super(name);
        setFee();
    }

    @Override
    public void setFee() {
        value = true;
        this.fee = 2000.00;
    }

    @Override
    public void calculateFee() {

        if(value == true) {
            System.out.println("Your Full time fees is " + fee + " and your course status is running ");
        }
        else {
            System.out.println("Your Full time fees is " + fee + " and your course status is stoped ");
        }

    }
}


    class PartTimeStudent extends Student1 {
        public PartTimeStudent(String name) {
            super(name);
            setFee();
        }

        @Override
        public void setFee() {
            this.fee = takeInput() * COST_PER_CREDIT_HOUR;
        }

        @Override
        public void calculateFee()
        {
            System.out.println("Your Part Time Fees for " +credits +" hour is = " +fee);
        }
    }
