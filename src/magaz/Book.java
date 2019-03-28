package magaz;
public class Book {
String title;
public Book (String title) {
this.title = title;
}
public static void main(String[] args) {
Author[]authorArray = {new Author(),
new Author(),
new Author(),
};
System.out.println(authorArray[0].getAuthors()[0]);
System.out.println(authorArray[0].getAuthors()[1]);
String test []={"G.H.Andersen", "N.Nosov","V.Dragunski","Deniska"};
authorArray[1].setAuthors(test);
System.out.println(authorArray[1].getAuthors()[0]);
System.out.println(authorArray[1].getAuthors()[1]);
System.out.println(authorArray[1].getAuthors()[2]);
System.out.println(authorArray[1].getAuthors()[3]);
Book book = new Book("Умная собачка Соня");
String [] books = new String[5];
books[0] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[0];
book.title = "Мы все из Бюллербю";
books[1] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[1];
book.title = "Гадкий утенок";
books[2] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[0];
book.title = "Бобик в гостях у Барбоса";
books[3] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[1];
book.title = "Денискины рассказы";
books[4] = "Title book: " + book.title + " authors: " + authorArray[1].getAuthors()[2] + ", " +authorArray[1].getAuthors()[3];
for(String x: books){
System.out.println(x);
}
}
public String toString(){
return title;
}
}