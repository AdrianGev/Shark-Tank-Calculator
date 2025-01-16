package com.adriangevorgyan;

import java.util.HashMap;

public class SharkTankDeal {

    private HashMap<String, Double> industrySuccessRates;
    private double categoryScore;
    private double averageDealPercentage;

    public SharkTankDeal() {
        industrySuccessRates = new HashMap<>();
        initializeIndustrySuccessRates();
    }

    private void initializeIndustrySuccessRates() {
        // Example data; update these with actual percentages from your dataset
        industrySuccessRates.put("Tech", 20.0);
        industrySuccessRates.put("Health", 25.0);
        industrySuccessRates.put("Fashion", 15.0);
        industrySuccessRates.put("Food", 30.0);
        industrySuccessRates.put("Electronics", 20.0);
        // Add more industries as needed
    }

    public double evaluateDeal(SharkData sharkData) {
        categoryScore = 0.0;

        // Calculate score based on industry
        String industry = sharkData.getIndustry();
        if (industrySuccessRates.containsKey(industry)) {
            categoryScore += industrySuccessRates.get(industry);
        }

        // Calculate score based on original ask amount
        double originalAsk = sharkData.getOriginalAsk();
        categoryScore += calculateAskScore(originalAsk);

        // Calculate score based on equity offered
        double equityOffered = sharkData.getEquityOffered();
        categoryScore += calculateEquityScore(equityOffered);

        // Final evaluation: average score
        averageDealPercentage = categoryScore / 3; // Assuming three categories for average

        return averageDealPercentage; // Return the final evaluation score
    }

    private double calculateAskScore(double originalAsk) {
        // Example thresholds; modify these based on your dataset analysis
        if (originalAsk < 50000) {
            return 30.0; // Higher chance for lower asks
        } else if (originalAsk < 100000) {
            return 20.0;
        } else if (originalAsk < 200000) {
            return 10.0;
        } else {
            return 5.0; // Lower chance for higher asks
        }
    }

    private double calculateEquityScore(double equityOffered) {
        // Example thresholds; modify these based on your dataset analysis
        if (equityOffered < 5.0) {
            return 30.0; // More favorable for lower equity offered
        } else if (equityOffered < 10.0) {
            return 20.0;
        } else if (equityOffered < 20.0) {
            return 10.0;
        } else {
            return 5.0; // Less favorable for high equity
        }
    }
}
