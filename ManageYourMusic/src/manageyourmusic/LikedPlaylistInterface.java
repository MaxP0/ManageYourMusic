/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package manageyourmusic;

/**
 *
 * @author pylyp
 */
public interface LikedPlaylistInterface {
    void addComp(Composition song);
    void deleteComp(Composition song);
    Composition peekLastAddedComp();
    void printPlaylist();
    int getCompCount();
    void createRepeatablePlaylist();
}
