package org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.sql.Timestamp;

@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class Comment extends BaseLikeableEntity {
    private String text;
    private final User ancestor;
    private final Post post;
    private Timestamp updatedAt;

    @Override
    public void like(User ancestor) {
        super.like(ancestor);
        ancestor.getPersonalInterest().add(this.getPost().getTags(), InterestScore.LIKE_COMMENT.getScore());
    }
}
