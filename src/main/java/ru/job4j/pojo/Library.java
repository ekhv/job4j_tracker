package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 1137);
        Book headFirst = new Book("Head First Design Patterns", 954);
        Book javaPerformance = new Book("Java Performance", 543);
        Book releaseIt = new Book("Release It!", 426);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = headFirst;
        books[2] = javaPerformance;
        books[3] = releaseIt;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            if ("Clean Code".equals(books[i].getName())) {
                System.out.println(books[i].getName());
            }
        }
    }
}
