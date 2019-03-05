package massivy;
import java.util.Arrays;
public class arifmeticheskoe2 {
    public static void main(String[] args) {
        int[] mas1 = new int[20];
        
        for (int i = 0; i < 20; i++) {
            mas1 [i] = (int) (Math.random() * 21);
            
            }
        System.out.println("mas1 " + Arrays.toString(mas1));
        
        double average1 = 0; 
        int max = mas1[20];
                int min = mas1[0];
            
        for (int i = 0; i < 20; i++) { 
            average1 += mas1[i];
            }
        
        average1/=mas1.length; 
        
        System.out.println("Среднее арифметическое " + average1);
    
       
        
              
    }   
}
