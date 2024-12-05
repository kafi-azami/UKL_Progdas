import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int[] array = {5, -3, 7, 9, -1};
        ArrayList<Integer> negatif = new ArrayList<>();
        
        for (int num : array) {
            if (num < 0) {
                negatif.add(num);
            }
        }
        if (!negatif.isEmpty()) {
             System.out.println("Array mengandung elemen negatif: " + negatif);
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }
    }
}
