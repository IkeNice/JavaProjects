package com.Hieu.ind.task1;

import java.time.LocalDate;

public class Perfomances {

    private int perfomanceId;
    private String perfomancePlace;
    private LocalDate date;

    public Perfomances(int perfomanceId, String perfomancePlace, LocalDate date){
        this.perfomanceId = perfomanceId;
        this.perfomancePlace = perfomancePlace;
        this.date = date;
    }

}
