import java.util.HashMap;
import java.util.Map;

public class JavaTask {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 3, 4, 5, 4, 2, 5, 5};
        System.out.println(countElements(nums));
    }
    public static Map<Integer, Integer> countElements(int[] numbers) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : numbers) {
            if (numsMap.containsKey(num)) {
                numsMap.put(num, numsMap.get(num) + 1);
            } else {
                numsMap.put(num, 1);
            }
        }
        return numsMap;
    }
}
