package com.skeleton.modal.signupResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin23 on 16/5/17.
 */

public class TheResponse implements Parcelable {
    public static final Creator<TheResponse> CREATOR = new Creator<TheResponse>() {
        @Override
        public TheResponse createFromParcel(final Parcel in) {
            return new TheResponse(in);
        }

        @Override
        public TheResponse[] newArray(final int size) {
            return new TheResponse[size];
        }
    };
    @SerializedName("statusCode")
    private int statusCode;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private Data data;

    /**
     * @param in read and put in variables
     */
    protected TheResponse(final Parcel in) {
        statusCode = in.readInt();
        message = in.readString();
        data = in.readParcelable(Data.class.getClassLoader());
    }

    /**
     * status code of user
     *
     * @return : statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Setter method
     *
     * @param statusCode : statusCode
     */
    public void setStatusCode(final int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Message
     *
     * @return : message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method
     *
     * @param message : message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * data
     *
     * @return : data
     */
    public Data getData() {
        return data;
    }

    /**
     * Setter method
     *
     * @param data : data
     */
    public void setData(final Data data) {
        this.data = data;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeInt(statusCode);
        dest.writeString(message);
        dest.writeParcelable(data, flags);
    }
}

