public class Main {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        int[][] field = new int[SIZE][SIZE];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};


        System.out.println("Default field");
        showField(field);
        int[][] result = checkField(field, agents);
        System.out.println("Final field");
        showField(result);
    }

    public static void showField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            int tmp[] = field[i];
            for (int j = 0; j < tmp.length; j++) {
                System.out.print(tmp[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] checkField(int[][] field, int[][] agents) {
        for (int[] check : agents) {
            int row = check[0]; // получили номер строки
            int column = check[1]; // получили номер столбца

            if (field[row][column] == 0) {
                field[row][column]++;
            } else {
                field[row][column] = field[row][column] * 2;
            }
        }
        return field;
    }


}