public class MyArray2DExplorer {

    public static void main(String[] args) {
        int[][] array = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        //System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        //System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("}");

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


    public int[] minRow(int [][] mat){
        int minNum = mat[0][0];
        int[] minRow = mat[0];
        for(int i = 0; i < mat.length; i++){
            for (int e = 0; e < mat[i].length; e++){
                if(mat[i][e] < minNum){
                    minNum = mat[i][e];
                    minRow = mat[i];
                }
            }
        }
        return minRow;
    }









}
