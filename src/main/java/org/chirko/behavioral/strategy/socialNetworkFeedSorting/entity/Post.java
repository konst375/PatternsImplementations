package org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Post extends BaseLikeableEntity {
    private Timestamp updatedAt;
    private User author;
    private String title;
    private String description;
    private Set<Tag> tags;
    private List<Picture> pictures;
    private List<Comment> comments;

    @Override
    public void like(User ancestor) {
        super.like(ancestor);
        ancestor.getPersonalInterest().add(this.tags, InterestScore.LIKE_POST.getScore());
    }
}
