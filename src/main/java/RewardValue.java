public class RewardValue {
    //RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    //RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    //RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    //RewardValue must convert from miles to cash at a rate of 0.0035.
private final double cashValues;
private final int milesValue;
public static final double MilesToCashRate = 0.0035;

    //RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    //RewardValue must convert from miles to cash at a rate of 0.0035.

    //Constructor one: Accepting Cash Value with rate of 0.0035
public RewardValue(double cashValues) {
    this.cashValues = cashValues;
    this.milesValue = (int) (cashValues / MilesToCashRate); //Google later to see if other ways to do this
}

//Constructor two: accepting Miles Value with rate of 0.0035
public RewardValue(int milesValue){
    this.milesValue = milesValue;
    this.cashValues = milesValue * MilesToCashRate;
}
//RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
   //Get Cash Method
   public double getCashValue(){
    return this.cashValues;
   }

    //RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    //Get Miles function
    public int getMilesValue(){
    return this.milesValue;
    }
}
