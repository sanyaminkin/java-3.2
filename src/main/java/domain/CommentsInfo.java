package domain;

public class CommentsInfo {
    private int count;
    private int senderId;
    private int commentsType;
    private int commentTime;
    private boolean reply;
    private int commentLike;
    private int attachment;
    private boolean picture;
    private int smilesInfo;
    private boolean canPost;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getCommentsType() {
        return commentsType;
    }

    public void setCommentsType(int commentsType) {
        this.commentsType = commentsType;
    }

    public int getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(int commentTime) {
        this.commentTime = commentTime;
    }

    public boolean isReply() {
        return reply;
    }

    public void setReply(boolean reply) {
        this.reply = reply;
    }

    public int getCommentLike() {
        return commentLike;
    }

    public void setCommentLike(int commentLike) {
        this.commentLike = commentLike;
    }

    public int getAttachment() {
        return attachment;
    }

    public void setAttachment(int attachment) {
        this.attachment = attachment;
    }

    public boolean isPicture() {
        return picture;
    }

    public void setPicture(boolean picture) {
        this.picture = picture;
    }

    public int getSmilesInfo() {
        return smilesInfo;
    }

    public void setSmilesInfo(int smilesInfo) {
        this.smilesInfo = smilesInfo;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }
}
