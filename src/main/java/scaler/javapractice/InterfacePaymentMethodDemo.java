package scaler.javapractice;

public class InterfacePaymentMethodDemo {

    public static void makePayment(PaymentMethod pm) {

        pm.pay();
    }

    public static void main(String[] args) {

        makePayment(new DebitCard());

        }

    }

