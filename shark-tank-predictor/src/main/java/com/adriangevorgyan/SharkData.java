package com.adriangevorgyan;

public class SharkData {
    private String season;
    private String startupName;
    private String industry;
    private double originalAsk;
    private double equityOffered;
    private boolean gotDeal;

    // Constructor
    public SharkData(String season, String startupName, String industry, double originalAsk, double equityOffered, boolean gotDeal) {
        this.season = season;
        this.startupName = startupName;
        this.industry = industry;
        this.originalAsk = originalAsk;
        this.equityOffered = equityOffered;
        this.gotDeal = gotDeal;
    }

    // Getters
    public String getSeason() {
        return season;
    }

    public String getStartupName() {
        return startupName;
    }

    public String getIndustry() {
        return industry;
    }

    public double getOriginalAsk() {
        return originalAsk;
    }

    public double getEquityOffered() {
        return equityOffered;
    }

    public boolean isGotDeal() {
        return gotDeal;
    }

    // Setters
    public void setSeason(String season) {
        this.season = season;
    }

    public void setStartupName(String startupName) {
        this.startupName = startupName;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setOriginalAsk(double originalAsk) {
        this.originalAsk = originalAsk;
    }

    public void setEquityOffered(double equityOffered) {
        this.equityOffered = equityOffered;
    }

    public void setGotDeal(boolean gotDeal) {
        this.gotDeal = gotDeal;
    }
}
