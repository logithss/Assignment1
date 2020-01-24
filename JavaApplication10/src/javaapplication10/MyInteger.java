/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author cstuser
 */
public class MyInteger {
    private int value;

    public MyInteger(int value) {
     this.value = value;
    }

    public int getValue() {
        return this.value;
    }
    //Object Methods
    public boolean isEven()
    {
        return (this.value%2) == 0;
    }
    
    public boolean isOdd()
    {
        return (this.value%2) != 0;
    }
    
    public boolean isPrime()
    {
        if(this.value > 1)
        {
          for(int i = 2; i < this.value; i++)
          {
            if(this.value % i == 0)
            {
                return false;
            }
          }
        }else{
            return false;
        }
        return true;
    }
    
    //Static methods
    public static boolean isEven(int value)
    {
        return (value%2) == 0;
    }
    
    public static boolean isOdd(int value)
    {
        return (value%2) != 0;
    }
    
    public static boolean isPrime(int value)
    {
        if(value > 1)
        {
          for(int i = 2; i < value; i++)
          {
            if(value % i == 0)
            {
                return false;
            }
          }
        }else{
            return false;
        }
        return true;
    }
    
    //Static Method With MyInteger
     public static boolean isEven(MyInteger value)
    {
        return (value.getValue()%2) == 0;
    }
    
    public static boolean isOdd(MyInteger value)
    {
        return (value.getValue()%2) != 0;
    }
    
    public static boolean isPrime(MyInteger value)
    {
        if(value.getValue() > 1)
        {
          for(int i = 2; i < value.getValue(); i++)
          {
            if(value.getValue() % i == 0)
            {
                return false;
            }
          }
        }else{
            return false;
        }
        return true;
    }
    
    public boolean equals(int value)
    {
        return this.value == value;
    }
    
     public boolean equals(MyInteger value)
    {
        return this.value == value.getValue();
    }
     
     public static int parseInt(char [] value)
     {
         int index = value.length;
         int number = 0;
         for(char c : value)
         {
             index--;
             number += Character.getNumericValue(c) * Math.pow(10, index);
         }
         return number;
     }
     
     public static int parseInt(String value)
     {
         int index = value.length();
         int number = 0;
         for(char c : value.toCharArray())
         {
             index--;
             number += Character.getNumericValue(c) * Math.pow(10, index);
         }
         return number;
     }
    
}
