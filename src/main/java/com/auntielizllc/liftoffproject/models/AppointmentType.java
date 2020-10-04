package com.auntielizllc.liftoffproject.models;

public enum AppointmentType {

    SINGLE("One time"),
    WEEKLY("Weekly"),
    MONTHLY("Monthly"),
    OTHER("Other");

    private final String displayName;

    AppointmentType(String appointmentType) {
        this.displayName = appointmentType;
    }

    public String getDisplayName() {
        return displayName;
    }
}
