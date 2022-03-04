import java.util.Scanner;
public class App90{
public static void main(String[] args) {
    String chuoi;
    char kyTu;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhap vao chuoi bat ky: ");
    chuoi = scanner.nextLine();
         
    System.out.println("Cac ky tu co trong chuoi la: ");
    for (int i = 0; i < chuoi.length(); i++) {
        // trả về ký tự tại vị trí thứ i trong chuỗi
        // và gán vào cho biến kyTu
        // i chạy từ 0 đến vị trí độ dài của chuỗi - 1
        kyTu = chuoi.charAt(i);
             
        System.out.println(kyTu);
    }
  }
}
