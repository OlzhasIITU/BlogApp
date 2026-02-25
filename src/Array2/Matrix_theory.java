package Array2;

public class Matrix_theory {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, -4}, // matrix[0]
                {5, 6, 7, 8},  // matrix[1]
                {9, 10, -11, 12} // matrix[2]
                // matrix.length = 0,1,2 = 3 ке тен
                // matrix[i].length                    0 1 2 3 index of matrix
                // example массивтің ішіндегі бір жол {1,2,3,-4 } деген бір строканы алсақ соның узындығын
                // matrix[i].length 4 ке тең 4 элемент бар
        };


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(matrix[i][j] > 0)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
