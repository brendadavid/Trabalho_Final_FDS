package com.cidadera.trabalhofinal.application.models;

import com.cidadera.trabalhofinal.business.entities.Comment;
import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.entities.mappers.CommentInput;

public class OpenCommentRequest implements CommentInput {

    private Long issueId;
    private String comment;
    private String image;

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
    public Comment toEntity() {
        Comment comment = new Comment();
        Issue issue = new Issue();
        issue.setId(this.getIssueId());
        comment.setIssue(issue);
        comment.setComment(this.getComment());
        comment.setImage(this.getImage());

        return comment;
    }
}

