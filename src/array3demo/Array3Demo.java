package array3demo;
public class Array3Demo {
    public static void main(String[] args) {
        int A[][][] = { {{11,32,65}, {78,94,76}, {79,44,65}, {89,122,73}} , {{32,56,89}, {43,23,32}, {32,56,78}, {94,78,45}}};
        int i,j,k,max = A[0][0][0];
        for (int l = 0; l < A.length; l++) 
            for (int m = 0; m < A[l].length; m++) 
                for (int n = 0; n < A[l][m].length; n++) 
                    if (max < A[l][m][n]) 
                        max = A[l][m][n];
        System.out.println("max = " + max);
    }
}
