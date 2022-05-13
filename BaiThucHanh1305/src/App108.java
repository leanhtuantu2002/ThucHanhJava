import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class App108 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1,9d);
        treeMap.put(4,10.1d);
        treeMap.put(2,7.2d);
        treeMap.put(8,20.28d);
       System.out.println("Cac phan tu trong treeMap la: ");
       Set<Map.Entry<Integer,Double>> setTreeMap = treeMap.entrySet();
       treeMap.replace(4,20.11d);
       treeMap.replace(2, 7.2d, 10.5d);
       System.out.println("Cac phan tu cua treeMap sau khi thay the la: ");
       setTreeMap = treeMap.entrySet();
       System.out.println(setTreeMap);
    }
}