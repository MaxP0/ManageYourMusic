/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package manageyourmusic;

import java.util.ArrayList;

/**
 *
 * @author pylyp
 */
public interface LikedPlaylistInterface {
    void pushComp(Composition comp);
    void deleteComp(Composition comp);
    public Composition popComp();
    void printPlaylist();
    int getCompCount();
    boolean isEmpty();
    ArrayList<Composition> search(String keyword);
}
