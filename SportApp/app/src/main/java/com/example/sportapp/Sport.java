package com.example.sportapp;

public class Sport {
    private String name;
    private String description;
    private int imageResId;

    private Sport(String name,String description,int imageResId){
        this.name = name;
        this.description = description;
        this.imageResId = imageResId;
    }

    public static final Sport[] sports = {
            new Sport("Футбол","Спортивная игра двух команд (по 11 игроков в каждой)," +
                    "состоящая в том, что игроки ударами ноги забивают мяч в ворота противника.",R.drawable.football),
            new Sport("Хоккей","Коммандая игра на льду на коньках в небольшой мяч или шайбу" +
                    "ударяемые клюшкой.",R.drawable.hockey),
            new Sport("Волейбол","Спортивная игра в мяч, перебрасываемый руками через сетку " +
                    "от одной команды другой.",R.drawable.volleyball),
            new Sport("Регби","Спортивная коммандная игра с овальным мячом, который игроки "+
                    "передают друг другу руками или ногами, стараясь пересечь линию ворот противника.",R.drawable.rugby)
//            new Sport("","",R.drawable),
    };

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getImageResId(){
        return imageResId;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
