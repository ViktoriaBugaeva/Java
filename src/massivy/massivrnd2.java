package massivy;

import javafx.geometry.Side;

public class massivrnd2 {
    public static void main(String[] args) {
        int[] mas = new int[12]; //создаем массив на 12 значений
        int maxNumber = -16; //создаем переменную с максимальным значением
        int maxIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] =(int) (Math.random()*31)-15;
            System.out.println(mas[i] + " ");
            if (maxNumber <= mas[i]){
            maxNumber = mas[i];
            maxIndex = i;
            }
            
        }
        System.out.println();
        System.out.println("Индекс " + "максимального элемента: " + maxIndex);
        System.out.println("максимальное число: " + maxNumber);
    }
    
}
