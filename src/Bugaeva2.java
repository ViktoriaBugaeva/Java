/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bugaeva2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bugaeva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*Scaner*/
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        if (number>0){
            System.out.printf("Number %d is positive%n",number);
        }
        else if (number <0) {
            System.out.printf("Number %d is negative%n",number);
        }else System.out.println("Number is zero"); */
       
       /*Switch_case*/
       Scanner sc = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int month = sc.nextInt();
        System.out.println("ведите год: ");
        int year = sc.nextInt();
        int days = 0;
        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                days=31;
                break;
            case 4:case 6:case 9:case 11:
                days=30;
                break;
            case 2:
                days=(year % 4 == 0&&
                        ! (year % 100 == 0))||(year % 400 == 0)? 29:28;
                break;
            default: 
                System.out.println("Invalid month");
                break;          
        }
        System.out.printf("Days in month: %d and year:  %d are %d%n",month, year, days);
    }
    
}
