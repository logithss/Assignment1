/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author child
 */
public class ArrayTest {
    static int[] numbers = {2, 5, 75, 1, 12, 5, 63, 7, -44, 84};
    
    public static void display()
    {
        for(int i : numbers)
        {
            System.out.print(i + " ");
        }
    }
    
    public static void displayReverse()
    {
        for(int i = numbers.length-1; i >= 0; i--)
        {
            System.out.print(numbers[i]+ " ");
        }
        
    }
    
    public static void displaySum()
    {
        int sum = 0;
        for(int i : numbers)
        {
            sum += i;
        }
    }
    
    public static void displayLowerThan(int limit)
    {
        for(int i : numbers)
        {
            if(i < limit)
            {
                System.out.print(i + " ");   
            }
        }
    }
    
    public static void displayHigherThan(int limit)
    {
        for(int i : numbers)
        {
            if(i > limit)
            {
                System.out.print(i + " ");   
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayTest.displayHigherThan(3);
    }
    
}
