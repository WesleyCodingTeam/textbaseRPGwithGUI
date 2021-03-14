package com.wesleycodingteam;

public class MainCharacter {
    static String name; //MainCharacter name
    static String classType = "None"; //MainCharacter class
    static int lv = 0; //level
    static int str = 10; //strength
    static int wis = 10; //wisdom
    static int agi =10 ; //agility
    static int hpMax = 100; //maximum HP
    static int hpNow = 100; //current HP
    static int mpMax = 100; //maximum MP
    static int mpNow = 100; //current MP
    static int coin = 0; //money
    static int expRequired = 10;
    static int currentExp = 0;
    static int extraStat = 0;
    static int currentPart = 0; //current part in the story
    static String occupation = "villager";
    static String currentState = "Idle"; //tells what the character is doing idle, fighting, shoping etc.
    static double normalDamageMultiplier = 1.0;
    static String currentLocation = "Your House";
    static String currentField = "Town";
    //declaring field
    public static void makeStats(String nameChoice, int strChoice, int wisChoice, int agiChoice){
        name = nameChoice;
        str = strChoice;
        wis = wisChoice;
        agi = agiChoice;
    }
}
