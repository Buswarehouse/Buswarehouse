package com.cykj.entity;

import org.springframework.stereotype.Component;

@Component
public class User {

    private int userId;
//    @NotNull(message = "userName不能为空")
    private String userName;
    private String account;
    private String pwd;
    private String sex;
    private String education;
    private String profession;
    private int phone;
    private String email;
    private int userState;
    private int nowScore;
    private String vCode;
//    private String regsitertime;
//    private UserParmars userParmars;
//    private UserScore userScore;
//    private FileUpload fileUpload;
//    private int roleId;
//    private int downLoadNum;
//    private int uploadNum;


    public User() {

    }



    public User(int userId, String userName, String account, String pwd, String sex, String education, String profession, int phone, String email, int userState, int nowScore) {
        this.userId = userId;
        this.userName = userName;
        this.account = account;
        this.pwd = pwd;
        this.sex = sex;
        this.education = education;
        this.profession = profession;
        this.phone = phone;
        this.email = email;
        this.userState = userState;
        this.nowScore = nowScore;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public int getNowScore() {
        return nowScore;
    }

    public void setNowScore(int nowScore) {
        this.nowScore = nowScore;
    }

    public String getvCode() {
        return vCode;
    }

    public void setvCode(String vCode) {
        this.vCode = vCode;
    }

//    public String getRegsitertime() {
//        return regsitertime;
//    }
//
//    public void setRegsitertime(String regsitertime) {
//        this.regsitertime = regsitertime;
//    }

//    public UserParmars getUserParmars() {
//        return userParmars;
//    }
//
//    public void setUserParmars(UserParmars userParmars) {
//        this.userParmars = userParmars;
//    }
//
//    public UserScore getUserScore() {
//        return userScore;
//    }
//
//    public void setUserScore(UserScore userScore) {
//        this.userScore = userScore;
//    }
//
//    public FileUpload getFileUpload() {
//        return fileUpload;
//    }
//
//    public void setFileUpload(FileUpload fileUpload) {
//        this.fileUpload = fileUpload;
//    }
//
//    public int getRoleId() {
//        return roleId;
//    }

//    public void setRoleId(int roleId) {
//        this.roleId = roleId;
//    }
//
//    public int getDownLoadNum() {
//        return downLoadNum;
//    }
//
//    public void setDownLoadNum(int downLoadNum) {
//        this.downLoadNum = downLoadNum;
//    }
//
//    public int getUploadNum() {
//        return uploadNum;
//    }
//
//    public void setUploadNum(int uploadNum) {
//        this.uploadNum = uploadNum;
//    }
}
