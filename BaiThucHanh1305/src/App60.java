import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class App60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> linkedHashset = new LinkedHashSet<String>();
        linkedHashset.add("JAVA");
        linkedHashset.add("C++");
        linkedHashset.add("PYTHON");
        linkedHashset.add("PHP");
        // show linkedHashset
        for(String str : linkedHashset){
            System.out.println(str);
        }
        // xóa một phần tử bất kỳ
        System.out.println("Nhap phan tu xoa bat ky: ");
        String name = scanner.nextLine();
        if(linkedHashset.contains(name)){
            linkedHashset.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu trong linkedHashset la: ");
            System.out.println(linkedHashset);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
    }
}