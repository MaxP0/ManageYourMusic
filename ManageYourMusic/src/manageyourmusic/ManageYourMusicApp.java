/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manageyourmusic;

/**
 *
 * @author pylyp
 */
public class ManageYourMusicApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create LikedPlaylist
        LikedPlaylist likedPlaylist = new LikedPlaylist();

        // Add three songs to liked playlist
        Composition song1 = new Composition("Song 1", "Artist 1", "Genre 1");
        Composition song2 = new Composition("Song 2", "Artist 2", "Genre 2");
        Composition song3 = new Composition("Song 3", "Artist 3", "Genre 3");

        likedPlaylist.addComp(song1);
        likedPlaylist.addComp(song2);
        likedPlaylist.addComp(song3);

        // Print Liked Playlist
        System.out.println("Liked Playlist:");
        likedPlaylist.printPlaylist();
        System.out.println("Song count in Liked Playlist: " + likedPlaylist.getCompCount());

        // Create GenrePlaylist 1
        GenrePlaylist genrePlaylist1 = new GenrePlaylist("Genre 1");

        // Move the last added song from liked playlist to genre playlist 1
        Composition lastAddedSong = likedPlaylist.popLastAddedSong();
        if (lastAddedSong != null) {
            genrePlaylist1.addComp(lastAddedSong);
            System.out.println("Moved song '" + lastAddedSong.title + "' to 'Genre 1' playlist.");
        } else {
            System.out.println("No songs in the liked playlist.");
        }

        // Print Genre Playlist 1
        System.out.println("\nGenre Playlist 1:");
        genrePlaylist1.printPlaylist();
        System.out.println("Song count in Genre Playlist 1: " + genrePlaylist1.getCompCount());
    }
    
}
