package ru.kazakov.MySecondTestAppSpringBoot2.model;

import lombok.Getter;

@Getter
public enum Positions {
    DEV(2.2, false),
    HR(1.2, false),
    SEO(2.6, false),
    CEO(3.0, true),
    CDO(4.0, true),
    CCO(5.0, true);

    @Getter
    private final double positionCoefficient;
    private final boolean isManager;

    Positions(double positionCoefficient, boolean isManager) {
        this.positionCoefficient = positionCoefficient;
        this.isManager = isManager;
    }

    public boolean isManager() {
        return isManager;
    }
}