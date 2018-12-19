package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution34 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if (sum <= 0) {
            return new ArrayList<>();
        }

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        int start = 1;
        int end = 2;
        int currentSum = start + end;
        while (end < sum) {
            if (currentSum < sum) {
                end += 1;
                currentSum += end;
            } else if (currentSum > sum) {
                currentSum -= start;
                start += 1;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    list.add(i);
                }
                lists.add(list);
                currentSum -= start;
                start += 1;
                end += 1;
                currentSum += end;
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = FindContinuousSequence(4);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
}
