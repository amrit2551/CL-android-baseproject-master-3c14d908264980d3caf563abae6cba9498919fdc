package com.skeleton.modal.signupResponse.updateuserprof;

import java.util.List;

/**
 * Created by admin23 on 18/5/17.
 */

public class UserDetails {
    private String id;
    private String createdAt;
    private String updatedAt;
    private String dob;
    private String countryCode;
    private String phoneNo;
    private String email;
    private String orientation;
    private String newNumber;
    private List<UserImage> userImages = null;
    private Boolean adminDeactivateAccount;
    private Integer timeOffset;
    private String gender;
    private String aboutMe;
    private Boolean step2CompleteOrSkip;
    private Boolean step1CompleteOrSkip;
    private List<Object> interestCategories = null;
    private ProfilePicURL profilePicURL;
    private Object defaultAddressId;
    private CurrentLocation currentLocation;
    private Boolean phoneVerified;
    private Boolean emailVerified;
    private String drinking;
    private String smoking;
    private String bodyType;
    private String height;
    private String religion;
    private String ethnicity;
    private String relationshipHistory;
    private Boolean notificationEnable;
    private Boolean directDateRequestEnable;
    private Boolean privacy;
    private Boolean isDisable;
    private String language;
    private Boolean firstTimeLogin;
    private String lastName;
    private String firstName;
    private String hometown;
    /**
     * @return id
     */
    public String getId() {
        return id;
    }
    /**
     * Setter method
     *
     * @param id : id of user
     */
    public void setId(final String id) {
        this.id = id;
    }
    /**
     * @return get created
     */
    public String getCreatedAt() {
        return createdAt;
    }
    /**
     * @param createdAt set created
     */
    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }
    /**
     * @return get Updated at
     */
    public String getUpdatedAt() {
        return updatedAt;
    }
    /**
     * @param updatedAt set update at
     */
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }
    /**
     * @return get dob
     */
    public String getDob() {
        return dob;
    }
    /**
     * @param dob set dob
     */
    public void setDob(final String dob) {
        this.dob = dob;
    }
    /**
     * @return get country code
     */
    public String getCountryCode() {
        return countryCode;
    }
    /**
     * @param countryCode country code
     */
    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }
    /**
     * @return get Phone number
     */
    public String getPhoneNo() {
        return phoneNo;
    }
    /**
     * @param phoneNo set Phone Number
     */
    public void setPhoneNo(final String phoneNo) {
        this.phoneNo = phoneNo;
    }
    /**
     * @return get Email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email set Email
     */
    public void setEmail(final String email) {
        this.email = email;
    }
    /**
     * @return orientation
     */
    public String getOrientation() {
        return orientation;
    }
    /**
     * @param orientation set orientation
     */
    public void setOrientation(final String orientation) {
        this.orientation = orientation;
    }
    /**
     * @return get new number
     */
    public String getNewNumber() {
        return newNumber;
    }
    /**
     * @param newNumber new number
     */
    public void setNewNumber(final String newNumber) {
        this.newNumber = newNumber;
    }
    /**
     * @return User images
     */
    public List<UserImage> getUserImages() {
        return userImages;
    }
    /**
     * @param userImages set Images
     */
    public void setUserImages(final List<UserImage> userImages) {
        this.userImages = userImages;
    }
    /**
     * @return get Admin deactivate Account
     */
    public Boolean getAdminDeactivateAccount() {
        return adminDeactivateAccount;
    }
    /**
     * @param adminDeactivateAccount set Admin deactivate account
     */
    public void setAdminDeactivateAccount(final Boolean adminDeactivateAccount) {
        this.adminDeactivateAccount = adminDeactivateAccount;
    }
    /**
     * @return get time off set
     */
    public Integer getTimeOffset() {
        return timeOffset;
    }
    /**
     * @param timeOffset set time off set
     */
    public void setTimeOffset(final Integer timeOffset) {
        this.timeOffset = timeOffset;
    }
    /**
     * @return get gender
     */
    public String getGender() {
        return gender;
    }
    /**
     * @param gender set gender
     */
    public void setGender(final String gender) {
        this.gender = gender;
    }
    /**
     * @return about me
     */
    public String getAboutMe() {
        return aboutMe;
    }
    /**
     * @param aboutMe set about me
     */
    public void setAboutMe(final String aboutMe) {
        this.aboutMe = aboutMe;
    }
    /**
     * @return get step2 or skip
     */
    public Boolean getStep2CompleteOrSkip() {
        return step2CompleteOrSkip;
    }
    /**
     * @param step2CompleteOrSkip set step2 complete or skip
     */
    public void setStep2CompleteOrSkip(final Boolean step2CompleteOrSkip) {
        this.step2CompleteOrSkip = step2CompleteOrSkip;
    }
    /**
     * @return get step1 complete ir skip
     */
    public Boolean getStep1CompleteOrSkip() {
        return step1CompleteOrSkip;
    }
    /**
     * @param step1CompleteOrSkip set step1 complete or skip
     */
    public void setStep1CompleteOrSkip(final Boolean step1CompleteOrSkip) {
        this.step1CompleteOrSkip = step1CompleteOrSkip;
    }
    /**
     * @return list get
     */
    public List<Object> getInterestCategories() {
        return interestCategories;
    }
    /**
     * @param interestCategories list set
     */
    public void setInterestCategories(final List<Object> interestCategories) {
        this.interestCategories = interestCategories;
    }
    /**
     * @return profile Pic URL
     */
    public ProfilePicURL getProfilePicURL() {
        return profilePicURL;
    }
    /**
     * @param profilePicURL set Profile Pic URL
     */
    public void setProfilePicURL(final ProfilePicURL profilePicURL) {
        this.profilePicURL = profilePicURL;
    }
    /**
     * @return default Address ID
     */
    public Object getDefaultAddressId() {
        return defaultAddressId;
    }
    /**
     * @param defaultAddressId set default id
     */
    public void setDefaultAddressId(final Object defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }
    /**
     * @return current location
     */
    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }
    /**
     * @param currentLocation set current location
     */
    public void setCurrentLocation(final CurrentLocation currentLocation) {
        this.currentLocation = currentLocation;
    }
    /**
     * @return get Phone verified
     */
    public Boolean getPhoneVerified() {
        return phoneVerified;
    }
    /**
     * @param phoneVerified phone verified
     */
    public void setPhoneVerified(final Boolean phoneVerified) {
        this.phoneVerified = phoneVerified;
    }
    /**
     * @return get email verified
     */
    public Boolean getEmailVerified() {
        return emailVerified;
    }
    /**
     * @param emailVerified email verifed
     */
    public void setEmailVerified(final Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }
    /**
     * @return drinking
     */
    public String getDrinking() {
        return drinking;
    }
    /**
     * @param drinking drinking
     */
    public void setDrinking(final String drinking) {
        this.drinking = drinking;
    }
    /**
     * @return get smoking
     */
    public String getSmoking() {
        return smoking;
    }
    /**
     * @param smoking set user smoking
     */
    public void setSmoking(final String smoking) {
        this.smoking = smoking;
    }
    /**
     * @return get user body type
     */
    public String getBodyType() {
        return bodyType;
    }
    /**
     * @param bodyType set user body type
     */
    public void setBodyType(final String bodyType) {
        this.bodyType = bodyType;
    }
    /**
     * @return get height
     */
    public String getHeight() {
        return height;
    }
    /**
     * @param height set user height
     */
    public void setHeight(final String height) {
        this.height = height;
    }
    /**
     * @return get religion
     */
    public String getReligion() {
        return religion;
    }
    /**
     * @param religion set religion
     */
    public void setReligion(final String religion) {
        this.religion = religion;
    }
    /**
     * @return get Ethnicity
     */
    public String getEthnicity() {
        return ethnicity;
    }
    /**
     * @param ethnicity set ethnicity
     */
    public void setEthnicity(final String ethnicity) {
        this.ethnicity = ethnicity;
    }
    /**
     * @return get Relationship history
     */
    public String getRelationshipHistory() {
        return relationshipHistory;
    }
    /**
     * @param relationshipHistory set Relationship history
     */
    public void setRelationshipHistory(final String relationshipHistory) {
        this.relationshipHistory = relationshipHistory;
    }
    /**
     * @return get user notification Enable
     */
    public Boolean getNotificationEnable() {
        return notificationEnable;
    }
    /**
     * @param notificationEnable set notify enable
     */
    public void setNotificationEnable(final Boolean notificationEnable) {
        this.notificationEnable = notificationEnable;
    }
    /**
     * @return get Direct Date Request Enable
     */
    public Boolean getDirectDateRequestEnable() {
        return directDateRequestEnable;
    }
    /**
     * @param directDateRequestEnable set user direct date Request enable
     */
    public void setDirectDateRequestEnable(final Boolean directDateRequestEnable) {
        this.directDateRequestEnable = directDateRequestEnable;
    }
    /**
     * @return get Privacy
     */
    public Boolean getPrivacy() {
        return privacy;
    }
    /**
     * @param privacy set Privacy
     */
    public void setPrivacy(final Boolean privacy) {
        this.privacy = privacy;
    }
    /**
     * @return user isDisable
     */
    public Boolean getIsDisable() {
        return isDisable;
    }
    /**
     * @param isDisable set is disble
     */
    public void setIsDisable(final Boolean isDisable) {
        this.isDisable = isDisable;
    }
    /**
     * @return get Language
     */
    public String getLanguage() {
        return language;
    }
    /**
     * @param language language
     */
    public void setLanguage(final String language) {
        this.language = language;
    }
    /**
     * @return get First time login
     */
    public Boolean getFirstTimeLogin() {
        return firstTimeLogin;
    }
    /**
     * @param firstTimeLogin set first time login
     */
    public void setFirstTimeLogin(final Boolean firstTimeLogin) {
        this.firstTimeLogin = firstTimeLogin;
    }
    /**
     * @return get Last name of user
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName set last name of user
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
    /**
     * @return get first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param firstName set first name
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return hometown of user
     */
    public String getHometown() {
        return hometown;
    }

    /**
     *
     * @param hometown set hometown of user
     */
    public void setHometown(final String hometown) {
        this.hometown = hometown;
    }

}
