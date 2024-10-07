package org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public final class Like extends BaseEntity {
    private final User ancestor;
    private final BaseLikeableEntity target;
}
