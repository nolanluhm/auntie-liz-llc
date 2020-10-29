package com.auntielizllc.liftoffproject.models.dto;

import com.auntielizllc.liftoffproject.models.AppointmentType;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewClientFormDTO {

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

    @Size(max = 500, message = "Please enter instructions that are 500 characters or less.")
    private String instructions;

    private Boolean isNursingHomeEmployee;
    private Boolean isVeteran;
    private Boolean isSeniorCitizen;

    @NotNull(message = "Signature is required.")
    @NotBlank(message = "Signature is required.")
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

    public Boolean getGeneralHousekeeping() {
        return isGeneralHousekeeping;
    }

    public void setGeneralHousekeeping(Boolean generalHousekeeping) {
        isGeneralHousekeeping = generalHousekeeping;
    }

    public Boolean getLaundry() {
        return isLaundry;
    }

    public void setLaundry(Boolean laundry) {
        isLaundry = laundry;
    }

    public Boolean getDishes() {
        return isDishes;
    }

    public void setDishes(Boolean dishes) {
        isDishes = dishes;
    }

    public Boolean getCarpetShampooing() {
        return isCarpetShampooing;
    }

    public void setCarpetShampooing(Boolean carpetShampooing) {
        isCarpetShampooing = carpetShampooing;
    }

    public Boolean getWallCleaning() {
        return isWallCleaning;
    }

    public void setWallCleaning(Boolean wallCleaning) {
        isWallCleaning = wallCleaning;
    }

    public Boolean getCarWash() {
        return isCarWash;
    }

    public void setCarWash(Boolean carWash) {
        isCarWash = carWash;
    }

    public Boolean getPetNailTrim() {
        return isPetNailTrim;
    }

    public void setPetNailTrim(Boolean petNailTrim) {
        isPetNailTrim = petNailTrim;
    }

    public Boolean getPetEarCleaning() {
        return isPetEarCleaning;
    }

    public void setPetEarCleaning(Boolean petEarCleaning) {
        isPetEarCleaning = petEarCleaning;
    }

    public Boolean getPetAnalGlandExpression() {
        return isPetAnalGlandExpression;
    }

    public void setPetAnalGlandExpression(Boolean petAnalGlandExpression) {
        isPetAnalGlandExpression = petAnalGlandExpression;
    }

    public Boolean getPetMedicine() {
        return isPetMedicine;
    }

    public void setPetMedicine(Boolean petMedicine) {
        isPetMedicine = petMedicine;
    }

    public AppointmentType getType() {
        return type;
    }

    public void setType(AppointmentType type) {
        this.type = type;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
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
