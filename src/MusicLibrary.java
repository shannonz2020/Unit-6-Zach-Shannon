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
                result+= albumList[i] + "\n";
            }
        }
        return result;
    }

    public int findTitle(String title){
        for(int i = 0; i < albumList.length; i++){
            if(title.equals(albumList[i].getAlbumName())){
                return i;
            }
        }
        return -1;
    }

    public int findArtist(String findArtist){
        for(int i = 0; i < albumList.length; i++){
            if(findArtist.equals(albumList[i].getArtistName())){
                return i;
            }
        }
        return -1;
    }

    public Album getAlbum(int index){
        if(index >= 0 && index < albumList.length){
            return albumList[index];
        }else{
            return null;
        }
    }

    public void sortByTitle(){
        Album temp;
        int min;
        for(int i = 0; i < albumList.length -1; i++){
            min = i;
            for(int j = i; j < albumList.length; j++){
                if(albumList[i] != null && albumList[j] != null){
                    if (albumList[j].getAlbumName().compareTo(albumList[min].getAlbumName()) < 0) {
                        min = j;
                    }
                }
            }
            temp = albumList[min];
            albumList[min] = albumList[i];
            albumList[i] = temp;
        }
    }

    public void sortByArtist(){
        for(int i = 1; i < albumList.length; i++){
            Album key = albumList[i];
            int position = i;
            if(albumList[i] != null) {
                while (position > 0 && albumList[position - 1].getArtistName().compareTo(key.getArtistName()) > 0) {
                    albumList[position] = albumList[position - 1];
                    position--;
                }
                albumList[position] = key;
            }
        }
    }
    public int searchByArtist(String artist) {
        sortByArtist();
        int low = 0, high = albumList.length-1, middle = (low + high)/2;

        while (!albumList[middle].getArtistName().equals(artist) && low <= high){
            if (artist.compareTo(albumList[middle].getArtistName()) < 0)
                high = middle - 1;
            else
                low = middle + 1;
            middle = (low + high)/2;
        }

        if (albumList[middle].getArtistName().equals(artist))
            return middle;
        else
            return -1;
    }
}
