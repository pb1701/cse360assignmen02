package cse360assignment02;

public class Main {
   public static void main(String[] args) {
       AddingMachine myCalculator=new AddingMachine();
       myCalculator.add(4); // call add() method
       myCalculator.subtract(2); // call subtract() method
       myCalculator.add(5);
       System.out.println(myCalculator.toString());
       System.out.println("Total = "+myCalculator.getTotal());
   }
}