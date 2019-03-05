/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 *
 * @author user
 */
public class enums {
    public enum Seasons {
    WINTER, SUMMER, SPRING, FALL;
    }
    
    public static void main(String[] args) {
       /* System.out.println(Seasons.WINTER);
        System.out.println(Seasons. SUMMER);
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.FALL); */
       
       for (Seasons s : Seasons.values()) {
            System.out.println(s);
       }
        
    }
    
}
