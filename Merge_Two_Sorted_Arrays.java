package week05;

public class Merge_Two_Sorted_Arrays {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,5};
        int[] arr2 = {5,6,7,8,9};
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];
        int i = arr1.length - 1, j = arr2.length - 1, k = arr3.length - 1;

        while(i >= 0 && j >= 0){
            if(arr1[i] > arr2[j]){
                arr3[k--] = arr1[i--];
            }
            else{
                arr3[k--] = arr2[j--];
            }
        }

        while(i >= 0){
            arr3[k--] = arr1[i--];
        }
        while(j >= 0){
            arr3[k--] = arr1[j--];
        }

        for(i = 0; i < size; i++){
            System.out.print(arr3[i] + ", ");
        }
    }
}