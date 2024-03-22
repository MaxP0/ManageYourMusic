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
        LikedPlaylist likedPlaylist = new LikedPlaylist();
        GenrePlaylist genrePlaylist1 = new GenrePlaylist("Genre 1");
        GenrePlaylist genrePlaylist2 = new GenrePlaylist("Genre 2");
            
        Composition song1 = new Composition("Song 1", "Artist 1");
        Composition song2 = new Composition("Song 2", "Artist 2");
        Composition song3 = new Composition("Song 3", "Artist 3");
        likedPlaylist.pushComp(song1);
        likedPlaylist.pushComp(song2);
        likedPlaylist.pushComp(song3);
        
        genrePlaylist1.addComp(song2);
        genrePlaylist1.addComp(song3);
        genrePlaylist2.addComp(song3);
        
        
        HomeGUI homeGUI = new HomeGUI();
        homeGUI.setPlaylists(likedPlaylist, genrePlaylist1, genrePlaylist2);
        homeGUI.setVisible(true);
        
//        // Create LikedPlaylist
//        LikedPlaylist likedPlaylist = new LikedPlaylist();
//
//        // Add three songs to liked playlist
//        Composition song1 = new Composition("Song 1", "Artist 1");
//        Composition song2 = new Composition("Song 2", "Artist 2");
//        Composition song3 = new Composition("Song 3", "Artist 3");
//
//        likedPlaylist.pushComp(song1);
//        likedPlaylist.pushComp(song2);
//        likedPlaylist.pushComp(song3);
//
//        // Print Liked Playlist
//        System.out.println("Liked Playlist:");
//        likedPlaylist.printPlaylist();
//        System.out.println("Song count in Liked Playlist: " + likedPlaylist.getCompCount());
//
//        // Create GenrePlaylist 1
//        GenrePlaylist genrePlaylist1 = new GenrePlaylist("Genre 1");
//
//        // Move the last added song from liked playlist to genre playlist 1
//        Composition lastAddedSong = likedPlaylist.popComp();
//        if (lastAddedSong != null) {
//            genrePlaylist1.addComp(lastAddedSong);
//            System.out.println("Moved song '" + lastAddedSong.title + "' to 'Genre 1' playlist.");
//        } else {
//            System.out.println("No songs in the liked playlist.");
//        }
//
//        // Print Genre Playlist 1
//        System.out.println("\nGenre Playlist 1:");
//        genrePlaylist1.printPlaylist();
//        System.out.println("Song count in Genre Playlist 1: " + genrePlaylist1.getCompCount());
    }
    
}
