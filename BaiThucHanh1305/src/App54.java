import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] agrs) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        // thêm các phần tử vào hashSetInteger
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        // hiển thị các phần tử trong hashSetInteger
        System.out.println("Cac phan tu trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = scanner.nextInt();
        // thêm 1 phần tử mới vào hashSetinteger từ bàn phím
        // nếu phần tử đó đã tồn tại thì thông báo đã tồn tại ngược lại thì thêm vào
        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(hashSetInteger);
        } else {
            System.out.println("Phan tu " + number + " da ton tai!");
        }
    }
}
