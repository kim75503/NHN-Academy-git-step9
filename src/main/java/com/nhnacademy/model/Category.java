package com.nhnacademy.model;

public enum Category {
    WORK,
    STUDY,
    PERSONAL,
    HEALTH,
    OTHER;

    public static Category fromCategory(int selEnum){
        if( selEnum < 1 || selEnum > values().length){
            throw new IllegalArgumentException("잘못된 구분 번호: " + selEnum);

        }
        return values()[selEnum-1];
    }

}
