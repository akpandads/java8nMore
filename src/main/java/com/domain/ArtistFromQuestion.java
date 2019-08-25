package com.domain;

import java.util.List;
import java.util.Optional;

public class ArtistFromQuestion {
    private List<Artist> artists;

    public ArtistFromQuestion(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            return Optional.empty();
        }
        return Optional.of(artists.get(index));
    }


    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        return artist.isPresent() ? artist.get().getName() : "unknoewn";

    }
}
