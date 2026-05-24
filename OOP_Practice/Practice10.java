

// . Online Shopping Cart

// Create an abstract class/interface:

// PaymentMethod

// Implement:

// Credit Card
// UPI
// Wallet
//  abstraction in java is done using interface and classes

class Practice10 {
    interface PaymentMethod{
        void makePayment();
    }
    static class cc implements PaymentMethod{
        public void makePayment(){
            System.out.println("Payment made using CC");
        }
    }
    
    static class UPI implements PaymentMethod{
        public void makePayment(){
            System.out.println("Payment made using UPI");
        }
    }
    
    
    public static void main(String[] args) {
        PaymentMethod p1 = new cc();
        PaymentMethod p2 = new UPI();
        
        p1.makePayment();
        p2.makePayment();
        
    }
}