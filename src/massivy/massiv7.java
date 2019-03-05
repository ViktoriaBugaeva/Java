package massivy;

import java.util.Arrays;

public class massiv7 {
    public static void main(String[] args) {
        int[] numbers = new int [10];
        Arrays.fill(numbers,5);
        Arrays.fill(numbers, 0, 4, 25);
        System.out.println(Arrays.toString(numbers));
        int[]numberCopy=Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numberCopy);
        System.out.println(Arrays.toString(numberCopy));
        System.out.println(Arrays.equals(numbers, numberCopy));
    }
}
