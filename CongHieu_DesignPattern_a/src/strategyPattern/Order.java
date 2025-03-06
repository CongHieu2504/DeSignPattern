package strategyPattern;

// Lớp Order sử dụng PaymentStrategy để thực hiện thanh toán.
class Order {
    private PaymentStrategy paymentStrategy;

    // Constructor nhận vào một PaymentStrategy
    public Order(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Phương thức thực hiện thanh toán
    public void executePayment(double amount) {
        paymentStrategy.pay(amount); // Gọi phương thức pay() của PaymentStrategy
    }
}
