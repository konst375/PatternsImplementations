package org.chirko.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Article implements Cloneable {
    private long id;
    private String title;
    private String author;
    private String content;

    @Override
    public Article clone() {
        try {
            return (Article) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
