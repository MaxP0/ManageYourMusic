/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package manageyourmusic;

/**
 *
 * @author pylyp
 */
public interface GenrePlaylistInterface {
    void addComp(Composition comp);
    void deleteComp(Composition comp);
    void printPlaylist();
    int getCompCount();
    void createRepeatablePlaylist();
}
