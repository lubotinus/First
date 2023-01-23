package com.First.testing.forum;

import java.util.Objects;

public class ForumPost {
    private String postBody;
    private String author;

    public ForumPost(String postBody, String author) {
        this.postBody=postBody;
        this.author=author;
    }
    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumPost forumPost)) return false;
        return Objects.equals(postBody, forumPost.postBody) && Objects.equals(author, forumPost.author);
    }


    @Override
    public int hashCode() {
        int result = postBody.hashCode();
        result = 31*result+author.hashCode();
        return result;
    }
}
