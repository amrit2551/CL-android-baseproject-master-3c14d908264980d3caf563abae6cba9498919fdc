package com.skeleton.modal.signupResponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Model class for user
 */

public class UserDetails {
    @SerializedName("id")
    private String id;
    @SerializedName("createdAt")
    private String createdAt;
    @SerializedName("updatedAt")
    private String updatedAt;
    @SerializedName("dob")
    private String dob;
    @SerializedName("countryCode")
    private String countryCode;
    @SerializedName("phoneNo")
    private String phoneNo;
    @SerializedName("email")
    private String email;
    @SerializedName("orientation")
    private String orientation;
    @SerializedName("newNumber")
    private String newNumber;
    @SerializedName("userImages")
    private List<UserImages> userImages;
    @SerializedName("admindeactivateAccount")
    private boolean admindeactivateAccount;
    @SerializedName("timeOffset")
    private int timeOffset;
    @SerializedName("gender")
    private String gender;
    @SerializedName("aboutMe")
    private String aboutMe;
    @SerializedName("step2CompleteOrSkip")
    private boolean step2CompleteOrSkip;
    @SerializedName("step1CompleteOrSkip")
    private boolean step1CompleteOrSkip;
    @SerializedName("interestCategories")
    private List<InterestCategories> interestCategories;
    @SerializedName("profilePicURL")
    private ProfilePicURL profilePicURL;
    @SerializedName("defaultAddressId")
    private String defaultAddressId;
    @SerializedName("currentLocation")
    private CurrentLocation currentLocation;
    @SerializedName("phoneVerified")
    private boolean phoneVerified;
    @SerializedName("emailVerified")
    private boolean emailVerified;
    @SerializedName("drinking")
    private String drinking;
    @SerializedName("smoking")
    private String smoking;
    @SerializedName("bodyType")
    private String bodyType;
    @SerializedName("height")
    private String height;
    @SerializedName("religion")
    private String religion;
    @SerializedName("ethnicity")
    private String ethnicity;
    @SerializedName("relationshipHistory")
    private String relationshipHistory;
    @SerializedName("notificationEnable")
    private boolean notificationEnable;
    @SerializedName("directDateRequestEnable")
    private boolean directDateRequestEnable;
    @SerializedName("privacy")
    private boolean privacy;
    @SerializedName("isDisable")
    private boolean isDisable;
    @SerializedName("language")
    private String language;
    @SerializedName("firstTimeLogin")
    private boolean firstTimeLogin;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("firstName")
    private String firstName;

    /**
     * getter
     *
     * @return : id of user
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
     * Getter method
     *
     * @return :  date of account creation
     */

    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter method
     *
     * @param createdAt : date of account creation
     */

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * getter method
     *
     * @return : last updated info
     */

    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter method
     *
     * @param updatedAt : last update d ifo
     */
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * dob
     *
     * @return : dob
     */

    public String getDob() {
        return dob;
    }

    /**
     * Setter method
     *
     * @param dob : dob
     */

    public void setDob(final String dob) {
        this.dob = dob;
    }

    /**
     * Getter
     *
     * @return : countryCode
     */

    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter method
     *
     * @param countryCode : countryCode
     */
    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter method
     *
     * @return : phone
     */

    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * phone
     *
     * @param phoneNo : phone
     */

