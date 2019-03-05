package massivy;

public class massiv6 {
    public static void main(String[] args) {
        int[] numbers = {5,6,1,7,2};
        int[] numbersCopy1=numbers;
        numbersCopy1[2]=10;
        System.out.println("numbers[2]="+numbers[2]+ " numbersCopy1[2]="+ numbersCopy1[2]);
        for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbersCopy1[i]+ " " );
        }
        int[] numbersCopy2 = new int[numbers.length];
           System.arraycopy(numbers, 0, numbersCopy2, 0, numbers.length);
           numbersCopy2[2]=100;
           
            System.out.println("numbers[2]="+numbers[2]+ " numbersCopy2[2]="+ numbersCopy2[2]);
          
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbersCopy2[i]+ " " );
            }
         }
}
