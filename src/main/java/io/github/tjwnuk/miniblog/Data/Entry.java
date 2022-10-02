package io.github.tjwnuk.miniblog.Data;

import lombok.Data;

import java.util.Date;

@Data
public class Entry {
    private String username;
    private String content;
    private Date createdAt;

    public Entry(String username, String content) {
        this.username = username;
        this.content = content;
//        this.createdAt = createdAt;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }
}
