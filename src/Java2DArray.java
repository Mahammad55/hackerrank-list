import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> getDynamical2DArray(Scanner sc){
        List<List<Integer>> dynamicalArray=new ArrayList<>();
        for(int i=0;i<6;i++){
            List<Integer> subArray=new ArrayList<>();
            for(int j=0;j<6;j++){
                subArray.add(sc.nextInt());
            }
            dynamicalArray.add(subArray);
        }
        return dynamicalArray;
    }
}
