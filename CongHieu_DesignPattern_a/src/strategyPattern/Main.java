package strategyPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập phương thức thanh toán từ người dùng
        System.out.println("Chọn phương thức thanh toán:");
        System.out.println("1. Tiền mặt");
        System.out.println("2. Chuyển Khoản");
        System.out.println("3. Momo");
        System.out.println("4. VN Pay");

        int choice = scanner.nextInt();  // Nhận lựa chọn từ người dùng

        // Nhập số tiền thanh toán
        System.out.print("Nhập số tiền cần thanh toán: ");
        double amount = scanner.nextDouble();  // Nhận số tiền từ người dùng

        // Chọn phương thức thanh toán tương ứng
        PaymentStrategy paymentStrategy = null;

        switch (choice) {
            case 1:
                paymentStrategy = new CashPayment();
                break;
            case 2:
                paymentStrategy = new BankTransferPayment();
                break;
            case 3:
                paymentStrategy = new MomoPayment();
                break;
            case 4:
                paymentStrategy = new VNPayPayment();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }

        // Nếu phương thức thanh toán hợp lệ, thực hiện thanh toán
        if (paymentStrategy != null) {
            Order order = new Order(paymentStrategy);
            order.executePayment(amount);
        }

        scanner.close();  // Đóng Scanner khi không còn cần thiết
    }
}

