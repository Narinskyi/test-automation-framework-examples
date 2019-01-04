package com.example.gui.models;

import java.util.Arrays;

public enum CarGear {
    AUTO("Auto"), MANUAL("Manual");

    private String displayedText;

    CarGear(String displayedText) {
        this.displayedText = displayedText;
    }

    public String getDisplayedText() {
        return displayedText;
    }

    public String[] getDisplayedValues() {
        return Arrays.stream(values()).map(v -> v.displayedText).toArray(String[]::new);
    }
}
