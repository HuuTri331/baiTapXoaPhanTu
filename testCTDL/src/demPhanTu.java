import java.util.HashSet;

public class demPhanTu {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 3};

        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int i : arr) {
            uniqueElements.add(i);
        }

        int[] uniqueArray = new int[uniqueElements.size()];
        int index = 0;
        for (int i : uniqueElements) {
            uniqueArray[index++] = i;
        }

        for (int i : uniqueArray) {
            System.out.print(i + " ");
        }
    }
}
