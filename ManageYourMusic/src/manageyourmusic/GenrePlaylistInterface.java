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
public interface GenrePlaylistInterface {
    void addComp(Composition comp);
    void deleteComp(Composition comp);
    ArrayList<String> getPlaylistStr();
    int getCompCount();
    void setRepeatable();
    ArrayList<Composition> search(String keyword);
    void printPlaylist();
}
