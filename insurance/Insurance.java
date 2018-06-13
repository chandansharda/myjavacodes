abstract class Insurance
{

    public String insuranceType;
    public double monthlyCost;

    public Insurance(String insuranceType)
    {
        this.insuranceType = insuranceType;
    }

    public abstract void setInsuranceCost();

    public abstract void displayInfo();
}


class Health extends Insurance
{
    public Health(String insuranceType)
    {
        super(insuranceType);
        setInsuranceCost();
    }

    @Override
    public void setInsuranceCost()
    {
        this.monthlyCost = 100;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("InsuranceType : "+insuranceType+"\nMonthly Price "= monthlyCost);
    }

}

class Life extends Insurance
{

    public Life(String insuranceType)
    {
        super(insuranceType);
        setInsuranceCost();
    }

    @Override
    public void setInsuranceCost()
    {
        this.monthlyCost = 50;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("InsuranceType : "+insuranceType+"\nMonthly Price "= monthlyCost);
    }

}


/**
 * @author ${chandan sharda}
 *
 */
