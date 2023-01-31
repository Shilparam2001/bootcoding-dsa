package Search;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {62, 33, 3, 12, 10};
        insertionSort(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr);
        }
    }


    public static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length-1; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

}
