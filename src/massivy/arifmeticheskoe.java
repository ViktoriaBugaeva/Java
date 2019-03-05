package massivy;
import java.util.Arrays;
public class arifmeticheskoe {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        for (int i = 0; i < 5; i++) {
            mas1 [i] = (int) (Math.random() * 6);
            mas2 [i] = (int) (Math.random() * 6);
            }
        System.out.println("mas1 " + Arrays.toString(mas1));
        System.out.println("mas2 " + Arrays.toString(mas2));
        double average1 = 0; //среднее 1
        double average2 = 0;
        for (int i = 0; i < 5; i++) { // находим сумму всех элементов массива через цикл for
            average1 += mas1[i];
            average2 += mas2[i];
            }
        average1/=mas1.length; //находим среднее арифметическое
        average2/=mas2.length;
        //проверка через if
       
        if (average1 > average2){
            System.out.println("Среднее арифметическое 1-го массива("+average1+") больше среднего арифметического второго массива("+average2+")");
           
        }else if(average1 < average2){
                
                System.out.println("Среднее арифметическое 1-го массива("+average1+") меньше среднего арифметического второго массива("+average2+")");
         }else{ System.out.println("Среднее арифметическое массивов равны("+average1+")=("+average2+")");
            }  
    }   
}
