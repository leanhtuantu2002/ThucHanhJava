import java.util.Scanner;
public class App5 {
  public static void main(String[] args) {
    //sử dụng class Scanner để lấy dữ liệu từ bàn phím
    Scanner sc = new Scanner(System.in);
    //khai báo biến a là số cần kiểm tra, sum là tổng các ước số của a
    int sum = 0, a;
    System.out.println("\n\nNhap vao so can kiem tra: ");
    a = sc.nextInt();
    //sử dụng vòng lặp for từ 1 đến a/2 (vì ước số của a luôn luôn nhỏ hơn a/2)
    for(int i=1;i<=a/2;i++){
      if(a%i==0) 
        //tổng các ước số của a
        sum+=i;
    }
    //nếu tổng ước số sum = a thì a là số hoàn hảo
    if(sum==a){
      System.out.println(a + " la so hoan thien");
    }
    //ngược lại không phải là số hoàn hảo
    else {
      System.out.println(a + " khong phai la so hoan thien");
    }
 
    System.out.println("\n------------------------------------");
  }
}