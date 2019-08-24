package com.streams;

import com.domain.Album;
import com.domain.Artist;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonOperations{

    public Integer addUp(Stream<Integer> numbers){
        Optional<Integer> sum = numbers.reduce((tempSum, num)-> tempSum+num);
        if(sum.isPresent())
            return sum.get();
        else
            return 0;
    }

    public List<String> getArtistNameAndOrigin(List<Artist> artists){
        List<String> nameOriginCOmbines = artists.stream()
                .map(artist -> (artist.getName()+artist.getOrigin()))
                .collect(Collectors.toList());
        return nameOriginCOmbines;
    }

    public List<Album> getAlbumMaxThreeTracks(List<Album> albums){
        List<Album> filteredAlbum = albums.stream()
                .filter(album -> album.getTracks().size()>3)
                .collect(Collectors.toList());
        return filteredAlbum;
    }

    //convert below method to stream
    /*int totalMembers = 0;
    for (Artist artist : artists) {
        Stream<Artist> members = artist.getMembers();
        totalMembers += members.count();
    }*/

    public Integer internalIteration(List<Artist> artists){
        Integer count = artists.stream()
                .map(artist -> artist.getMembers().size())
                .reduce(0 , Integer::sum).intValue();
        return count;
    }

    public static int getNumberOfLowerCaseChars(String s){
        int lowerCaseCount =(int) s.chars()
                .filter(Character::isLowerCase)
                .count();

        return lowerCaseCount;
    }

    public String getStringWithMostLowerCaseCharachters(List<String> stringList){
        Optional<String> mostLowerCaseString = stringList.stream().max(Comparator.comparing(CommonOperations::getNumberOfLowerCaseChars));
        return mostLowerCaseString.isPresent() ? mostLowerCaseString.get() : "";
    }

}
