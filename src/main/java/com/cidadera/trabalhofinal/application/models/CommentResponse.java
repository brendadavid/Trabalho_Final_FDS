package com.cidadera.trabalhofinal.application.models;

import com.cidadera.trabalhofinal.business.entities.Comment;
import com.cidadera.trabalhofinal.business.entities.mappers.CommentOutput;


public class CommentResponse implements CommentOutput<CommentResponse> {
    private Long id;
    private Long issueId;
    private String comment;
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public CommentResponse fromEntity(Comment comment) {


        this.setId(comment.getId());
        this.setIssueId(comment.getIssue().getId());
        this.setComment(comment.getComment());
        this.setImage(comment.getImage());

        return this;
    }
}
