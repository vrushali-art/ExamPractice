package com.nidhibank.Enum;

public enum SmsInterval {
    MONTHLY("Monthly"),
    QUARTERLY("Quarterly"),
    HALF_YEARLY("HalfYearly"),
    YEARLY("Yearly");

    private String interval;

    SmsInterval(String interval) {
        this.interval = interval;
    }

    public String getInterval() {
        return interval;
    }

    @Override
    public String toString() {
        return this.interval;
    }
}

