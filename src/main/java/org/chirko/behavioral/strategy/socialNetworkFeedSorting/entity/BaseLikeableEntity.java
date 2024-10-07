package org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public abstract class BaseLikeableEntity extends BaseEntity {
    private List<Like> likes;

    public void like(User ancestor) {
        likes.add(Like.builder()
                .target(this)
                .ancestor(ancestor)
                .build());
    }
}
