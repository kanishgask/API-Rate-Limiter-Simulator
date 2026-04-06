import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RequestProcessor processor = new RequestProcessor();

        while(true){

            System.out.println("\n===== API RATE LIMITER =====");
            System.out.println("1. Send Request");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){

                System.out.print("Enter user ID: ");
                String userId = scanner.nextLine();

                processor.processRequest(userId);

            }else{
                break;
            }
        }
    }
}
