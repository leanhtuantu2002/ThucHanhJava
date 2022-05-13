import java.util.LinkedHashMap;
import java.util.Set;

public class App95 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        // thêm phần tử vào linkedHashMap
        linkedHashMap.put(1,"JAVA");
        linkedHashMap.put(5,"C++");
        linkedHashMap.put(4,"PHP");
        linkedHashMap.put(2,"PYTHON");
        System.out.println("Hien thi linkedHashMap: ");
        show(linkedHashMap);
        // xóa phần tử thức hai trong linkedHashMap
        linkedHashMap.remove(2);
        System.out.println(linkedHashMap);
    }
        // phương thức show
    public static void show (LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println("key "+ " " + linkedHashMap.get(key));
        }
    }
}