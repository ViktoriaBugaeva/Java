/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faily;

import java.io.*;


/**
 *
 * @author user
 */
public class faily {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample1.txt");//объявили переменные
        fw.close();
        FileReader fr = new FileReader("sample2.txt");
        fr.close();//закрыли потоки
        
    }

}
