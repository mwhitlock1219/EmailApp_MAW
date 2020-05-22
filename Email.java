import java.util.Scanner;

public class Email {
    private String firstName, lastName, password, department, alternateEmail, email, companySuffix = ".aeycompany.com";
    private int mailboxCapacity = 500, defaultPasswordLength = 10;

    // Contructor to receive the firstName and lastName
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // blocking out because of redundancy
        // System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for a department - return the department
        this.department = setDepartment();
        // blocking out because of redundancy
        // System.out.println("Department is: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);

        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        // blocking out because of redundancy
        // System.out.println("Your email is: " + email);

    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("New worker: " + firstName
                + "./n DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox Capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // Getters
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return "Your alternate email is: " + alternateEmail;
    }

    public String getPassword() {
        return "Your password is: " + password;
    }

    public String showInfo() {
        return "DISPLAY NAME " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
                + mailboxCapacity + "mb";
    }
}