package massivy;

public class massiv4 {
    public static void main(String[] args) {
        boolean[] array3 = new boolean[100];
        for (int i = 0; i < array3.length; i = i +2) {
            array3[i] = true;
                     
        }
        
          for (int i = 0; i < array3.length; i++) {
                System.out.println(array3[i]+ " " + i );
                
            }
    }
    
}
