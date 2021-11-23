public class InvalidAmountException extends Exception {

   // no-arg constructor
   public InvalidAmountException(){ 
          super();
   }

   // String-arg constructor
   public InvalidAmountException(String msg) {
     super(msg);
   }

}