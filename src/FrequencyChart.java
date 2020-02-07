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
    /*public void count(int val){
        for(int i = 10; i <= 100; i++)
        findBounds();
    }

    }*/
    public void findBounds(int val, int a, int b){
        if(val >= 1 && val <= 10){
            count[0]++;
        }
    }

    //end class stuff

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values are in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter each datum, followed by an enter.");
        int val = 0;
        for(int i = 0; i < data.length -1; i++){
            val = scan.nextInt();
            data[i] = val;
        }
        FrequencyChart chart = new FrequencyChart(data);
        System.out.println(chart.makeChart());
    }
}
