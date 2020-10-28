package com.auntielizllc.liftoffproject.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Order extends AbstractEntity {

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

    private Boolean isHandSoap;
    private Boolean isBarSoap;
    private Boolean isLotion;
    private Boolean isAllPurposeCleaner;
    private Boolean isAirFreshener;

    @NotNull
    private String quantity;

    private Boolean isDelivery;
    private Boolean isPickup;

    private Boolean isCashOrCheck;
    private Boolean isVenmo;
    private Boolean isPayPal;
    private Boolean isFacebook;
    private Boolean isUnsure;

    public Order(@NotNull String firstName, @NotNull String lastName, @NotNull String email, @NotNull String phoneNumber, @NotNull String address, @NotNull String address2, @NotNull String city, @NotNull String state, @NotNull String zipCode, Boolean isHandSoap, Boolean isBarSoap, Boolean isLotion, Boolean isAllPurposeCleaner, Boolean isAirFreshener, @NotNull String quantity, Boolean isDelivery, Boolean isPickup, Boolean isCashOrCheck, Boolean isVenmo, Boolean isPayPal, Boolean isFacebook, Boolean isUnsure) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isHandSoap = isHandSoap;
        this.isBarSoap = isBarSoap;
        this.isLotion = isLotion;
        this.isAllPurposeCleaner = isAllPurposeCleaner;
        this.isAirFreshener = isAirFreshener;
        this.quantity = quantity;
        this.isDelivery = isDelivery;
        this.isPickup = isPickup;
        this.isCashOrCheck = isCashOrCheck;
        this.isVenmo = isVenmo;
        this.isPayPal = isPayPal;
        this.isFacebook = isFacebook;
        this.isUnsure = isUnsure;
    }

    public Order() {}

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
        return "Order{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName);
    }
}
