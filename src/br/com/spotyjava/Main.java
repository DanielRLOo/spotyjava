package br.com.spotyjava;

import br.com.spotyjava.model.audio.Audio;
import br.com.spotyjava.model.audio.AudioFormats;
import br.com.spotyjava.model.audio.audiobook.AudioBook;
import br.com.spotyjava.model.audio.audiobook.LiteraryGenres;
import br.com.spotyjava.model.audio.music.Music;
import br.com.spotyjava.model.audio.music.MusicGenres;
import br.com.spotyjava.model.audio.podcast.Podcast;
import br.com.spotyjava.model.audio.podcast.PodcastTopics;

public class Main {
    public static void main(String[] args) {
        
        Music music = new Music("Imagine", 
            AudioFormats.MP3, 
            300, 
            "John Lennon", 
            "Imagine", 
            MusicGenres.POP);

        Music music2 = new Music("Everybody Wants to Rule the World", 
            AudioFormats.MP3, 
            300, 
            "Tears for Fears", 
            "Songs from the Big Chair", 
            MusicGenres.POP);

        Music music3 = new Music("The Sound of Silence",
            AudioFormats.MP3,
            300,
            "Simon & Garfunkel",
            "The Sound of Silence",
            MusicGenres.POP);
        
        Podcast podcast = new Podcast("The Joe Rogan Experience",
            AudioFormats.MP3,
            300,
            new String[]{"Joe Rogan"},
            new String[]{"Joe Rogan" , "Jack Black", "Brian Redban"},
            PodcastTopics.NEWS);
        
        Podcast podcast2 = new Podcast("The Strange, Dark and Mysterious",
            AudioFormats.MP3,
            300,
            new String[]{"MrBallen"},
            new String[]{"MrBallen"},
            PodcastTopics.LITERATURE);

        AudioBook audioBook = new AudioBook("The Lord of the Rings",
            AudioFormats.MP3,
            300,
            "J.R.R. Tolkien",
            "Rob Inglis",
            LiteraryGenres.FANTASY);
        
        AudioBook audioBook2 = new AudioBook("I Am Legend",
            AudioFormats.MP3,
            300,
            "Richard Matheson",
            "Ralph Lister",
            LiteraryGenres.HORROR);

        AudioBook audioBook3 = new AudioBook("The Hitchhiker's Guide to the Galaxy",
            AudioFormats.MP3,
            300,
            "Douglas Adams",
            "Stephen Fry",
            LiteraryGenres.SCIENCE_FICTION);
        
        // List of all audios
        Audio[] audios = new Audio[]{music, music2, music3, podcast, podcast2, audioBook, audioBook2, audioBook3}; 
        for (Audio audio : audios) {
            audio.play();
        }

        for (Audio audio : audios) {
            if (audio.isListened()) {
                if (audio instanceof Music) {
                    System.out.println("Music listened: " + audio.name());
                } else if (audio instanceof Podcast) {
                    System.out.println("Podcast listened: " + audio.name());
                } else if (audio instanceof AudioBook) {
                    System.out.println("AudioBook listened: " + audio.name());
                }
            }
        }
    }
}
