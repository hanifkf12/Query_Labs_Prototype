package com.hanifkf.query_labs_prototype.model;

public class Berita {

    private int profilePic;
    private String username;
    private String timeStamp;
    private int imageBanner;
    private String title;
    private String desc;
    private String countLikes;
    private String countComment;
    private String countShare;

    public Berita(int profilePic, String username, String timeStamp, int imageBanner, String title, String desc, String countLikes, String countComment, String countShare) {
        this.profilePic = profilePic;
        this.username = username;
        this.timeStamp = timeStamp;
        this.imageBanner = imageBanner;
        this.title = title;
        this.desc = desc;
        this.countLikes = countLikes;
        this.countComment = countComment;
        this.countShare = countShare;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getImageBanner() {
        return imageBanner;
    }

    public void setImageBanner(int imageBanner) {
        this.imageBanner = imageBanner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(String countLikes) {
        this.countLikes = countLikes;
    }

    public String getCountComment() {
        return countComment;
    }

    public void setCountComment(String countComment) {
        this.countComment = countComment;
    }

    public String getCountShare() {
        return countShare;
    }

    public void setCountShare(String countShare) {
        this.countShare = countShare;
    }

}
