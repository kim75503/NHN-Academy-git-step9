package com.nhnacademy.model;

public enum Priority {
    LOW(1, "LOW"),
    MEDIUM(2, "MEDIUM"),
    HIGH(3, "HIGH");

    private final int level;
    private final String displaylevel; 

    private Priority(int level, String displaylevel) {
        this.level = level;
        this.displaylevel = displaylevel;
    }

    public static Priority fromlevel(int level){
        for(Priority p : values()){
            if(p.level == level){
                return p;
            }
        }
        throw new IllegalArgumentException("잘못된 중요도: " + level);
    }

    
}
