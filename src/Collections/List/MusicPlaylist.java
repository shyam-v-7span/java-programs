import java.util.*;

class Playlist {
    LinkedList<String> songs = new LinkedList<>();

    Playlist(){
        songs.add("song a");
        songs.add("song b");
        songs.add("song c");
    }

    // Add song at the beginning
    public void addSongAtStarting(String song) {
        songs.addFirst(song);
    }

    // Add song at a specific position
    public void addSongAtPosition(int position, String song) {
        int index = position - 1; 
        if (index < 0 || index > songs.size()) {
            System.out.println("Invalid position!");
            return;
        }
        songs.add(index, song);
    }

    public void removeSong(int position) {
        int index = position - 1; 
        if (index < 0 || index >= songs.size()) {
            System.out.println("Invalid position!");
            return;
        }
        songs.remove(index);
    }    

    // Display the playlist
    public void displayPlaylist() {
        System.out.println("Playlist: " + songs);
    }

    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();

        System.out.println("playlist:");
        myPlaylist.displayPlaylist();

        // insert at the beginning
        myPlaylist.addSongAtStarting("Song X");
        System.out.println("after adding at starting:");
        myPlaylist.displayPlaylist();

        // insert in the middle
        myPlaylist.addSongAtPosition(2, "Song Y");
        System.out.println("after adding at position 2:");
        myPlaylist.displayPlaylist();

        //remove from given position
        myPlaylist.removeSong(3);
        System.out.println("after removing 3");
        myPlaylist.displayPlaylist();
    }
}
