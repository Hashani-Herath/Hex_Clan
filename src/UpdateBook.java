import java.util.Scanner;

public class UpdateBook {


    public void Update_Book() {
        Scanner b =new Scanner(System.in);
        System.out.println("Update an exsting book");
        System.out.println("Enter the ISBN that need to update:");
        long ISBM=b.nextLong();
        b.nextLine();

        System.out.println("Update the book:");
        System.out.println("Enter the new Title (A song of Ice and Fire):");
        String up=b.nextLine();

        System.out.println("Enter the new Category (Fantasy):");
        String category=b.nextLine();

        System.out.println("Enter the new Author (George R. R. Martin):");
        String aut=b.nextLine();

        System.out.println("Updated \n\n\n");

    }



}