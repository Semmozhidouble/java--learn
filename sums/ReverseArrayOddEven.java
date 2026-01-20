package sums;

public class ReverseArrayOddEven {
   public class ReverseOddEven {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];

        int e = 0, o = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even[e++] = arr[i];
            else
                odd[o++] = arr[i];
        }
        for (int i = 0; i < e / 2; i++) {
            int temp = even[i];
            even[i] = even[e - 1 - i];
            even[e - 1 - i] = temp;
        }
        for (int i = 0; i < o / 2; i++) {
            int temp = odd[i];
            odd[i] = odd[o - 1 - i];
            odd[o - 1 - i] = temp;
        }
        e = 0;
        o = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                arr[i] = even[e++];
            else
                arr[i] = odd[o++];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

    
}
