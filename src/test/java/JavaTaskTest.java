import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTaskTest {

    @Test
    public void testCountElements() {
        int[] nums = {1, 2, 3, 2, 1, 3, 3, 4, 5, 4};

        Map<Integer, Integer> expectedCountMap = new HashMap<>();
        expectedCountMap.put(1, 2);
        expectedCountMap.put(2, 2);
        expectedCountMap.put(3, 3);
        expectedCountMap.put(4, 2);
        expectedCountMap.put(5, 1);

        Map<Integer, Integer> countMap = JavaTask.countElements(nums);

        assertEquals(expectedCountMap, countMap);
    }
}
