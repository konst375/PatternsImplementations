package org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum InterestScore {
    LIKE_POST(1),
    LIKE_COMMENT(2),
    LEAVE_COMMENT(3);

    private final int score;
}
