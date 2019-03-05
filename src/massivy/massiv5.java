package massivy;

public class massiv5 {
    public static void main(String[] args) {
        int[] array4=new int[5];
        array4[0]=4;
        array4[1]=16;
        array4[2]=32;
        array4[3]=64;
        array4[4]=128;
        int sum = 0;
        
        for (int i = 0; i < array4.length; i++) {
            sum +=array4[i];
            
        }
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
            
        }
        System.out.println("Сумма - "+sum);
    }
    
}
