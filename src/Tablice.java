public class Tablice {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9};
        int[] y = new int[10];

        y[4] = 15;
        y[6] = 30;

        System.out.println(x[6]);
        System.out.println(y[4]);

        System.out.println(x);
        System.out.println(y);

        String[] strings = new String[5];
        long[] longs = new long[100];
        long liczba;

        long[][] tab2D = new long[5][5];
        tab2D[2][3] = 56;

        System.out.println(tab2D[2][3]);

        int[][][] tab3D= new int[3][3][3];

        int[][][][][] tab5D = new int[5][5][5][5][5];

        int[][] cos = {
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6}
        };

        int[][][] cos2 = {
                {{1,2}, {2,3}, {3,4}},
                {{1,2}, {2,3}, {3,4}},
                {{1,2}, {2,3}, {3,4}},
        };

        int[][] z = cos2[0];
        int[] z2 = z[0];
        int z3 = z2[0];
    }
}
