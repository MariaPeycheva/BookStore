import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            BookStore bookstore = new BookStore();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Number of Books ");
            int nBooks = scanner.nextInt();

            for (int i = 1; i <= nBooks; i++) {
                System.out.println("Book number " + (i) + ": ");
                System.out.println("Title: ");
                String title = scanner.next();
                System.out.println("Author's name: ");
                String authorName = scanner.next();
                System.out.println("Author's age: ");
                int authorAge = scanner.nextInt();
                System.out.println("Price: ");
                double price = scanner.nextDouble();
                System.out.println("Type (BOOK, COMIC_BOOK, CHILDREN_BOOK): ");
                String type = scanner.next();

                Author author = new Author(authorName, authorAge);
                Book book;
                switch (type) {
                    case "COMIC_BOOK":
                        System.out.println("Character name: ");
                        String characterName = scanner.next();
                        book = new ComicBook(title, author, price, characterName);
                        break;
                    case "CHILDREN_BOOK":
                        System.out.println("Enter age: ");
                        int age = scanner.nextInt();
                        book = new ChildrenBook(title, author, price, age);
                        break;
                    default:
                        book = new Book(title, author, price);
                }
                for(int j=0; j<nBooks; j++)
                {
                    if(j%2==0)
                    bookstore.sell(book);
                }

            }
            scanner.close();
        }
    }