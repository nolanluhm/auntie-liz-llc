package com.auntielizllc.liftoffproject.models;

public enum AppointmentType {

    SINGLE("One time"),
    MONTHLY("Monthly"),
    WEEKLY("Weekly"),
    OTHER("Other");

    private final String displayName;

    AppointmentType(String appointmentType) {
        this.displayName = appointmentType;
    }

    public String getDisplayName() {
        return displayName;
    }
}
