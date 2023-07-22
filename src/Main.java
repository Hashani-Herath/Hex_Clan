import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i=0,option=0;


        do {
            System.out.println("Welcome to the library management system Uok!");
            System.out.println("Please choose an option");
            System.out.println("1. Add a new book");
            System.out.println("2. Update an exiting book");
            System.out.println("3. Remove an exiting book");
            System.out.println("4. Lend a book");
            System.out.println("5. Return a book");
            System.out.println("6. List all available books");
            System.out.println("7. Exit");

            System.out.print("Enter Option : ");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            System.out.println(option);

            switch(option){
                case 1 :    AddNewBook book1 = new AddNewBook(); book1.AddBook(); break;
                case 2 :    UpdateBook book2 = new UpdateBook(); book2.Update_Book(); break;
                case 3 :    RemoveBook book3 = new RemoveBook(); book3.Remove_Book(); break;
                case 4 :    LendBook book4 = new LendBook(); book4.Lend_Book(); break;
                case 5 :    ReturnBook book5 = new ReturnBook(); book5.Return_Book(); break;
                case 6 :    break;
//                case 7 :
                default:
                    System.out.println("Invalid Enter Again");
                    option = input.nextInt();
            }
        }while(option!=7);
    }
}