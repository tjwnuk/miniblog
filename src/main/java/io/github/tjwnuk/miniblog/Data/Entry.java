package io.github.tjwnuk.miniblog.Data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String content;

    public Entry(String username, String content) {
        super();
        this.username = username;
        this.content = content;
    }

    public Entry() {
//        super();
    }

}
