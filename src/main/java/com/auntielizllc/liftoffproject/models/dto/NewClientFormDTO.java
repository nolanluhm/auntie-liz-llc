package com.auntielizllc.liftoffproject.models.dto;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewClientFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 2, max = 20, message = "Please enter a name between 2 and 20 characters long.")
    private String firstName;

    @NotNull
    @NotBlank
    @Size(min = 2, max = 30, message = "Please enter a name between 2 and 30 characters long.")
    private String lastName;

    @NotNull
    @NotBlank
    @Email
    private String email;

    @NotNull
    @NotBlank
    private String address;

    @Size(max = 30, message = "Please enter an address that is less than 30 characters.")
    private String address2;

    @NotNull
    @NotBlank
    @Size(min = 2, max = 35, message = "Please enter a city between 2 and 35 characters long.")
    private String city;

    @NotNull
    @NotBlank
    @Size(min = 4, max = 12, message = "Please enter a state between 4 and 12 characters long.")
    private String state;

    @NotNull
    @NotBlank
    @NumberFormat
    @Size(min = 5, max = 10, message = "Please enter a zip code between 4 and 12 characters long.")
    private String zipCode;

    private Boolean generalHousekeeping;
    private Boolean laundry;
    private Boolean dishes;
    private Boolean carpetShampooing;
    private Boolean wallCleaning;
    private Boolean carWash;
    private Boolean petNailTrim;
    private Boolean petEarCleaning;
    private Boolean petAnalGlandExpression;
    private Boolean petMedicine;

    private Boolean desiredServiceTime;

    @Size(max = 500, message = "Please enter instructions that are 500 characters or less.")
    private String instructions;

    private Boolean isNursingHomeEmployee;
    private Boolean isVeteran;
    private Boolean isSeniorCitizen;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 75, message = "Please enter a signature that is between 3 and 75 characters.")
    private String signature;

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

    public Boolean getGeneralHousekeeping() {
        return generalHousekeeping;
    }

    public void setGeneralHousekeeping(Boolean generalHousekeeping) {
        this.generalHousekeeping = generalHousekeeping;
    }

    public Boolean getLaundry() {
        return laundry;
    }

    public void setLaundry(Boolean laundry) {
        this.laundry = laundry;
    }

    public Boolean getDishes() {
        return dishes;
    }

    public void setDishes(Boolean dishes) {
        this.dishes = dishes;
    }

    public Boolean getCarpetShampooing() {
        return carpetShampooing;
    }

    public void setCarpetShampooing(Boolean carpetShampooing) {
        this.carpetShampooing = carpetShampooing;
    }

    public Boolean getWallCleaning() {
        return wallCleaning;
    }

    public void setWallCleaning(Boolean wallCleaning) {
        this.wallCleaning = wallCleaning;
    }

    public Boolean getCarWash() {
        return carWash;
    }

    public void setCarWash(Boolean carWash) {
        this.carWash = carWash;
    }

    public Boolean getPetNailTrim() {
        return petNailTrim;
    }

    public void setPetNailTrim(Boolean petNailTrim) {
        this.petNailTrim = petNailTrim;
    }

    public Boolean getPetEarCleaning() {
        return petEarCleaning;
    }

    public void setPetEarCleaning(Boolean petEarCleaning) {
        this.petEarCleaning = petEarCleaning;
    }

    public Boolean getPetAnalGlandExpression() {
        return petAnalGlandExpression;
    }

    public void setPetAnalGlandExpression(Boolean petAnalGlandExpression) {
        this.petAnalGlandExpression = petAnalGlandExpression;
    }

    public Boolean getPetMedicine() {
        return petMedicine;
    }

    public void setPetMedicine(Boolean petMedicine) {
        this.petMedicine = petMedicine;
    }

    public Boolean getDesiredServiceTime() {
        return desiredServiceTime;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setDesiredServiceTime(Boolean desiredServiceTime) {
        this.desiredServiceTime = desiredServiceTime;
    }

    public Boolean getNursingHomeEmployee() {
        return isNursingHomeEmployee;
    }

    public void setNursingHomeEmployee(Boolean nursingHomeEmployee) {
        isNursingHomeEmployee = nursingHomeEmployee;
    }

    public Boolean getVeteran() {
        return isVeteran;
    }

    public void setVeteran(Boolean veteran) {
        isVeteran = veteran;
    }

    public Boolean getSeniorCitizen() {
        return isSeniorCitizen;
    }

    public void setSeniorCitizen(Boolean seniorCitizen) {
        isSeniorCitizen = seniorCitizen;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

}
