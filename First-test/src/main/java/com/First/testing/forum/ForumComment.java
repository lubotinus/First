package com.First.testing.forum;

import java.util.Objects;

public class ForumComment {
    private ForumPost forumPost;
    private String commentBody;
    private String author;

    public ForumComment(ForumPost forumPost, String commentBody, String author) {
        this.forumPost=forumPost;
        this.commentBody=commentBody;
        this.author=author;
    }

    public ForumPost getForumPost() {
        return forumPost;
    }

    public String getAuthor() {
        return author;
    }
    public String getCommentBody() {
        return commentBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumComment that)) return false;
        return Objects.equals(forumPost, that.forumPost) && Objects.equals(commentBody, that.commentBody) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        int result = forumPost.hashCode();
        result = 31*result+commentBody.hashCode();
        result = 31*result+author.hashCode();
        return result;
    }
}

