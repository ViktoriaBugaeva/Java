package massivy;

import java.util.Arrays;

public class bubbles {
    public static void main(String[] args) {
        int[] arr1 = {11,3,14,16,7};
        boolean isSorted = false;
        int buf;
        while(!isSorted){ //не fals
            isSorted = true;
            for (int i = 0; i < arr1.length-1; i++) { //длина массива -1, чтобы не выходили за пределы массива и на 1 цикл было меньше
                if(arr1[i] < arr1[i + 1]){
                isSorted = false;
                buf = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = buf;
                }  
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
    
}
