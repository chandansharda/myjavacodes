/**
 * @author ${chandan sharda , piyush sharma}
 *
 */

abstract class Mortgage implements MortgageConstants{

    String bankName = null;
    int mortgageNumber;
    String customerName;
    double amountOfMortgage;
    double interestRate;
    int term;
    double totalAmount;


    public Mortgage(String bankName, int mortgageNumber, String customerName, double amountOfMortgage, double interestRate, int term) {
        this.bankName = bankName;
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.amountOfMortgage = amountOfMortgage;
        this.interestRate = interestRate;
        this.term = term;
        setTotalAmount(amountOfMortgage,interestRate,term);
    }
    public void setTotalAmount(double amountOfMortgage,double interestRate,int term){
        this.totalAmount = amountOfMortgage;
        for(int i=0;i<term;i++){
            totalAmount += amountOfMortgage*interestRate;
        }
    }
    public String getMortgageInfo(){
        return "Bank Name "+bankName +
                "\n Mortgage Number "+mortgageNumber+
                "\n Name "+customerName+
                "\n Amount Of Mortgage "+amountOfMortgage+
                "\n Interest Rate "+interestRate+
                "\n Years of the Mortgage Or Term "+term+
                "\n Total Amount "+totalAmount;
    }
    public static boolean checkTerm(int term){
        if(term>=shortTerm&&term<=longTerm){
            return true;
        }
            return false;
    }
    public boolean checkMaxAmount(int amount){
        if(amount<=300_000&&amount>0){
            return true;
        }
        return false;
    }
}
