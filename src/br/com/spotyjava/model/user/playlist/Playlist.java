package br.com.spotyjava.model.user.playlist;

import br.com.spotyjava.model.audio.music.Music;

public class Playlist {
    private String name;
    private String description;
    private Music[] songs;

    public Playlist(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public Music[] songs() {
        return songs;
    }

    public void addSongs(Music... songs) {
        this.songs = songs;
    }

    public void removeSong(String name) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].name().equals(name)) {
                songs[i] = null;
            }
        }
    }
}