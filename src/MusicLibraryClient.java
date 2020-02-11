public class MusicLibraryClient {
        public static void main(String[] args) {
            MusicLibrary myLibrary = new MusicLibrary();

            Album a1 = new Album("First", "one Guy", 10, 42.5);
            Album a2 = new Album("This Music", "Some Band", 9, 36);
            Album a3 = new Album("Yeetus", "McGeetus", 69, 420);
            Album a4 = new Album("Ima hoe", "Juulian Brinkley", 1, 0.1);
            Album a5 = new Album("I", "Really", 234, 243);
            Album a6 = new Album("Need", "Some", 85, 777);
            Album a7 = new Album("More", "Good", 1, 66);
            Album a8 = new Album("Cowbell", "Songs", 76, 77);
            Album a9 = new Album("Spongebob Theme", "The Captain", 1, 291);
            Album a10 = new Album("Die, Die, Die", "An hoe", 1, .05);



            myLibrary.add(a1);
            myLibrary.add(a2);
            myLibrary.add(a3);
            myLibrary.add(a4);
            myLibrary.add(a5);
            myLibrary.add(a6);
            myLibrary.add(a7);
            myLibrary.add(a8);
            myLibrary.add(a9);
            myLibrary.add(a10);

            int i = myLibrary.searchByArtist("one Guy");
            System.out.println(i);

            //System.out.println(myLibrary);


            /*System.out.println(myLibrary);


            myLibrary.doubleSize();

            System.out.println(myLibrary);


            myLibrary.remove(1);

            System.out.println(myLibrary);

            int libr = myLibrary.findTitle("Second");

            System.out.println(myLibrary.getAlbum(libr));*/
        }
}
