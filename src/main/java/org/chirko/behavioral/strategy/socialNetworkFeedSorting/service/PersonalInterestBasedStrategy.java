package org.chirko.behavioral.strategy.socialNetworkFeedSorting.service;

import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.Post;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.User;

import java.util.List;

public class PersonalInterestBasedStrategy implements FeedSortingStrategy {
    @Override
    public List<Post> sort(User user, List<Post> posts) {
        System.out.println("Sorting by personal popularity...");
        return posts;
    }
}
