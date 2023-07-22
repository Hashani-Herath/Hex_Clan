import java.util.Scanner;

public class AddNewBook {

    Scanner a =new Scanner(System.in);

    public void AddBook() {


        System.out.println("Add a new book");
        System.out.println("Enter the ISBN");
        long ISBN = a.nextLong();
        a.nextLine();

        System.out.println("Enter the title:");
        String title = a.nextLine();

        System.out.println("Enter the Category:");
        String category = a.nextLine();

        System.out.println("Enter the Author:");
        String author = a.nextLine();

        System.out.println("Book successfully added\n\n");
    }


}