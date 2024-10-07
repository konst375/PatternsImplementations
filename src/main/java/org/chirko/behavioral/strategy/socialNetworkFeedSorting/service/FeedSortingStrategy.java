package org.chirko.behavioral.strategy.socialNetworkFeedSorting.service;

import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.Post;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.User;

import java.util.List;

public interface FeedSortingStrategy {
    List<Post> sort(User user, List<Post> posts);
}
