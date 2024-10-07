package org.chirko.behavioral.strategy.socialNetworkFeedSorting.service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.Post;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.User;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@AllArgsConstructor
public class FeedService {
    private FeedSortingStrategy sortingStrategy;

    public List<Post> getFriendsFeed(User user) {
        return sortingStrategy.sort(user, user.getFriends().stream()
                .map(User::getPosts)
                .flatMap(Collection::stream)
                .limit(100)
                .collect(Collectors.toList()));
    }


}
