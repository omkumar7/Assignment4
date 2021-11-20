public class MatrixAddition {
    public static void main(String args[]){

        int a[][]={{3,4,5},{1,5,2},{3,6,5}};
        int b[][]={{2,1,3},{5,3,6},{4,3,4}};

        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
           System.out.println();
        }
    }
}
