import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    }

    public static ArrayList<Integer> getArrayList(Scanner sc) {
        int countOfArr = sc.nextInt();
        ArrayList<Integer> subArray = new ArrayList<>();
        for (int i = 0; i < countOfArr; i++) {
            subArray.add(sc.nextInt());
        }
        return subArray;
    }

    public static List<ArrayList<Integer>> getDynamicalList(Scanner sc) {
        int countOfLoop = sc.nextInt();
        List<ArrayList<Integer>> array = new ArrayList<>();
        while (countOfLoop-- > 0) {
            array.add(getArrayList(sc));
        }
        return array;
    }
}
