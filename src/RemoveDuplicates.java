import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 0, 1, 1, 2, 3));
        Sol sol = new Sol();

        int i = sol.removeDuplicates(numbers);
        System.out.println(i);

    }


}
class Sol{

    // two pointers solution
    public static int removeDuplicates(List<Integer> arr){
        int slow = 0;
        for(int fast = 0; fast < arr.size(); fast++){
            if(arr.get(fast) != arr.get(slow)){
                slow++;
                arr.set(slow, arr.get(fast));
            }
        }
        return slow + 1;

    }
}
