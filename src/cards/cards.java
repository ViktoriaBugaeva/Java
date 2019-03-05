package cards;

import java.util.Scanner;

public class cards {
    public static void main(String[] args) {
        //есть неизвестное кол-во карт, неизвестное кол-во игроков, но каждому игроку выдали по 5 карт
        //часть 1 - инициализация переменных
        int cardsPerPlayer = 5;
        int players = 0;
        String [] suits = {
        "Пик", "Бубн", "Черв", "Треф"
        };
        String[] rank = {
        "2", "3", "4", "5", "6", "6", "7", "8", "9", "10", "Валет", "Королева", " Король", "Туз"
        };
        int n = suits.length * rank.length; // кол-во карт
        //часть 2 - ввод с консоли
        for(;;) { // ;; - казывает, что цикл бесконечен
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите кол-во игроков: ");
            
            if(sc.hasNextInt()){
            
            players = sc.nextInt();
            if (cardsPerPlayer * players <= n){
            break;
            } else{
            if (players == 0) {
                System.out.println("Игра прекращена.");
                break;
            } else if (players < 0){
                System.out.println("Число игроков не может быть меньше 0");
            } else {
                System.out.println("Слишком много игроков!");
            }
                }
            
            } else {
                        System.out.println("Вы ввели не число, или ваше число слишком большое!");
                        }
                       
        }
         // часть 3 - инициализация (раздача) карт 
         String[] deck = new String[n];
         for (int i = 0; i < rank.length; i++) {
             for (int j = 0; j < suits.length; j++) {
                 deck[suits.length * i + j] = rank[i] + " " + suits[j]; // [4] [13] - так выглядит наш многомерный массив
                 
             }
            
        }// часть 4 - перетасовка карт
         for (int i = 0; i < n; i++) {
             int r = i + (int) (Math.random() * (n - i)); // случайная карта
             String temp =  deck[r];
             deck[r] = deck[i];
             deck[i] = temp;
            
        }
         // часть 5 - перетасованная колода выводится на экран
         for (int i = 0; i < players * cardsPerPlayer; i++) {
             System.out.println(deck[i]);
             if (i % cardsPerPlayer == cardsPerPlayer - 1){
                 System.out.println();
             }
            
        }
    } 
    
    
}
