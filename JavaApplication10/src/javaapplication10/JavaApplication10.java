/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

public class JavaApplication10 {
  public static void main(String[] args) {
    MyInteger n1 = new MyInteger(97);
    System.out.println("n1 is prime? " + n1.isPrime());
    
    String s = "3532";
    System.out.println(MyInteger.parseInt(s));
    char[] c = {'1', '7', '4', '9'};
    System.out.println(MyInteger.parseInt(c));
    /*System.out.println("n1 is even? " + n1.isEven());
    System.out.println("n1 is prime? " + n1.isPrime());
    System.out.println("15 is prime? " + MyInteger.isPrime(15));
    char[] chars = {'3', '5', '3', '9'};
    System.out.println(MyInteger.parseInt(chars));
    String s = "3532";
    System.out.println(MyInteger.parseInt(s));
     MyInteger n2 = new MyInteger(24);
    System.out.println("n2 is odd? " + n2.isOdd());
    System.out.println("45 is odd? " + MyInteger.isOdd(45));
    System.out.println("n1 is equal to n2? " + n1.equals(n2));
    System.out.println("n1 is equal to 5? " + n1.equals(5));*/
  }
}
