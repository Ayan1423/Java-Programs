package week05;
import java.util.Scanner;

public class Transpose_of_Matrix {
    public static void main(String[] args) {
        
        System.out.println("**This program is for finding Transpose of a matrix**\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix which you want to input :");
        int m = sc.nextInt();
        System.out.println("Enter number of columns of the matrix which you want to input :");
        int n = sc.nextInt();

        int [][]arr = new int[m][n];
        System.out.println("Enter the elements of your array :");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original array is as follows :\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        int [][]tran = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tran[i][j] = arr[j][i];
            }
        }

        System.out.println("\nTranspose of the Original array is as follows :\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tran[i][j]+"  ");
            }
            System.out.println();
        }
    }
}