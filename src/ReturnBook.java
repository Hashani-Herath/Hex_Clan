import java.util.Scanner;
public class ReturnBook {
    public void Return_Book() {
        Scanner d = new Scanner(System.in);
        System.out.println("Return a book");
        System.out.println("Enter the ISBN:");
        long ISBM = d.nextLong();
        d.nextLine();
    }
}
