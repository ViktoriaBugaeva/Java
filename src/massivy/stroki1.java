package massivy;

public class stroki1 {

    public static void main(String[] args) {
        char[] chars = {'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'K', 'T', 'V', 'p', '1', '8'};
        String s1 = "Строки";
        System.out.println("Строка s1 до copyValueOf:       " + s1);
        
        s1 = s1.copyValueOf(chars);
        
        System.out.println("Строка s1 после copyValueOf:    " + s1);
        
        char[] chars1 = {'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'K', 'T', 'V', 'p', '1', '8'};
        String str1 = "Строки";
        }
    
}
