package faily;

import java.io.*;

public class faily {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample1.txt");//объявили переменные
        fw.close();
        FileReader fr = new FileReader("sample2.txt");
        fr.close();//закрыли потоки
        
    }

}
