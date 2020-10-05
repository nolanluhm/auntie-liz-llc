package com.auntielizllc.liftoffproject.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Customer extends AbstractEntity {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String phoneNumber;

    @NotNull
    private String address;

    @NotNull
    private String address2;

    @NotNull
    private String city;

    @NotNull
    private String state;

    @NotNull
    private String zipCode;

    private Boolean isGeneralHousekeeping;
    private Boolean isLaundry;
    private Boolean isDishes;
    private Boolean isCarpetShampooing;
    private Boolean isWallCleaning;
    private Boolean isCarWash;
    private Boolean isPetNailTrim;
    private Boolean isPetEarCleaning;
    private Boolean isPetAnalGlandExpression;
    private Boolean isPetMedicine;

    private AppointmentType type;

    @NotNull
    private String instructions;

    private Boolean isNursingHomeEmployee;
    private Boolean isVeteran;
    private Boolean isSeniorCitizen;

    @NotNull
    private String signature;

    public Customer(@NotNull String firstName, @NotNull String lastName, @NotNull String email, @NotNull String phoneNumber, @NotNull String address, @NotNull String address2, @NotNull String city, @NotNull String state, @NotNull String zipCode, Boolean isGeneralHousekeeping, Boolean isLaundry, Boolean isDishes, Boolean isCarpetShampooing, Boolean isWallCleaning, Boolean isCarWash, Boolean isPetNailTrim, Boolean isPetEarCleaning, Boolean isPetAnalGlandExpression, Boolean isPetMedicine, AppointmentType type, @NotNull String instructions, Boolean isNursingHomeEmployee, Boolean isVeteran, Boolean isSeniorCitizen, @NotNull String signature) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isGeneralHousekeeping = isGeneralHousekeeping;
        this.isLaundry = isLaundry;
        this.isDishes = isDishes;
        this.isCarpetShampooing = isCarpetShampooing;
        this.isWallCleaning = isWallCleaning;
        this.isCarWash = isCarWash;
        this.isPetNailTrim = isPetNailTrim;
        this.isPetEarCleaning = isPetEarCleaning;
        this.isPetAnalGlandExpression = isPetAnalGlandExpression;
        this.isPetMedicine = isPetMedicine;
        this.type = type;
        this.instructions = instructions;
        this.isNursingHomeEmployee = isNursingHomeEmployee;
        this.isVeteran = isVeteran;
        this.isSeniorCitizen = isSeniorCitizen;
        this.signature = signature;
    }

    public Customer() {}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName);
    }
}
