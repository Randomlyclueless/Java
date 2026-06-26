
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// 2. Payment Gateway

// Create:

// CreditCardPayment
// UPIPayment
// PayPalPayment
// Use polymorphism for:
// processPayment()
class Practice9 {
    static class Payment{
        void processPayment(){
            System.out.println("Payment processed");
        }
    }
    static class ccPayment extends Payment{
            void processPayment(){
                System.out.println("Payment processed via Credit card");
            }
        }
        
    static class UpiPay extends Payment{
        void processPayment(){
            System.out.println("Payment processed via UPI");
        }
    }
    public static void main(String[] args) {
        Payment type1 = new ccPayment();
        Payment type2 = new UpiPay();
        type1.processPayment();
        type2.processPayment();
        
        
    }
}