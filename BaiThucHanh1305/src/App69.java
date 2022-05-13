import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> treesetInteger = new TreeSet<>();
        // thêm các phần tử vào treesetInteger
        treesetInteger.add(0);
        treesetInteger.add(3);
        treesetInteger.add(1);
        treesetInteger.add(4);
        treesetInteger.add(2);
        treesetInteger.add(8);
        System.out.println("Cac phan tu trong treesetInteger: ");
        System.out.println(treesetInteger);
        System.out.println("Nhap phan tu can them: ");
        
        int number = scanner.nextInt();
        if(!treesetInteger.contains(number)){
            treesetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong treesetInteger: ");
            System.out.println(treesetInteger);
        } else {
            System.out.println("Phan tu: " + number + " da ton tai!");
        }
    }
}