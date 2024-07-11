
import java.util.Arrays;

public class sorting_array {
    public static void main(String[] args)
    {
        int[] a={3,3,7,4,5,2};
        System.out.println("Array before sorting"+Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Array after sorting"+Arrays.toString(a));

    }
}
