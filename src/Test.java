public class Test {

    public static void main(String[] args) {
        System.out.println("Begin Testing Singleton Pattern");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asker to borrow the book");
        System.out.println("BookBorrowed1 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2 asker to borrow the book");
        System.out.println("BookBorrowed2 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower1.returnBook();
        System.out.println("BookBorrower2 returned the book");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("End Testing Singleton Pattern");
    }
}
