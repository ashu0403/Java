
public class SavingAccount extends Account implements AccountInterface{
    public SavingAccount() {
    }

    @Override
    public float getInterest(Account source){
        return ((float)source.balance)*super.interest/100;
    }


}
