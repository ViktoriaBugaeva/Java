package p4;

public class p3 {
    public static void main(String[] args) {
        /*length() - считает количество символов*/
        String sentence = "Я помню чудное мгновенье!";
        System.out.println(sentence.length());
        System.out.println();
        /*concat() - объединяет*/
        String sentence1 = "Я помню чудное мгновенье! ";
        sentence1=sentence1.concat("Передо мной явилась ты");
        System.out.println(sentence1);
        System.out.println();
        /*toUpperCase - делает сточку в верхнем регистре */
        String result = sentence1.toUpperCase();
        System.out.println("В верхнем регистре: " + result);
        System.out.println("");
        /*toLowerCase - делает сточку в нижнем регистре */
        String result1 = sentence1.toLowerCase();
        System.out.println("В нижнем регистре: " + result1);
        System.out.println("");
        /*trim (обрезает) убирает лишние пробелы. Позволяет удалять пробелы в начале и в конце строки*/
        String s1 = "Я помню чудное мгновенье! ";
        String s2 = "   Передо мной явилась ты   ";
        System.out.println(s1);
        System.out.println(s2.trim());
        System.out.println("");
        /*substring() - добовляет индекс*/
        System.out.println(sentence.substring(5));
        System.out.println(sentence.subSequence(2, 10));
        
        
    }
    
}
