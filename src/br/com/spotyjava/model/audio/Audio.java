package br.com.spotyjava.model.audio;

import br.com.spotyjava.model.Model;

public class Audio extends Model implements Playable{

    // Name of the audio
    protected String name;

    // Types are defined in AudioType.java
    protected AudioTypes type;

    // Formats are defined in AudioFormat.java
    protected AudioFormats format;

    // Duration in seconds
    protected int duration;

    // Audio has been listened to
    protected boolean listened = false;

    // Protected constructor to prevent instantiation
    protected Audio(String name, AudioTypes type, AudioFormats format, int duration) {
        super();
        this.name = name;
        this.type = type;
        this.format = format;
        this.duration = duration;
    }

    public String name() {
        return name;
    }

    public AudioTypes type() {
        return type;
    }

    public AudioFormats format() {
        return format;
    }

    public int duration() {
        return duration;
    }

    public boolean isListened() {
        return listened;
    }

    public void play() {
        listened = true;
    }
}
