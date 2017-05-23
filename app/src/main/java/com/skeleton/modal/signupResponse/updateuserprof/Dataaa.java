package com.skeleton.modal.signupResponse.updateuserprof;

/**
 * Created by admin23 on 18/5/17.
 */

public class Dataaa {
    private String accessToken;
    private UserDetails userDetails;
    /**
     * @return get Access token
     */
    public String getAccessToken() {
        return accessToken;
    }
    /**
     * @param accessToken access token
     */
    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }
    /**
     * @return user details
     */
    public UserDetails getUserDetails() {
        return userDetails;
    }
    /**
     * @param userDetails user details
     */
    public void setUserDetails(final UserDetails userDetails) {
        this.userDetails = userDetails;
    }

}
