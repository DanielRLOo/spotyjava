package br.com.spotyjava.model.audio.audiobook;

import br.com.spotyjava.model.audio.Audio;
import br.com.spotyjava.model.audio.AudioFormats;
import br.com.spotyjava.model.audio.AudioTypes;

public class AudioBook extends Audio{
    private String author;
    private String narrator;
    private LiteraryGenres genre;

    public AudioBook(String name, AudioFormats format, int duration, String author, String narrator, LiteraryGenres genre) {
        super(name, AudioTypes.AUDIOBOOK, format, duration);
        this.author = author;
        this.narrator = narrator;
        this.genre = genre;
    }

    public String author() {
        return author;
    }

    public String narrator() {
        return narrator;
    }

    public LiteraryGenres genre() {
        return genre;
    }
}
