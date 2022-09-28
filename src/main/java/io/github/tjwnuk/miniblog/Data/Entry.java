package io.github.tjwnuk.miniblog.Data;

import lombok.Data;

import java.util.Date;

@Data
public class Entry {
    private String username;
    private String content;

    public Entry(String username, String content, Date createdAt) {
        this.username = username;
        this.content = content;
        this.createdAt = createdAt;
    }

    private Date createdAt;
}
