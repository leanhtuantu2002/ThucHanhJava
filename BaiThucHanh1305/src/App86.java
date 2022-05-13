import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App86 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        // thêm value và key tương ứng vào hashMap sử dụng phương thức put()
        hashMap.put("CSLT","Co so lap trinh");
        hashMap.put("C++","C++");
        hashMap.put("C#","C Sharp");
        hashMap.put("PHP","PHP");
        hashMap.put("JAVA","JAVA");
        // tạo 1 Set có tên là setHashMap chứa toàn bộ các entry (vừa key, value)
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
    }
}
    

