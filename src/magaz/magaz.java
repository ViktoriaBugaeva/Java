package magaz;
public class magaz {
String title;
public magaz (String title) {
this.title = title;
}
public static void main(String[] args) {
Author[]authorArray = {new Author(),
new Author(),
new Author(),
};
System.out.println(authorArray[0].getAuthors()[0]);
System.out.println(authorArray[0].getAuthors()[1]);
System.out.println(authorArray[0].getAuthors()[2]);
System.out.println(authorArray[0].getAuthors()[3]);
System.out.println(authorArray[0].getAuthors()[4]);
System.out.println(authorArray[0].getAuthors()[5]);


magaz magaz1 = new magaz("Умная собачка Соня");
String [] magaz = new String[5];
books[0] = "Title book: " + magaz.title + " author: " + authorArray[0].getAuthors()[0];
book.title = "Мы все из Бюллербю";
books[1] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[1];
book.title = "Гадкий утенок";
books[2] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[2];
book.title = "Бобик в гостях у Барбоса";
books[3] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[3];
book.title = "Денискины рассказы";
books[4] = "Title book: " + book.title + " authors: " + authorArray[0].getAuthors()[4] + ", " +authorArray[0].getAuthors()[5];
for(String x: books){
System.out.println(x);
}
}
public String toString(){
return title;
}
}