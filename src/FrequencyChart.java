import java.util.Scanner;
public class FrequencyChart {
    //class stuff
     //instance variable-s-
    private int[] array;
    int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    //Constructor
    public FrequencyChart(int[] array){
        this.array = array;
    }

    //methods
    public String makeChart(){

        return "yeet";
    }
    public void count(int val){
        if(val >= 1 && val <= 10){

        }
    }

    //end class stuff

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values are in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter each datum, followed by an enter");
        int val = 0;
        for(int i = 0; i < data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }
        FrequencyChart chart = new FrequencyChart();
        System.out.println(chart.makeChart());
    }
}
