
public class Ticket {

    // Ticket information
    private int ticketId;
    private String studentName;
    private String title;
    private String description;
    private String category;
    private String priority;
    private String status;

    // Constructor
    public Ticket(int ticketId, String studentName,
                  String title, String description,
                  String category, String priority) {

        this.ticketId = ticketId;
        this.studentName = studentName;
        this.title = title;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.status = "Open";
    }

    // Getter methods
    public int getTicketId() {
        return ticketId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display ticket details
    public void displayTicket() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
        System.out.println("-------------------------");
    }
}
