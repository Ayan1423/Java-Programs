import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of both 2D array's: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        System.out.println("Enter elements of 1st array: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[m][n];
        System.out.println("Enter elements of 2nd array: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] arr3 = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
               arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Addition of two matrix: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr3[i][j]+"  ");
            }
            System.out.println();
        }
    }
}