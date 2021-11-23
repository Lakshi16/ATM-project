public class AmericanBank implements ATMCard {

  {
    // Opening account with 2000
    this.balance = 2000;
  }


  public void deposit(double amount)
              throws InvalidAmountException {

    if( amount <= 0) {
      throw new InvalidAmountException(
               "Invalid amount; amount<=0");
    }
    balance = balance + amount;

  }


  public double withdraw(double amount)
         throws InvalidAmountException,
               InsufficientFundsException {

    if( amount <= 0) {
      throw new InvalidAmountException(
               "Invalid amount; amount<=0");
    }
    if( balance < amount) {
      throw new InsufficientFundsException(amount +
                " not available in your account");
    }
    balance = balance - amount;
    return amount;
  }

s
  public double balanceEnquiry(){
    return balance;
  }

}