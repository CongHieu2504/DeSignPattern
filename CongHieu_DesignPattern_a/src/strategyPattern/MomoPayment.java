package strategyPattern;

class MomoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán qua Momo: " + amount + " VNĐ.");
    }
}
