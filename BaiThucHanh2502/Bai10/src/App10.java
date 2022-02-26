import java.util.Scanner;
public class App10 {
 
    public static void main(String[] args) {
        int number, count = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhap vao 1 so nguyen duong bat ky: ");
        number = scanner.nextInt();
 
        while (number <= 0) {
            System.out.println("So nhap vao phai lon hon 0. Moi ban nhap lai: ");
            number = scanner.nextInt();
        }
         
        while (number > 0) {
            number /= 10;
            count++;    
        }
         
        System.out.println("So cac chu so = " + count);
    }
 
}