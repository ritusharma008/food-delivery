import java.util.*;
public class java1 {
    public static void main(String[] args) {
        int[] arr = {8,4,6,2,7};
        Arrays.sort(arr);

        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println("\n");
        for(int i = arr.length-1; i>=0; --i) {
            System.out.print(arr[i] + " ");
        }

        

    }
    
}
