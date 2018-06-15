/**
 * @author ${chandan sharda , piyush sharma}
 *
 */
public class PersonalMortgage extends Mortgage {
    public PersonalMortgage(String bankName,int mortgageNumber, String customerName, double amountOfMortgage, int term) {
        super(bankName,mortgageNumber, customerName, amountOfMortgage, 0.02, term);
    }
}
