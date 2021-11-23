public class CitiBank implements ATMCard{

  // balance should not be accessible to everyone
  private double balance;

  // instance block
  {
    // Opening account balance with 1500
    // you can take any number
    this.balance = 1500;
  }
  
  // method to perform deposit operation
  public void deposit(double amount)
              throws InvalidAmountException {

    if( amount <= 0) {
      throw new InvalidAmountException(
               "Invalid amount; amount<=0");
    }
    balance = balance + amount;

  }

  // method to perform withdraw operation 
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

  // method to perform balanceEnquiry operation
  public double balanceEnquiry(){
    return balance;
  }

}