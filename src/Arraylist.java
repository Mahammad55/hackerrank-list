import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkQueries(sc);
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

    public static void checkQueries(Scanner sc) {
        List<ArrayList<Integer>> dynamicalArray = getDynamicalList(sc);
        int countOfQueries = sc.nextInt();
        while (countOfQueries-- > 0) {
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
            try {
                System.out.println(dynamicalArray.get(firstNumber - 1).get(secondNumber - 1));
            } catch (Exception ex) {
                System.out.println("ERROR!");
            }
        }
    }
}
