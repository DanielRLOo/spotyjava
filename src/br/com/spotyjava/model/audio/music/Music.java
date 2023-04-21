package br.com.spotyjava.model.audio.music;

import br.com.spotyjava.model.audio.Audio;
import br.com.spotyjava.model.audio.AudioFormats;
import br.com.spotyjava.model.audio.AudioTypes;

public class Music extends Audio {
    private String artist;
    private String album;
    private MusicGenres genre;

    public Music(String name, AudioFormats format, int duration, String artist, String album, MusicGenres genre) {
        super(name, AudioTypes.MUSIC, format, duration);
        this.artist = artist;
        this.album = album;
        this.genre = genre;
    }

    public String artist() {
        return artist;
    }

    public String album() {
        return album;
    }

    public MusicGenres genre() {
        return genre;
    }
}
