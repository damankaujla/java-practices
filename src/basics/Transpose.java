package basics;

public class Transpose {
    public static void main(String[] args) {
        int[][] a = {{1,3},{7,8},{3,4}};
        int[][] t = new int[a[0].length][a.length];
        for(int i =0; i< a[0].length; i++){
            for(int j =0; j< a.length; j++){
                t[i][j] = a[j][i];
                System.out.print(t[i][j] +" ");
            }
            System.out.println();
        }
    }
}
