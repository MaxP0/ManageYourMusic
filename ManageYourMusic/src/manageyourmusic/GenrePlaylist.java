/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageyourmusic;

/**
 *
 * @author pylyp
 */
public class GenrePlaylist implements GenrePlaylistInterface{
    String genre;
    DoublyLinkedList<Composition> compositions;

    public GenrePlaylist(String genre) {
        this.genre = genre;
        this.compositions = new DoublyLinkedList<>();
    }

    public void addComp(Composition comp) {
        compositions.addLast(comp);
    }

    public void deleteComp(Composition comp) {
        compositions.remove(comp);
    }

    public void printPlaylist() {
        System.out.println("Playlist: " + genre);
        compositions.printList();
    }

    public int getCompCount() {
        return compositions.size();
    }

    public void createRepeatablePlaylist() {
        // Implementation to create a repeatable playlist
    }
}
