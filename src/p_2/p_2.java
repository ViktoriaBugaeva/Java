/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_2;

/**
 *
 * @author user
 */
public class p_2 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {
            System.out.println(i + ": я выполняюсь перед continue!");
            if(i>2)
                continue;
            System.out.println("  "+ i +"я выполняюсь всего 2 раза");
            
        }
    }
    
}
