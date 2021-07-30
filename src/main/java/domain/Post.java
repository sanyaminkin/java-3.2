package domain;

public class Post {
    private int id;
    private int ownerId;
    private int postTime;
    private boolean complain;
    private boolean bookmarks;
    private int text;
    private int picturesInfo;
    private boolean postLike;
    private CommentsInfo commentsInfo;
    private boolean repost;
    private int viewsInfo;
    private int attachment;
    private int smilesInfo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getPostTime() {
        return postTime;
    }

    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }

    public boolean isComplain() {
        return complain;
    }

    public void setComplain(boolean complain) {
        this.complain = complain;
    }

    public boolean isBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(boolean bookmarks) {
        this.bookmarks = bookmarks;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public int getPicturesInfo() {
        return picturesInfo;
    }

    public void setPicturesInfo(int picturesInfo) {
        this.picturesInfo = picturesInfo;
    }

    public boolean isPostLike() {
        return postLike;
    }

    public void setPostLike(boolean postLike) {
        this.postLike = postLike;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public boolean isRepost() {
        return repost;
    }

    public void setRepost(boolean repost) {
        this.repost = repost;
    }

    public int getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(int viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public int getAttachment() {
        return attachment;
    }

    public void setAttachment(int attachment) {
        this.attachment = attachment;
    }

    public int getSmilesInfo() {
        return smilesInfo;
    }

    public void setSmilesInfo(int smilesInfo) {
        this.smilesInfo = smilesInfo;
    }

}
