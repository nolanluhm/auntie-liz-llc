package com.auntielizllc.liftoffproject.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class ProductOrder extends AbstractEntity {

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
    private Boolean isCandle;
    private Boolean isDoggieShampoo;
    private Boolean isPbTreat;
    private Boolean isOatmealTreat;
    private Boolean isDoggieCake;
    private Boolean isTunaTreat;
    private Boolean isCatToy;
    private Boolean isBandanna;
    private Boolean isBowtie;

    @NotNull
    private String quantity;

    private String deliveryMethod;
    private String paymentMethod;

    public ProductOrder(@NotNull String firstName, @NotNull String lastName, @NotNull String email, @NotNull String phoneNumber, @NotNull String address, @NotNull String address2, @NotNull String city, @NotNull String state, @NotNull String zipCode, Boolean isHandSoap, Boolean isBarSoap, Boolean isLotion, Boolean isAllPurposeCleaner, Boolean isAirFreshener, Boolean isCandle, Boolean isDoggieShampoo, Boolean isPbTreat, Boolean isOatmealTreat, Boolean isDoggieCake, Boolean isTunaTreat, Boolean isCatToy, Boolean isBandanna, Boolean isBowtie, @NotNull String quantity, String deliveryMethod, String paymentMethod) {
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
        this.isCandle = isCandle;
        this.isDoggieShampoo = isDoggieShampoo;
        this.isPbTreat = isPbTreat;
        this.isOatmealTreat = isOatmealTreat;
        this.isDoggieCake = isDoggieCake;
        this.isTunaTreat = isTunaTreat;
        this.isCatToy = isCatToy;
        this.isBandanna = isBandanna;
        this.isBowtie = isBowtie;
        this.quantity = quantity;
        this.deliveryMethod = deliveryMethod;
        this.paymentMethod = paymentMethod;
    }

    public ProductOrder() {}

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
        return "Product Order{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName);
    }
}
