package Array2;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {-1, 11, -4, 9}
        };


        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int m = matrix[i].length;
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
