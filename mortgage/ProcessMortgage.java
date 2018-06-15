/**
 * @author ${chandan sharda , piyush sharma}
 *
 */
import javax.swing.*;

public class ProcessMortgage {

    static Mortgage mortgage [] = new Mortgage[3];
    public static void main(String arg[]){
        String bankName = null;
        int mortgageNumber;
        String customerName;
        double amountOfMortgage;

        int term;

        JOptionPane.showMessageDialog(null,"Enter the three mortgage details ");

        int input = 3;

        while(input-->0) {
            int cases  = Integer.parseInt(JOptionPane.showInputDialog("enter details for "+(input+1)+" mortgage \n"+
                    "select the Loan interest rate \n" +
                    "1. 1% for Business Mortgage\n" +
                    "2. 2% for Personal Mortgage\n" +
                    "0. exit"));
            switch(cases){
                case 1 :  bankName = JOptionPane.showInputDialog("Enter the Bank Name");
                    mortgageNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the Mortgage Number"));
                    customerName = JOptionPane.showInputDialog("Enter your Nmae");
                    amountOfMortgage = Double.parseDouble(JOptionPane.showInputDialog("Enter Mortgate amount or loan amount"));
                    term = getTerm();
                    BusinessMortgage businessMortgage = new BusinessMortgage(bankName,mortgageNumber,customerName,amountOfMortgage,term);
                    mortgage[input] = businessMortgage;
                    break;

                case 2 :  bankName = JOptionPane.showInputDialog("Enter the Bank Name");
                    mortgageNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the Mortgage Number"));
                    customerName = JOptionPane.showInputDialog("Enter your Nmae");
                    amountOfMortgage = Double.parseDouble(JOptionPane.showInputDialog("Enter Mortgate amount or loan amount"));
                    term = getTerm();
                    PersonalMortgage personalMortgage = new PersonalMortgage(bankName,mortgageNumber,customerName,amountOfMortgage,term);
                    mortgage[input] = personalMortgage;
                    break;
                case 0 :
                    return;
                default :
                    JOptionPane.showMessageDialog(null,"Enter the valid Option");
            }
        }
        display();
    }
    public static int getTerm(){
        int term = Integer.parseInt(JOptionPane.showInputDialog("Enter the Loan Period or terms\n" +
                "1. short term (1 Year)\n" +
                "2. Medium term (3 Year)\n" +
                "3 Long term (5 Year)"));
        if(Mortgage.checkTerm(term)){
            return term;
        }else{
            JOptionPane.showMessageDialog(null,"Enter the valid Option");
            return getTerm();
        }
    }
    public static void display(){
        for(Mortgage mort : mortgage){
            JOptionPane.showMessageDialog(null,mort.getMortgageInfo());
        }
    }
}
