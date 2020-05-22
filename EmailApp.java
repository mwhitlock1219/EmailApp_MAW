public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Melina", "Whitlock");

        // em1.setAlternateEmail("mw@gmail.com");
        // System.out.println(em1.getAlternateEmail());

        System.out.println(em1.showInfo());
    }
}