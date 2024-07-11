public class sum_of_all_elements_in_array {
    public static void main(String[] args) {
       int[] a={1,2,3,4,5};
       int s=0;
       for (int i = 0; i < a.length; i++) {
          s+=a[i];
       }
       System.out.println("Sum of elements in array : "+s);
    }
}
