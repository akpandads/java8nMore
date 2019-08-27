package com.collectors;

import com.collectors.interfaces.MapFibonacci;
import com.domain.Artist;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestCollectorsImpl {

    @Test
    public void testCollectors (){
        List<Artist> artists = new ArrayList<>();
        Artist artist1 = new Artist();
        artist1.setName("Ankit");
        Artist artist2 = new Artist();
        artist2.setName("Qwerty1");
        Artist artist3 = new Artist();
        artist3.setName("Asdfghj1");
        Artist artist4 = new Artist();
        artist4.setName("zxcvbnmasdfgh");

        artists.add(artist1);
        artists.add(artist2);
        artists.add(artist3);
        artists.add(artist4);

        System.out.println(new CollectorsImpl().getLongestName(artists));
    }

    @Test
    public void testWordCount(){
        Stream<String> names = Stream.of("John", "Paul", "George", "John",
                "Paul", "John");
        Map<String,Long> wordCOunted = new CollectorsImpl().countNumberOfNames(names);
        wordCOunted.entrySet().forEach((name)-> System.out.println(name));
    }

    @Test
    public void mapFibonacci(){
        System.out.println(new MapFibonacci().calculateFibonacci(6));
    }
}

