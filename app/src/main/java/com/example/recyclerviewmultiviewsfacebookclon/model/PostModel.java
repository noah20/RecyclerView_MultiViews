package com.example.recyclerviewmultiviewsfacebookclon.model;

public class PostModel {
    long mId;
    int mUserImageId;
    String mUserName;
    long mTime;
    POST_TYPE mType;
    PRIVACY mPrivacy;
    String mDescription;
    int mImageId;
    int mComments;
    int mLikes;

    public PostModel() {
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public int getUserImageId() {
        return mUserImageId;
    }

    public void setUserImageId(int userImageId) {
        mUserImageId = userImageId;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public POST_TYPE getType() {
        return mType;
    }

    public void setType(POST_TYPE type) {
        mType = type;
    }

    public PRIVACY getPrivacy() {
        return mPrivacy;
    }

    public void setPrivacy(PRIVACY privacy) {
        mPrivacy = privacy;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public int getComments() {
        return mComments;
    }

    public void setComments(int comments) {
        mComments = comments;
    }

    public int getLikes() {
        return mLikes;
    }

    public void setLikes(int likes) {
        mLikes = likes;
    }
}
