import java.util.Arrays;
import java.util.List;

public class TwoSum {
//    2,7,11,15,1,5,8,3,0,9,6,3,1 target: 9

    public static void getTwoSum(List<Integer> list, int target){
        int currentDiff = 0;
        for(int element: list){
            currentDiff = target - element;
            if(list.contains(currentDiff)){
                System.out.printf("Pairs: (%d, %d)\n", element, currentDiff);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {2,7,11,15,1,5,8,3,0,9,6,3,1};
        getTwoSum(Arrays.asList(arr), 9);
    }
}
