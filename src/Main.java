public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev","Tolstoy");
        Author author2 = new Author("Stiven", "King");
        Book book1 = new Book("War and Peace",author1,2000);
        Book book2 = new Book("It",author2,2020);
        //System.out.println(book1.getTitle() + " " + book1.getPublishingYear() + " " + author1.getName() + " " + author1.getSurname());
        /**
         Book.display(book1);
         Book.display(book2);
         System.out.println("Книга была переиздана: ");
         book1.setPublishingYear(1999);
         Book.display(book1);
         */ System.out.println("Книга была переиздана: ");
        book1.setPublishingYear(1999);
        System.out.println(book1);
        System.out.println(book2);
    }
}