    public void setPhoneNo(final String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * getter method
     *
     * @return : email
     */

    public String getEmail() {
        return email;
    }

    /**
     * email of user
     *
     * @param email : email
     */

    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Getter method
     *
     * @return : orientation
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * Setter method
     *
     * @param orientation : orientation
     */

    public void setOrientation(final String orientation) {
        this.orientation = orientation;
    }

    /**
     * newNumber
     *
     * @return : newNumber
     */

    public String getNewNumber() {
        return newNumber;
    }

    /**
     * Setter method
     * newNumber
     *
     * @param newNumber :
     */
    public void setNewNumber(final String newNumber) {
        this.newNumber = newNumber;
    }

    /**
     * getter method
     *
     * @return : list of userimages
     */

    public List<UserImages> getUserImages() {
        return userImages;
    }

    /**
     * Set user imaged
     *
     * @param userImages : userImages
     */

    public void setUserImages(final List<UserImages> userImages) {
        this.userImages = userImages;
    }

    /**
     * Getter method
     *
     * @return : admindeactivateAccount
     */

    public boolean getAdmindeactivateAccount() {
        return admindeactivateAccount;
    }

    /**
     * Setter method
     *
     * @param admindeactivateAccount : admindeactivateAccount
     */
    public void setAdmindeactivateAccount(final boolean admindeactivateAccount) {
        this.admindeactivateAccount = admindeactivateAccount;
    }

    /**
     * Getter method
     *
     * @return : timeOffset
     */
    public int getTimeOffset() {
        return timeOffset;
    }

    /**
     * timeOffset
     *
     * @param timeOffset : timeOffset
     */

    public void setTimeOffset(final int timeOffset) {
        this.timeOffset = timeOffset;
    }

    /**
     * Getter method
     *
     * @return : gender of user
     */

    public String getGender() {
        return gender;
    }

    /**
     * Setter method
     * gender of user
     *
     * @param gender : gender of user
     */
    public void setGender(final String gender) {
        this.gender = gender;
    }

    /**
     * Getter method
     *
     * @return : user info
     */
    public String getAboutMe() {
        return aboutMe;
    }

    /**
     * user's about
     *
     * @param aboutMe : aboutMe
     */
    public void setAboutMe(final String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /**
     * Getter method
     *
     * @return : step2CompleteOrSkip
     */
    public boolean getStep2CompleteOrSkip() {
        return step2CompleteOrSkip;
    }

    /**
     * Setter method
     *
     * @param step2CompleteOrSkip : step2CompleteOrSkip
     */
    public void setStep2CompleteOrSkip(final boolean step2CompleteOrSkip) {
        this.step2CompleteOrSkip = step2CompleteOrSkip;
    }

    /**
     * Getter method
     *
     * @return : step1CompleteOrSkip
     */
    public boolean getStep1CompleteOrSkip() {
        return step1CompleteOrSkip;
    }

    /**
     * Setter method
     *
     * @param step1CompleteOrSkip : step1CompleteOrSkip
     */
    public void setStep1CompleteOrSkip(final boolean step1CompleteOrSkip) {
        this.step1CompleteOrSkip = step1CompleteOrSkip;
    }

    /**
     * Getter method
     *
     * @return : getInterestCategories
     */
    public List<InterestCategories> getInterestCategories() {
        return interestCategories;
    }

    /**
     * Setter method
     *
     * @param interestCategories : interestCategories
     */
    public void setInterestCategories(final List<InterestCategories> interestCategories) {
        this.interestCategories = interestCategories;
    }

    /**
     * Getter method
     *
     * @return : profilePicURL
     */
    public ProfilePicURL getProfilePicURL() {
        return profilePicURL;
    }

    /**
     * Setter method
     *
     * @param profilePicURL : photo url of user
     */
    public void setProfilePicURL(final ProfilePicURL profilePicURL) {
        this.profilePicURL = profilePicURL;
    }

    /**
     * getter method Default address of user
     *
     * @return : defaultAddressId
     */
    public String getDefaultAddressId() {
        return defaultAddressId;
    }

    /**
     * default addresss of user
     *
     * @param defaultAddressId : defaultAddressId
     */
    public void setDefaultAddressId(final String defaultAddressId) {
        this.defaultAddressId = defaultAddressId;
    }

    /**
     * Getter method
     *
     * @return : current location of user
     */
    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Setter method
     *
     * @param currentLocation : current location of user
     */
    public void setCurrentLocation(final CurrentLocation currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * Getter method
     *
     * @return : getPhoneVerified
     */
    public boolean getPhoneVerified() {
        return phoneVerified;
    }

    /**
     * phoneVerified
     *
     * @param phoneVerified : phoneVerified
     */
    public void setPhoneVerified(final boolean phoneVerified) {
        this.phoneVerified = phoneVerified;
    }

    /**
     * Getter method
     *
     * @return : emailVerified
     */
    public boolean getEmailVerified() {
        return emailVerified;
    }

    /**
     * set Email Verified
     *
     * @param emailVerified : emailVerified
     */

    public void setEmailVerified(final boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    /**
     * Getter method
     *
     * @return : drinking of user
     */
    public String getDrinking() {
        return drinking;
    }

    /**
     * user drinking
     *
     * @param drinking : drinking
     */
    public void setDrinking(final String drinking) {
        this.drinking = drinking;
    }

    /**
     * Getter method
     *
     * @return : smoking
     */
    public String getSmoking() {
        return smoking;
    }

    /**
     * Setter method
     *
     * @param smoking : smoking
     */
    public void setSmoking(final String smoking) {
        this.smoking = smoking;
    }

    /**
     * Getter method
     *
     * @return : bodyType
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * Setter method
     *
     * @param bodyType : bodyType
     */
    public void setBodyType(final String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * Getter method
     *
     * @return : height of user
     */
    public String getHeight() {
        return height;
    }

    /**
     * Setter method height of user
     *
     * @param height : height of user
     */
    public void setHeight(final String height) {
        this.height = height;
    }

    /**
     * Getter method
     *
     * @return : get religion of user
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Setter method
     *
     * @param religion : religion of user
     */
    public void setReligion(final String religion) {
        this.religion = religion;
    }

    /**
     * Getter method
     *
     * @return : ethnicity
     */
    public String getEthnicity() {
        return ethnicity;
    }

    /**
     * Setter method
     *
     * @param ethnicity : ethnicity
     */
    public void setEthnicity(final String ethnicity) {
        this.ethnicity = ethnicity;
    }

    /**
     * Getter method
     *
     * @return : relationshipHistory
     */
    public String getRelationshipHistory() {
        return relationshipHistory;
    }

    /**
     * Setter method
     *
     * @param relationshipHistory : relationshipHistory
     */
    public void setRelationshipHistory(final String relationshipHistory) {
        this.relationshipHistory = relationshipHistory;
    }

    /**
     * Getter method
     *
     * @return : getNotificationEnable
     */
    public boolean getNotificationEnable() {
        return notificationEnable;
    }

    /**
     * setNotificationEnable
     *
     * @param notificationEnable : setNotificationEnable
     */
    public void setNotificationEnable(final boolean notificationEnable) {
        this.notificationEnable = notificationEnable;
    }

    /**
     * Getter method
     *
     * @return : getDirectDateRequestEnable
     */
    public boolean getDirectDateRequestEnable() {
        return directDateRequestEnable;
    }

    /**
     * Setter method
     *
     * @param directDateRequestEnable : setDirectDateRequestEnable
     */
    public void setDirectDateRequestEnable(final boolean directDateRequestEnable) {
        this.directDateRequestEnable = directDateRequestEnable;
    }

    /**
     * get privacy settings
     *
     * @return : true if private
     */
    public boolean getPrivacy() {
        return privacy;
    }

    /**
     * is data private
     *
     * @param privacy : true if private, false if public
     */
    public void setPrivacy(final boolean privacy) {
        this.privacy = privacy;
    }

    /**
     * Getter method
     *
     * @return : boolean vlaue of isDisable
     */
    public boolean getIsDisable() {
        return isDisable;
    }

    /**
     * isDisable
     *
     * @param isDisable : boolean value of isDisable
     */
    public void setIsDisable(final boolean isDisable) {
        this.isDisable = isDisable;
    }

    /**
     * getter method
     *
     * @return : get language preferences
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Setter method
     *
     * @param language : language preferences
     */
    public void setLanguage(final String language) {
        this.language = language;
    }

    /**
     * Getter method
     *
     * @return : firstTimeLogin
     */
    public boolean getFirstTimeLogin() {
        return firstTimeLogin;
    }

    /**
     * Setter method
     *
     * @param firstTimeLogin : firstTimeLogin
     */
    public void setFirstTimeLogin(final boolean firstTimeLogin) {
        this.firstTimeLogin = firstTimeLogin;
    }

    /**
     * Getter method
     *
     * @return : lname of user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method
     *
     * @param lastName : lname of the user
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter method firstName
     *
     * @return : fname of user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method
     *
     * @param firstName : fname of the user
     */

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }
}
