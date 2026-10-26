package com.pluralsight;

public class Test {
    public static void main(String[] args) {

        int[] testScores = new int[10];
        int sum = 0;
        int greatest = 0, lowest = 1000;


        for (int i = 0; i < 10; i++) {
            testScores[i] = randomize();
            sum+=testScores[i];

            if(testScores[i]>greatest){
                greatest = testScores[i];
            }
            if(testScores[i]<lowest){
                lowest = testScores[i];
            }

        }
        int avg = sum/10;

        System.out.printf("""
                Score statistics:
                
                Average: %d
                High score: %d
                Low score: %d
                
                """, avg, greatest, lowest);





    }

    public static int randomize(){
        int num = (int)(Math.random() * (100 - 0+1))+0;
        return num;
    }
}
