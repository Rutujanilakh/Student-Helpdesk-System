
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TicketManager manager = new TicketManager();

        int choice = 0;

        do {

            System.out.println("\n================================");
            System.out.println("   STUDENT HELPDESK SYSTEM");
            System.out.println("================================");
            System.out.println("1. Create New Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Update Ticket");
            System.out.println("5. Update Ticket Status");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");

            // Validate menu input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Ticket Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter Category (Technical/Academic/Fees): ");
                    String category = sc.nextLine();

                    System.out.print("Enter Priority (High/Medium/Low): ");
                    String priority = sc.nextLine();

                    manager.createTicket(
                        name, title, description, category, priority
                    );
                    break;

                case 2:
                    manager.viewAllTickets();
                    break;

                case 3:
                    System.out.print("Enter Ticket ID: ");
                    if (sc.hasNextInt()) {
                        int searchId = sc.nextInt();
                        sc.nextLine();
                        manager.searchTicket(searchId);
                    } else {
                        System.out.println("Invalid Ticket ID!");
                        sc.nextLine();
                    }
                    break;

                case 4:
                    System.out.print("Enter Ticket ID: ");
                    if (sc.hasNextInt()) {
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Title: ");
                        String newTitle = sc.nextLine();

                        System.out.print("Enter New Description: ");
                        String newDescription = sc.nextLine();

                        manager.updateTicket(
                            updateId, newTitle, newDescription
                        );
                    } else {
                        System.out.println("Invalid Ticket ID!");
                        sc.nextLine();
                    }
                    break;

                
case 5:
    System.out.print("Enter Ticket ID: ");
    int statusId = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter New Status (In Progress/Resolved): ");
    String newStatus = sc.nextLine();

    manager.updateTicketStatus(statusId, newStatus);
    break;


                case 6:
                    System.out.println("Thank you for using Student Helpdesk!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
