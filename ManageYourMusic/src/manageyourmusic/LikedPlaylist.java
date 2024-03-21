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
public class LikedPlaylist implements LikedPlaylistInterface{
    ArrayList<Composition> compositions;

    public LikedPlaylist() {
        compositions = new ArrayList<>();
    }

    public void pushComp(Composition comp) {
        compositions.add(0, comp);
    }

    public void deleteComp(Composition comp) {
        compositions.remove(comp);
    }

    public Composition popComp() {
        if (!(compositions.isEmpty())){
            return compositions.remove(0);
        }else{
            return null;
        }
    }

    public void printPlaylist() {
        System.out.println("Liked Playlist:");
        for (Composition comp : compositions) {
            System.out.println(comp.title + " - " + comp.artist);
        }
    }

    public int getCompCount() {
        return compositions.size();
    }
    
    public boolean isEmpty(){
        return compositions.isEmpty();
    }
    
    public ArrayList<Composition> search(String keyword) {
        ArrayList<Composition> searchResults = new ArrayList<>();
        for (Composition comp : compositions) {
            if (comp.title.contains(keyword) || comp.artist.contains(keyword)) {
                searchResults.add(comp);
            }
        }
        return searchResults;
    }
}
