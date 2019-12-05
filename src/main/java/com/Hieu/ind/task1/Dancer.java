package com.Hieu.ind.task1;

public class Dancer {

    private int dancerId;
    private String dancerName;
    private String dancerStyle;

    public Dancer(int dancerId, String dancerName, String dancerStyle){
        this.dancerId = dancerId;
        this.dancerName = dancerName;
        this.dancerStyle = dancerStyle;
    }

    public int getDancerId() {
        return dancerId;
    }
    public String getDancerName() {
        return dancerName;
    }
    public String getDancerStyle() {
        return dancerStyle;
    }
}
