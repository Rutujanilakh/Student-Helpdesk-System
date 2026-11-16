
import java.util.ArrayList;

public class TicketManager {

    // Store multiple tickets
    private ArrayList<Ticket> tickets = new ArrayList<>();

    // Generate ticket IDs
    private int nextTicketId = 101;

    // 1. Create Ticket
    public void createTicket(String studentName,
                             String title,
                             String description,
                             String category,
                             String priority) {

        if (studentName.trim().isEmpty() ||
            title.trim().isEmpty() ||
            description.trim().isEmpty()) {

            System.out.println("Error: Fields cannot be empty!");
            return;
        }

// Validate category
if (!category.equalsIgnoreCase("Technical") &&
    !category.equalsIgnoreCase("Academic") &&
    !category.equalsIgnoreCase("Fees")) {

    System.out.println("Invalid Category!");
    System.out.println("Choose Technical, Academic or Fees.");
    return;
}

// Validate priority
if (!priority.equalsIgnoreCase("High") &&
    !priority.equalsIgnoreCase("Medium") &&
    !priority.equalsIgnoreCase("Low")) {

    System.out.println("Invalid Priority!");
    System.out.println("Choose High, Medium or Low.");
    return;
}

// Check for duplicate ticket ID
for (Ticket existingTicket : tickets) {

    if (existingTicket.getTicketId() == nextTicketId) {
        System.out.println("Duplicate Ticket ID!");
        return;
    }
}


        Ticket ticket = new Ticket(
            nextTicketId,
            studentName,
            title,
            description,
            category,
            priority
        );

        tickets.add(ticket);

        System.out.println("Ticket created successfully!");
        System.out.println("Your Ticket ID is: " + nextTicketId);

        nextTicketId++;
    }

    // 2. View All Tickets
    public void viewAllTickets() {

        if (tickets.isEmpty()) {
            System.out.println("No tickets available.");
            return;
        }

        for (Ticket ticket : tickets) {
            ticket.displayTicket();
        }
    }

    // 3. Search Ticket
    public void searchTicket(int id) {

        for (Ticket ticket : tickets) {

            if (ticket.getTicketId() == id) {
                ticket.displayTicket();
                return;
            }
        }

        System.out.println("Ticket not found!");
    }

    // 4. Update Ticket
    public void updateTicket(int id, String title,
                             String description) {

        for (Ticket ticket : tickets) {

            if (ticket.getTicketId() == id) {

                if (title.trim().isEmpty() ||
                    description.trim().isEmpty()) {

                    System.out.println("Fields cannot be empty!");
                    return;
                }

                if (ticket.getStatus().equals("Resolved") ||
                    ticket.getStatus().equals("Closed")) {

                    System.out.println("Cannot update a closed ticket!");
                    return;
                }

                ticket.setTitle(title);
                ticket.setDescription(description);

                System.out.println("Ticket updated successfully!");
                return;
            }
        }

        System.out.println("Ticket not found!");
    }

    // 5. Resolve Ticket
    

        
public void updateTicketStatus(int id, String newStatus) {

    for (Ticket ticket : tickets) {

        if (ticket.getTicketId() == id) {

            String currentStatus = ticket.getStatus();

            if (currentStatus.equals("Resolved")) {
                System.out.println("Ticket is already Resolved!");
                return;
            }

            if (!newStatus.equalsIgnoreCase("In Progress") &&
                !newStatus.equalsIgnoreCase("Resolved")) {

                System.out.println("Invalid Status!");
                System.out.println("Choose In Progress or Resolved.");
                return;
            }

            if (newStatus.equalsIgnoreCase("In Progress")) {

                if (currentStatus.equals("Open")) {
                    ticket.setStatus("In Progress");
                    System.out.println("Ticket status updated to In Progress.");
                } else {
                    System.out.println("Invalid status change!");
                }

                return;
            }

            if (newStatus.equalsIgnoreCase("Resolved")) {
                ticket.setStatus("Resolved");
                System.out.println("Ticket Resolved Successfully!");
                return;
            }
        }
    }

    System.out.println("Ticket not found!");
}

    }

