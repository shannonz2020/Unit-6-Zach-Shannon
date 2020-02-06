public class MusicLibrary {
    private Album[] albumList;
    private int spotsUsed = 0;

    private String temp = "";
    private String temp2 = "";
    private int tempInt = 0;
    private double tempDouble = 0.0;

    public MusicLibrary(){
        albumList = new Album[10];
    }

    public void add(Album album){
        albumList[spotsUsed] = album;
        spotsUsed++;
    }

    public void doubleSize(){

    }
    //working on shifting array indexes
    public void remove(int index){
        albumList[index] = new Album(temp, temp2, tempInt, tempDouble);
        spotsUsed--;
    }
}
