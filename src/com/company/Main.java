package com.company;

public class Main {

    public static void main(String[] args) {
        int day1 = 9;
        int day2 = 3;
        dayOfWeek(day1);
        dayOfWeek2(day2);

    }
    public static void dayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("invalid number");
        }
    }
    public static void dayOfWeek2(int day) {
        if(day > 7 || day < 0){
            System.out.println("Invalid number");
        }
        for(int i = 0; i < 7; i++){
            switch(i){
                case 0 -> System.out.println("Sunday");
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
            }
        }
    }
}
