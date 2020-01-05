package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String realname;

    public ForumUser(final String username, final String realname) {
        this.username = username;
        this.realname = realname;
    }

    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }

}

