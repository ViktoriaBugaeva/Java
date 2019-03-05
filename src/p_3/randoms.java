/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_3;

import java.util.Random;

/**
 *
 * @author user
 */
public class randoms {
    public static void main(String[] args) {
        Random rnd = new Random();
       int numRnd=rnd.nextInt(30);
        System.out.println(numRnd);
    }
    
}
