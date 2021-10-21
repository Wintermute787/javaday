package com.company;

public class Main {

    public static void main(String[] args) {
        int day1 = 9;
        int day2 = 4;
        dayOfWeek(day1);
        dayOfWeek2(day2);
        double interest[] = {1,2,3,4,5,6,7,8};
        double amount = 10000.00;

        int count = 0;
        for(int i = 10;  i< 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i + " is a prime number");
            }else if(count == 3){
                System.out.println("exiting loop");
                break;
            }
        }



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
        }else {
            for(int i = 0; i < day; i++){
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
    public static void calculateInterestRate(double amount, double interestRate[]){

        for(int i = 0; i < interestRate.length; i++){
            double x = interestRate[i];
            System.out.println("interest rate at " + x + "%" + " is " + String.format("%.2f", amount * (x/100) ) );
        }
        //return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
