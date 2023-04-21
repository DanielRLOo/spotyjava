package br.com.spotyjava.app.features.recommendation;

import br.com.spotyjava.model.audio.AudioFormats;
import br.com.spotyjava.model.audio.music.Music;
import br.com.spotyjava.model.audio.music.MusicalGenres;
import br.com.spotyjava.model.user.User;

public class ContentRecomendation {
    
    private static Music[] songs = {
        new Music("Mr. Brightside", AudioFormats.MP3, 2003, "Mr. Brightside", "The Killers", MusicalGenres.INDIE),
        new Music("The Scientist", AudioFormats.MP3, 2002, "A Rush of Blood to the Head", "Coldplay", MusicalGenres.INDIE),
        new Music("The Pretender", AudioFormats.MP3, 2005, "Echoes, Silence, Patience & Grace", "Foo Fighters", MusicalGenres.INDIE),
        new Music("Three Little Birds", AudioFormats.MP3, 1977, "Exodus", "Bob Marley & The Wailers", MusicalGenres.REGGAE),
        new Music("Georgia On My Mind", AudioFormats.MP3, 1960, "Ray Charles Sings For His Supper", "Ray Charles", MusicalGenres.JAZZ),
        new Music("I'm Yours", AudioFormats.MP3, 2008, "I'm Yours", "Jason Mraz", MusicalGenres.POP),
        new Music("Where's The Love", AudioFormats.MP3, 2003, "Elephunk", "Black Eyed Peas", MusicalGenres.POP),
    };

    private ContentRecomendation() {
    }

    public static Music[] recomend(User user) {
        MusicalGenres[] favoriteGenres = user.favouriteMusicalGenres();
        Music[] recommendedSongs = new Music[0];

        for (Music song : songs) {
            for (MusicalGenres genre : favoriteGenres) {
                if (song.genre() == genre) {
                    recommendedSongs = addSong(recommendedSongs, song);
                }
            }
        }

        return recommendedSongs;
    }

    private static Music[] addSong(Music[] songs, Music song) {
        Music[] newSongs = new Music[songs.length + 1];
        for (int i = 0; i < songs.length; i++) {
            newSongs[i] = songs[i];
        }
        newSongs[newSongs.length - 1] = song;
        return newSongs;
    }
}