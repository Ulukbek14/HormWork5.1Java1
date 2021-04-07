package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.health = 500;
        b1.damage = 50;
        b1.typeofDefense = "FireShield";
        System.out.println(" health " + b1.health + " damage " + b1.damage + " typeofDefense " + b1.typeofDefense);
    }
 }