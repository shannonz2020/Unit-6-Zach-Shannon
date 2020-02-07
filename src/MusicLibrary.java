public class MusicLibrary {
    private Album[] albumList;
    private int spotsUsed = 0;

    /*private String temp = "";
    private String temp2 = "";
    private int tempInt = 0;
    private double tempDouble = 0.0;*/

    public MusicLibrary(){
        albumList = new Album[10];
    }

    public void add(Album album){
            if(spotsUsed == albumList.length){
                System.out.println("All spots full");
            }else{
                albumList[spotsUsed] = album;
                spotsUsed++;
            }
    }

    public void doubleSize(){
        Album[] newAlbumList = new Album[albumList.length + albumList.length];
        for(int i = 0; i < albumList.length -1; i++){
            newAlbumList[i] = albumList[i];
        }
        albumList = newAlbumList;
    }

    public void remove(int index){
        //albumList[index] = new Album(temp, temp2, tempInt, tempDouble);
        for(int i = index; i < albumList.length -2; i++){
            albumList[i] = albumList[i + 1];
        }
        spotsUsed--;
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < albumList.length - 1; i++){
            if(albumList[i] != null){
                result+= albumList[i];
                result+= "\n******************************************\n";
            }
        }
        return result;
    }
}
