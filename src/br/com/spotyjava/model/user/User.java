package br.com.spotyjava.model.user;

import br.com.spotyjava.model.audio.audiobook.AudioBook;
import br.com.spotyjava.model.audio.audiobook.LiteraryGenres;
import br.com.spotyjava.model.audio.music.Music;
import br.com.spotyjava.model.audio.music.MusicalGenres;
import br.com.spotyjava.model.audio.podcast.Podcast;
import br.com.spotyjava.model.audio.podcast.PodcastTopics;
import br.com.spotyjava.model.user.playlist.Playlist;

public class User {
    private String name;
    private String email;
    private MusicalGenres[] favouriteMusicalGenres;
    private Music[] favouriteSongs;
    private Music[] listenedSongs;
    private Playlist[] playlists;
    private PodcastTopics[] favouritePodcastTopics;
    private Podcast[] favouritePodcasts;
    private Podcast[] listenedPodcasts;
    private LiteraryGenres[] favouriteLiteraryGenres;
    private AudioBook[] favouriteAudiobooks;
    private AudioBook[] listenedAudiobooks;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String name() {
        return name;
    }

    public String email() {
        return email;
    }

    public MusicalGenres[] favouriteMusicalGenres() {
        return favouriteMusicalGenres;
    }

    public PodcastTopics[] favouritePodcastTopics() {
        return favouritePodcastTopics;
    }

    public LiteraryGenres[] favouriteLiteraryGenres() {
        return favouriteLiteraryGenres;
    }

    public void addFavouriteMusicalGenres(MusicalGenres... genres) {
        this.favouriteMusicalGenres = genres;
    }

    public void addFavouritePodcastTopics(PodcastTopics... topics) {
        this.favouritePodcastTopics = topics;
    }

    public void addFavouriteLiteraryGenres(LiteraryGenres... genres) {
        this.favouriteLiteraryGenres = genres;
    }

    public Music[] favouriteSongs() {
        return favouriteSongs;
    }

    public Music[] listenedSongs() {
        return listenedSongs;
    }

    public Podcast[] favouritePodcasts() {
        return favouritePodcasts;
    }

    public Podcast[] listenedPodcasts() {
        return listenedPodcasts;
    }

    public AudioBook[] favouriteAudiobooks() {
        return favouriteAudiobooks;
    }

    public AudioBook[] listenedAudiobooks() {
        return listenedAudiobooks;
    }

    public void addFavouriteSongs(Music... songs) {
        this.favouriteSongs = songs;
    }

    public void addListenedSongs(Music... songs) {
        this.listenedSongs = songs;
    }

    public void addFavouritePodcasts(Podcast... podcasts) {
        this.favouritePodcasts = podcasts;
    }

    public void addListenedPodcasts(Podcast... podcasts) {
        this.listenedPodcasts = podcasts;
    }

    public void addFavouriteAudiobooks(AudioBook... audiobooks) {
        this.favouriteAudiobooks = audiobooks;
    }

    public void addListenedAudiobooks(AudioBook... audiobooks) {
        this.listenedAudiobooks = audiobooks;
    }

    public Playlist[] playlists() {
        return playlists;
    }   
}