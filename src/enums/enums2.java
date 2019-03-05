package enums;

import enums.enums.Seasons;

public class enums2 {
   
    public static void main(String[] args) {
        Seasons arg = Seasons.SPRING;
 
        switch (arg)
        {
            case WINTER:
            System.out.println("Зима близко!"); break;
            case SUMMER:
                System.out.println("Пора на пляж!"); break;
            case SPRING:
                System.out.println("Скоро лето!"); break;
            case FALL:
                System.out.println("Здравствуй школа!"); break;
        }
    }
    
}
