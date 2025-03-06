package strategyPattern;

class VNPayPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán qua VN Pay: " + amount + " VNĐ.");
    }
}

