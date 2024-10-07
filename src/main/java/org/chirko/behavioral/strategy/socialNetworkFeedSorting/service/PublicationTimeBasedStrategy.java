package org.chirko.behavioral.strategy.socialNetworkFeedSorting.service;

import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.BaseEntity;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.Post;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.User;

import java.util.Comparator;
import java.util.List;

public class PublicationTimeBasedStrategy implements FeedSortingStrategy {
    @Override
    public List<Post> sort(User user, List<Post> posts) {
        System.out.println("Sorting by publication time...");
        posts.sort(Comparator.comparing(BaseEntity::getCreatedAt));
        return posts;
    }
}
