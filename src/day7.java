public class day7 {
/*
    class request {
        String name;
        String date;
        String reason;
        requset (String name,String date,String reason ){
            this.name=name;
            this.date=date;
            this.reason=reason;
        }
        void approve() {
        }
        void reject() {
            System.out.println("leave request approved");
        }
        static class Loanrequest extends
        }
        }

    }
 */


    static class payment{
        int amount;
        void transfer(){
            System.out.println("bob");
        }
    }
    static class upipayment extends payment{
        @Override
        void transfer(){
            System.out.println("transfer the amount");
        }
    }
    static class cardpayment extends payment{
        @Override
        void transfer(){
            System.out.println("easy transfer");
        }
    }
    static class nbpayment extends payment{
        @Override
        void transfer(){
            System.out.println("easy way to transfer");
        }
    }
    static void main() {
        upipayment upipayment = new upipayment();
        upipayment.transfer();

        cardpayment cardpayment = new cardpayment();
        cardpayment.transfer();

        nbpayment nbppayment = new nbpayment();
        nbppayment.transfer();
    }
}

