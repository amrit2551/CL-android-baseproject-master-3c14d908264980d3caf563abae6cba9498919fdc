package com.skeleton.modal.signupResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Data modal
 */
public class Data implements Parcelable {
    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(final Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(final int size) {
            return new Data[size];
        }
    };
    @SerializedName("accessToken")
    private String accessToken;
    @SerializedName("userDetails")
    private UserDetails userDetails;

    /**
     * @param in read and put into variables
     */
    protected Data(final Parcel in) {
        accessToken = in.readString();
    }

    /**
     * accessToken
     *
     * @return : accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * setter method
     *
     * @param accessToken : accessToken
     */
    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * userDetails
     *
     * @return : userDetails
     */
    public UserDetails getUserDetails() {
        return userDetails;
    }

    /**
     * Setter method
     *
     * @param userDetails : userDetails
     */
    public void setUserDetails(final UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(accessToken);

    }
}
