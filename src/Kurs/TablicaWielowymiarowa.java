package Kurs;

public class TablicaWielowymiarowa {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 1}

        };

        for (int x = 0; x < matrix.length; x++) {
            int[] row = matrix[x];
            for (int y = 0; y < row.length; y++)
                System.out.println(row[y]);
        }
        int[] row = matrix[0];
        int cell1 = row[0];
        int cell2 = matrix[0][0];
        matrix[0][0] = 5;
        matrix[1] = new int[]{5, 6, 7};

    }
}
