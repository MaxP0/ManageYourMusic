/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageyourmusic;

import java.util.ArrayList;

/**
 *
 * @author pylyp
 */
public class GenrePlaylist implements GenrePlaylistInterface{
    String genre;
    boolean repeatable = false;
    DoublylinkedList<Composition> compositions;
    DoublylinkedList.DoublyLinkedNode<Composition> head; 

    public GenrePlaylist(String genre) {
        this.genre = genre;
        this.compositions = new DoublylinkedList<>();
        this.head = null;
    }

    public void addComp(Composition comp){
        compositions.addLast(comp);
    }

    public void deleteComp(Composition comp) {
        compositions.remove(comp);
    }
    
    public void printPlaylist() {
        System.out.println("Playlist: " + genre);
        compositions.printList();
    }
    
    public ArrayList<String> getPlaylistStr() {
        ArrayList<String> playlistStrings = new ArrayList<>();
        DoublylinkedList.DoublyLinkedNode<Composition> current = compositions.getHead();

        while (current != null) {
            Composition comp = current.getData();
            playlistStrings.add(comp.toString());
            current = current.getNext();
        }

        return playlistStrings;
    }
    

    public int getCompCount() {
        return compositions.size();
    }
    
    public ArrayList<Composition> search(String keyword) {
        ArrayList<Composition> searchResults = new ArrayList<>();
        DoublylinkedList.DoublyLinkedNode<Composition> current = compositions.getHead();

        while (current != null) {
            Composition comp = current.getData();
            if (comp.getTitle().contains(keyword) || comp.getArtist().contains(keyword)) {
                searchResults.add(comp); // Add to search results if keyword is found
            }
            current = current.getNext();
        }
        return searchResults;
    }
    
    public void setRepeatable() {
        if (!repeatable == false && head != null){
            head.prev = compositions.tail;
            compositions.tail.next = head;
        } else if (repeatable && head != null) {
            head.prev = null;
            compositions.tail.next = null;
        }
    }
}
