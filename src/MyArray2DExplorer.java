import java.util.Arrays;

public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();
        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();

    }

    //WRITE YOUR METHODS BELOW

    public boolean evenRow(int [][] mat, int row){
        int oof = 0;
            for(int e : mat[row]){
                 if(e %2 == 0){
                     oof++;
                 }
            }
        if(oof == mat[row].length){
            return true;
        }else{
            return false;
        }
    //returns true if the sum of the numbers the given col is odd.

    }


    public int[] minRow(int [][] matrix){
        int minNum = matrix[0][0];
        int[] minRow = matrix[0];
        for(int i = 0; i < matrix.length; i++){
            for (int e = 0; e < matrix[i].length; e++){
                if(matrix[i][e] < minNum){
                    minNum = matrix[i][e];
                    minRow = matrix[i];
                }
            }
        }
        return minRow;
    }

    //fix
    public int[] colMaxs(int[][] matrix){
        int min = matrix[0][0];
        int[] output = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            output[i] =  min;
        }
        return output;
    }
    public int[] allRowSums(int[][] matrix){
        int[] output = new int[matrix[0].length -1];
        int sum = 0;
        for(int i = 0; i < matrix.length ; i++) {
            sum = 0;
            for (int j = 0; j < matrix[0].length ; j++) {
                sum += matrix[i][j];
            }
            output[i] = sum;
        }
        return output;
    }

    //fix
    public double[] averageCol(int[][] matrix){
        double[] output = new double[matrix[0].length];
        double sum = 0;
        for(int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
            output[i] = sum/matrix[0].length;
        }
        return output;
    }

}
