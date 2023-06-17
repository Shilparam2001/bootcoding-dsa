package scaler.javapractice;

    public interface PaymentMethod {
    void pay();
    }

    class DebitCard implements PaymentMethod{
    public void pay(){
        System.out.println("Paying via debit card");
        }

    }

    class CreditCard implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Paying via credit card");
        }

    }

    class UPI implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Paying via UPI");
        }

    }

