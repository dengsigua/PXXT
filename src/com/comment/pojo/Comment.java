package com.comment.pojo;

import java.util.Date;

public class Comment {
    private Long commentId;

    private String commentName;

    private Date commentTime;

    private String commentContent;

    private String commentPicture;

    private String commentAnswer;

    private String commentState;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName == null ? null : commentName.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public String getCommentPicture() {
        return commentPicture;
    }

    public void setCommentPicture(String commentPicture) {
        this.commentPicture = commentPicture == null ? null : commentPicture.trim();
    }

    public String getCommentAnswer() {
        return commentAnswer;
    }

    public void setCommentAnswer(String commentAnswer) {
        this.commentAnswer = commentAnswer == null ? null : commentAnswer.trim();
    }

    public String getCommentState() {
        return commentState;
    }

    public void setCommentState(String commentState) {
        this.commentState = commentState == null ? null : commentState.trim();
    }
}