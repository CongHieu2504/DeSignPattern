package strategyPattern;

class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng tiền mặt: " + amount + " VNĐ.");
    }
}
