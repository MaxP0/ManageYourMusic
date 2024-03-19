/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageyourmusic;

import java.util.Stack;

/**
 *
 * @author pylyp
 */
public class LikedPlaylist implements LikedPlaylistInterface{
    Stack<Composition> compositions;

    public LikedPlaylist() {
        this.compositions = new Stack<>();
    }

    public void addComp(Composition comp) {
        compositions.push(comp);
    }

    public void deleteComp(Composition comp) {
        compositions.remove(comp);
    }

    public Composition popLastAddedSong() {
        return compositions.isEmpty() ? null : compositions.pop();
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

    public void createRepeatablePlaylist() {
        // Implementation to create a repeatable playlist
    }
}
