package org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public final class User extends BaseEntity {
    private String name;
    private String surname;
    private Date dob;
    private String email;
    private String password;
    private PersonalInterest personalInterest;
    private List<Post> posts;
    private List<Comment> comments;
    private List<Like> likes;
    private List<User> friends;
}

