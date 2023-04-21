package br.com.spotyjava.model.audio.podcast;

import br.com.spotyjava.model.audio.Audio;
import br.com.spotyjava.model.audio.AudioFormats;
import br.com.spotyjava.model.audio.AudioTypes;

public class Podcast extends Audio{
    private String[] hosts;
    private String[] participants;
    private PodcastTopics topic;

    public Podcast(String name, AudioFormats format, int duration, String[] hosts, String[] participants, PodcastTopics topic) {
        super(name, AudioTypes.PODCAST, format, duration);
        this.hosts = hosts;
        this.participants = participants;
        this.topic = topic;
    }

    public String[] host() {
        return hosts;
    }

    public String[] participants() {
        return participants;
    }

    public PodcastTopics topic() {
        return topic;
    }
}
