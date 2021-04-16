package com.auntielizllc.liftoffproject.models;

public enum AppointmentType {

    SINGLE("One time"),
    BI_WEEKLY("Bi-weekly"),
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
