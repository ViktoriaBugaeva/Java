/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_switch;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class If_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println("Введите число 1, 2 или 3:");
        Scanner inputNbr = new Scanner(System.in);
        int i=inputNbr.nextInt();
        if (i==1) {
            System.out.println("Вы ввели число 1");
        }
        else if(i==2) 
            {
            System.out.println("Вы ввели число 2");
        }
         else if(i==3) 
            {
            System.out.println("Вы ввели число 3");
        }
         else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        } */
        
        
         System.out.println("Введите число 1, 2 или 3:");
        Scanner inputNbr = new Scanner(System.in);
        int i=inputNbr.nextInt();
        switch (i) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели число не равное 1, 2 или 3");
                break;
    }
    
}
}
