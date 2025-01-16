package com.adriangevorgyan;

public class Main {
    public static void main(String[] args) {
        // Sample data for testing
        SharkData sharkData = new SharkData("Season 1", "Startup X", "Tech", 100000, 10.0, true);
        
        SharkTankDeal sharkTankDeal = new SharkTankDeal();
        double evaluationScore = sharkTankDeal.evaluateDeal(sharkData);
        
        System.out.println("The evaluation score for " + sharkData.getStartupName() + " is: " + evaluationScore + "%");
    }
}
