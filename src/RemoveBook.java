import java.util.Scanner;

public class RemoveBook {
    public void Remove_Book() {
        Scanner c =new Scanner(System.in);
        System.out.println("Remove an existing book");
        System.out.println("Enter the ISBN:");
        long ISBM=c.nextLong();
        c.nextLine();

        System.out.println("Are you sure you want to remove this book? (Y/N)");
        String up=c.nextLine();
        //have to  complete
        switch(up){
            case "Y": case "y" :
                System.out.println("Successfully removed...\n"); break;
            case "N": case "n" :
                System.out.println("Not Removed"); break;
            default:
                System.out.println("Something went wrong");
        }

        System.out.println("Removed\n\n");

    }
}