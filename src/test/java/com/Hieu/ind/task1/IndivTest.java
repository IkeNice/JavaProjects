package com.Hieu.ind.task1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;
import java.util.Arrays;

public class IndivTest {
    @Test
    public void indivTest(){
        Style hiphop = new Style(1,"Hip Hop");
        Style popping = new Style(2,"Popping");

        Dancer dytto = new Dancer(1, "Dytto", popping );
        Dancer fikshun = new Dancer(2, "Fik-Shun", popping);
        Dancer benChung = new Dancer(3, "Ben Chung", hiphop);
        Dancer anthonyLee = new Dancer(4, "Anthony Lee", hiphop);

        DanceCrew noCrew = new DanceCrew(1,"No crew", Arrays.asList(dytto, fikshun));
        DanceCrew jabbawockez = new DanceCrew(2,"Jabbawockez", Arrays.asList(anthonyLee));
        DanceCrew kinjaz = new DanceCrew(3,"Kinjaz", Arrays.asList(benChung));

        Cities la = new Cities(1,"Los Angeles");
        Cities ny = new Cities(2,"New York");
        Cities atlanta = new Cities(3,"Atlanta");



        Performances per1 = new Performances(1, la, jabbawockez, LocalDateTime.of(2019,7,13,13,00));
        Performances per2 = new Performances(2, atlanta, kinjaz, LocalDateTime.of(2019,7,13,14,00));
        Performances per3 = new Performances(3, ny, kinjaz, LocalDateTime.of(2019,7,13,14,00));

        Concerts con = new Concerts(Arrays.asList(per1, per2, per3));
        Assertions.assertEquals(Arrays.asList(per2, per3), con.findDancer(benChung));
        Assertions.assertEquals(Arrays.asList(per1), con.findDancer(anthonyLee));
    }
}
