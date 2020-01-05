/* 
Basic Calculator with add, subtract, multiply, divide, and modulo functions.
Author: Dinu Wijetunga
*/

public class Main {
  
  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a * b;
  }

  public int divide(int a, int b){ 
    if(b == 0) {
      System.out.println("Error. Cannot divide by zero.");
      return 0;
    }else{
      return a / b;
    }  
  }

  public int modulo(int a, int b){
    if(b ==0){
      System.out.println("Error. Cannot divide by zero.");
      return 0;
    }else{
      return a % b;
    }
  }

  public static void main(String[] args) {
    Main myCalculator = new Main();
    System.out.println(" ");
    System.out.println("Add: " + myCalculator.add(5, 7));
    System.out.println("Subtract: " + myCalculator.subtract(45, 11));
    System.out.println("Divide: " + myCalculator.divide(25, 5));
    System.out.println("Multiply: " + myCalculator.multiply(25, 5));
    System.out.println("Modulo: " + myCalculator.modulo(25, 0));
  }
}