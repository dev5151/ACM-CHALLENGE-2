package com.dev5151.acmchallenge2.Activities;

public class UserInfo {
    private String mName;
    private String mUsername;
    private String mEmailId;
    private String mAge;
    private String mCollege;
    private String mBranch;
    private String mRegNo;
    private String mPhoneNo;

    public UserInfo() {
    }

    public UserInfo(String name, String username, String mail, String age, String coll, String branch, String reg, String phone) {
        mName = name;
        mUsername = username;
        mEmailId = mail;
        mAge = age;
        mCollege = coll;
        mBranch = branch;
        mRegNo = reg;
        mPhoneNo = phone;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String name) {
        this.mName = name;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String username) {
        this.mUsername = username;
    }

    public String getmEmailId() {
        return mEmailId;
    }

    public void setmEmailId(String email) {
        this.mEmailId = email;
    }

    public String getmAge() {
        return mAge;
    }

    public void setmAge(String age) {
        this.mAge = age;
    }

    public String getmCollege() {
        return mCollege;
    }

    public void setmCollege(String college) {
        this.mCollege = college;
    }

    public String getmBranch() {
        return mBranch;
    }

    public void setmBranch(String branch) {
        this.mBranch = branch;
    }

    public String getmRegNo() {
        return mRegNo;
    }

    public void setmRegNo(String re) {
        this.mRegNo = re;
    }

    public String getmPhoneNo() {
        return mPhoneNo;
    }

    public void setmPhoneNo(String phn) {
        this.mPhoneNo = phn;
    }

}
