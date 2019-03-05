package massivy;

import java.util.Random;

public class massivrnd {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] =rnd.nextInt(100);
            System.out.print(" "+numbers[i]+" ");
            
        }
        System.out.println();
        int max = numbers[1];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
            max=numbers[i];
            }
        }        System.out.println("Максимальное число: " +max);
    }
    
}
