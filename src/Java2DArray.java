import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> dynamical2DArray = getDynamical2DArray(sc);
        System.out.println(getMaxSum(sc, dynamical2DArray));
    }

    public static int getMaxSum(Scanner sc, List<List<Integer>> myDynamicalList) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = myDynamicalList.get(i).get(j) +
                        myDynamicalList.get(i).get(j + 1) +
                        myDynamicalList.get(i).get(j + 2) +
                        myDynamicalList.get(i + 1).get(j + 1) +
                        myDynamicalList.get(i + 2).get(j) +
                        myDynamicalList.get(i + 2).get(j + 1) +
                        myDynamicalList.get(i + 2).get(j + 2);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static List<List<Integer>> getDynamical2DArray(Scanner sc) {
        List<List<Integer>> dynamicalArray = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            List<Integer> subArray = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                subArray.add(sc.nextInt());
            }
            dynamicalArray.add(subArray);
        }
        return dynamicalArray;
    }
}
