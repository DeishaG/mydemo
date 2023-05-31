class Calculator {
   private int numberFirst;
   private int numberSecond;
   private char operation;
   private int result;

   Calculator(int numberFirst, int numberSecond, char operation){
      this.numberFirst = numberFirst;
      this.numberSecond = numberSecond;
      this.operation = operation;
   }

   private void calculate() throws OperationException{
      switch (operation){
         case '+' : result = sum();
         break;

         case '-' : result = subtraction();
         break;

         case '*' : result = multiplication();
         break;

         case '/' : result = division();
         break;

         default: throw new OperationException("Operator does not match: [+],[-],[*],[/]");
      }

   }

   private int sum(){
      return numberFirst + numberSecond;
   }

   private int subtraction(){
      return numberFirst - numberSecond;
   }

   private int multiplication(){
      return numberFirst * numberSecond;
   }

   private int division (){
      return numberFirst / numberSecond;
   }

   public int getResult () throws OperationException {
      calculate ();
      return result;
   }

}
