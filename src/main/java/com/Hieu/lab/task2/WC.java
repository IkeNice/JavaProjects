package com.Hieu.lab.task2;

import java.util.HashMap;
import java.util.Map;

public class WC {

    private String text;
    private Map<String,Integer> words_col = new HashMap<>();

    public Map<String, Integer> getWords_col() {
        return words_col;
    }

    public WC(String text){
        this.text = text;
        Count();
    }

    Integer col(String word){
        return words_col.get(word);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> pair : words_col.entrySet()) {
            builder.append(pair.getKey()).append(" : ").append(pair.getValue()).append("\n");
        }
        return builder.toString();
    }

    public void Count(){
        String[] words = text.split("\\s+");
        for(String s: words){
            if (!s.equals("")) {
                int count = words_col.getOrDefault(s, 0);
                words_col.put(s, count + 1);
            }
        }
    }
}