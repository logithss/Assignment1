/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(Billing.computeBill(10, 2, 3));
        
        
        MyInteger i = new MyInteger(4);
        char[] c = {'1', '2', '3', '1'};
        System.out.println(MyInteger.parseInt(c));
        System.out.println(MyInteger.parseInt("1212145"));
        
        /*
        Scanner scan = new Scanner(System.in);
        
        CertOfDeposit c1;
        CertOfDeposit c2;
        
        int certificateNum;
        String lastName;
        float balance;
        
        int year;
        int month;
        int day;
        System.out.println("Creating CertOfDeposit 1...");
        
        System.out.print("Input certificateNum : ");
        certificateNum = scan.nextInt();
        System.out.print("Input lastName : ");
        lastName = scan.next();
        System.out.print("Input balance : ");
        balance = scan.nextFloat();
        System.out.print("Input year : ");
        year = scan.nextInt();
        System.out.print("Input month : ");
        month = scan.nextInt();
        System.out.print("Input day : ");
        day = scan.nextInt();
        
        c1 = new CertOfDeposit(certificateNum, lastName, balance, LocalDate.of(year, month, day));
        System.out.println("CertOfDeposit 1 created successfully!");
        
        
        
        System.out.println("Creating CertOfDeposit 2...");
        
        System.out.print("Input certificateNum : ");
        certificateNum = scan.nextInt();
        System.out.print("Input lastName : ");
        lastName = scan.next();
        System.out.print("Input balance : ");
        balance = scan.nextFloat();
        System.out.print("Input year : ");
        year = scan.nextInt();
        System.out.print("Input month : ");
        month = scan.nextInt();
        System.out.print("Input day : ");
        day = scan.nextInt();
        
        c2 = new CertOfDeposit(certificateNum, lastName, balance, LocalDate.of(year, month, day));
        System.out.println("CertOfDeposit 2 created successfully!");
        
        
        System.out.println(c1);
        System.out.println(c2);
        
        */


    }
    
}
