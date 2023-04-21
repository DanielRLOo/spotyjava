package br.com.spotyjava.model.audio;

public class Audio implements Playable{

    // Name of the audio
    private String name;

    // Types are defined in AudioType.java
    private AudioTypes type;

    // Formats are defined in AudioFormat.java
    private AudioFormats format;

    // Duration in seconds
    private int duration;

    // Audio has been listened to
    private boolean listened = false;

    // Protected constructor to prevent instantiation
    protected Audio(String name, AudioTypes type, AudioFormats format, int duration) {
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
