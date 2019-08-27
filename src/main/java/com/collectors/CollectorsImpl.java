package com.collectors;

import com.domain.Artist;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class CollectorsImpl {
    private static Comparator<Artist> byNameLength = comparing(artist -> artist.getName().length());
    public String getLongestName(List<Artist> artists){
        Artist longestName = artists.stream().collect(Collectors.maxBy(byNameLength)).orElse(null);
        return longestName.getName();
    }
}
