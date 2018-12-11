package JianZhiOffer;

public class Solution8 {
    public int JumpFloorII(int target) {
        if (target <= 1) {
            return target;
        }

       return JumpFloorII(target - 1) * 2;
    }
}
