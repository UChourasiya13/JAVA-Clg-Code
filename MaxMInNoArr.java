public class MaxMInNoArr {
    public void max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < 3; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("MAX num in array is :" + max);
    }

       public void min(int arr[]){
        int min = arr[0] ;
        for (int i = 1 ; i < 3; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("MAX num in  array is :" + min);

    }

    public static void main(String[] args) {
        int[] arr = {44, 11 , 2};
        MaxMInNoArr m = new MaxMInNoArr();
        m.max(arr);
        m.min(arr);
    }
}
