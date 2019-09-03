import java.util.ArrayList;
import java.util.List;

public class NoSafeThread {
    ArrayList<Integer> nums = new ArrayList<>();

    public NoSafeThread() {
        nums.add(1);
    }

    public void setNums(ArrayList<Integer> nums) {
        this.nums = nums;
    }
}
