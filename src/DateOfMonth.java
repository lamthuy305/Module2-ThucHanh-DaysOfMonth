import java.util.Scanner;

public class DateOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
//                System.out.print("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
//                System.out.print("Tháng " + month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
//                System.out.print("Tháng " + month + " có 30 ngày");
                break;
            default:
                daysInMonth = "";
        }
        if (!daysInMonth.equals("")) {
            System.out.printf("The month " + month + " có " + daysInMonth + " ngày");
        } else {
            System.out.print("Không có tháng " + month);
        }
    }
}
