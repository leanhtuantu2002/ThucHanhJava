import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        // thêm các phần tử vào hashSetString
        hashSetString.add("Athur");
        hashSetString.add("Thomas");
        hashSetString.add("Don");
        hashSetString.add("Tommy");
        hashSetString.add("LeeMinHo");
        hashSetString.add("Xiaomi");
        // hiển thị các phần tử trong hashSetString
        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = scanner.nextLine();
        // nếu phần tử cần xóa có tồn tại hashSetString thì sẽ thông báo xóa thành công
        // và hiển thị các phần tử còn lai ngược lại thông báo xóa không thành công
        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
    }
}