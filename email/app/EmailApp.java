package email.app;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("Afif", "Ruddraw");
        //email1.setAlternativeEmail(null);
        System.out.println(email1.showInfo());
        
    }
}
