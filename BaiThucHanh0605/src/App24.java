
import java.util.Scanner;
import java.util.ArrayList;

public class App24{
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu trong arrayList:  ");
        int n = scanner.nextInt();
        for( int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": " );
            number = scanner.nextInt();
            arrListInteger.add(number);
        }
       
        int max = arrListInteger.get(0);
        for(int i = 1; i < arrListInteger.size(); i++ );
        if (arrListInteger.get(1).compareTo(max) > 0) {
          
            max = arrListInteger.get(1);
        }
        System.out.println("Phan tu lon nhat trong arrListInterger =" + max);
    }
}
