package com.auntielizllc.liftoffproject.models.dto;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProductOrderFormDTO {

    @NotNull(message = "Name is required.")
    @NotBlank(message = "Name is required.")
    @Size(min = 2, max = 20, message = "Please enter a name between 2 and 20 characters long.")
    private String firstName;

    @NotNull(message = "Name is required.")
    @NotBlank(message = "Name is required.")
    @Size(min = 2, max = 30, message = "Please enter a name between 2 and 30 characters long.")
    private String lastName;

    @NotNull(message = "Email is required.")
    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email. Try again.")
    @Size(max = 40, message = "Please enter an email less than 40 characters long.")
    private String email;

    @NotNull(message = "Phone number is required.")
    @NotBlank(message = "Phone number is required.")
    @Size(min = 10, max = 14, message = "Phone number must be between 10 and 14 characters.")
    private String phoneNumber;

    @NotNull(message = "Address is required.")
    @NotBlank(message = "Address is required.")
    private String address;

    @Size(max = 30, message = "Please enter an address that is less than 30 characters.")
    private String address2;

    @NotNull(message = "City is required.")
    @NotBlank(message = "City is required.")
    @Size(min = 2, max = 35, message = "Please enter a city between 2 and 35 characters long.")
    private String city;

    @NotNull(message = "State is required.")
    @NotBlank(message = "State is required.")
    private String state;

    @NotNull(message = "ZIP code is required.")
    @NotBlank(message = "ZIP code is required.")
    @NumberFormat
    @Size(min = 5, max = 10, message = "Please enter a zip code between 4 and 12 characters long.")
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

    @NotNull(message = "Product quantity is required.")
    @NotBlank(message = "Product quantity is required.")
    @Size(max = 100, message = "Please do not exceed 100 characters.")
    private String quantity;

    private String deliveryMethod;
    private String paymentMethod;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Boolean getHandSoap() {
        return isHandSoap;
    }

    public void setHandSoap(Boolean handSoap) {
        isHandSoap = handSoap;
    }

    public Boolean getBarSoap() {
        return isBarSoap;
    }

    public void setBarSoap(Boolean barSoap) {
        isBarSoap = barSoap;
    }

    public Boolean getLotion() {
        return isLotion;
    }

    public void setLotion(Boolean lotion) {
        isLotion = lotion;
    }

    public Boolean getAllPurposeCleaner() {
        return isAllPurposeCleaner;
    }

    public void setAllPurposeCleaner(Boolean allPurposeCleaner) {
        isAllPurposeCleaner = allPurposeCleaner;
    }

    public Boolean getAirFreshener() {
        return isAirFreshener;
    }

    public void setAirFreshener(Boolean airFreshener) {
        isAirFreshener = airFreshener;
    }

    public Boolean getCandle() {
        return isCandle;
    }

    public void setCandle(Boolean candle) {
        isCandle = candle;
    }

    public Boolean getDoggieShampoo() {
        return isDoggieShampoo;
    }

    public void setDoggieShampoo(Boolean doggieShampoo) {
        isDoggieShampoo = doggieShampoo;
    }

    public Boolean getPbTreat() {
        return isPbTreat;
    }

    public void setPbTreat(Boolean pbTreat) {
        isPbTreat = pbTreat;
    }

    public Boolean getOatmealTreat() {
        return isOatmealTreat;
    }

    public void setOatmealTreat(Boolean oatmealTreat) {
        isOatmealTreat = oatmealTreat;
    }

    public Boolean getDoggieCake() {
        return isDoggieCake;
    }

    public void setDoggieCake(Boolean doggieCake) {
        isDoggieCake = doggieCake;
    }

    public Boolean getTunaTreat() {
        return isTunaTreat;
    }

    public void setTunaTreat(Boolean tunaTreat) {
        isTunaTreat = tunaTreat;
    }

    public Boolean getCatToy() {
        return isCatToy;
    }

    public void setCatToy(Boolean catToy) {
        isCatToy = catToy;
    }

    public Boolean getBandanna() {
        return isBandanna;
    }

    public void setBandanna(Boolean bandanna) {
        isBandanna = bandanna;
    }

    public Boolean getBowtie() {
        return isBowtie;
    }

    public void setBowtie(Boolean bowtie) {
        isBowtie = bowtie;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
