/*
public class dayy14 {
    interface Notification {
        void send(String to, String message);
    }
    class emailNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Email: " + message + ", to " + to);
        }
    }
    class WhatsappNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Whatsapp: " + message + ", to " + to);
        }
    }
    Notification getNotification(dayy14 factory, String type) {
        return switch (type) {
            case "Email" -> factory.new emailNotification();
            case "Whatsapp" -> factory.new WhatsappNotification();
            default -> throw new IllegalArgumentException(
                    "Invalid notification type: " + type);
        };
    }
    public static void main(String[] args) {
        dayy14 factory = new dayy14();

        String type = "Whatsapp";
        getNotification(factory, type).send("6379299990", "Hello World");
    }
}
*/
public class dayy14{
    interface Notification{
        void send(String to, String message);
    }
    class CreditNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Credited 1000 : "+message+", to"+to);
        }

    }
    class DebitNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Debited 1000: "+message+", to"+to);
        }
    }
    static Notification getNotification(dayy14  factory, String type){
        return switch (type){
            case"Credit"-> factory.new CreditNotification();
            case"Debit"-> factory.new DebitNotification();
            default -> throw new IllegalArgumentException("Invalid account type:"+ type);
        };
    }
    static void main(){
        dayy14 factory = new dayy14();
        String type = "Credit";
        getNotification(factory,type).send(" divya "," amount 1000 credited");
    }
}


