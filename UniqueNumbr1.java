import java.util.*;

class UniqueNumber1 {
    public static int[] uni(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == Integer.MIN_VALUE)
                continue;
            boolean isUnique = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == Integer.MIN_VALUE)
                    continue;
                if (a[i] == a[j]) {
                    a[j] = Integer.MIN_VALUE;
                    isUnique = false;
                    count++;
                }
            }
            if (!isUnique) {
                a[i] = Integer.MIN_VALUE;
                count++;
            }
        }
        
        int[] res = new int[a.length - count];
        int index = 0;
        for (int num : a) {
            if (num != Integer.MIN_VALUE) {
                res[index++] = num;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] a = {8, 3, 8, 4, 3, 5, 6, 6};
        System.out.println("Original array: " + Arrays.toString(a));
        int[] uniqueNumbers = uni(a);
        System.out.println("Unique numbers: " + Arrays.toString(uniqueNumbers));
    }
}