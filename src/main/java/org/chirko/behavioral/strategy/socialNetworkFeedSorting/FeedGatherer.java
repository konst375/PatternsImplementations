package org.chirko.behavioral.strategy.socialNetworkFeedSorting;

import org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity.User;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.service.FeedService;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.service.PersonalInterestBasedStrategy;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.service.PublicationTimeBasedStrategy;
import org.chirko.behavioral.strategy.socialNetworkFeedSorting.service.TotalPopularityBasedStrategy;

import java.util.ArrayList;

public class FeedGatherer {
    public static void main(String[] args) {
        User user = User.builder()
                .friends(new ArrayList<>())
                .build();

        /* FeedService supports changing feed sorting strategy at runtime
          We can create new strategies and change existing strategies without any change in FeedService
          */
        FeedService feedService = new FeedService(new TotalPopularityBasedStrategy());
        feedService.getFriendsFeed(user);

        feedService.setSortingStrategy(new PersonalInterestBasedStrategy());

        feedService.getFriendsFeed(user);

        feedService.setSortingStrategy(new PublicationTimeBasedStrategy());

        feedService.getFriendsFeed(user);
    }
}
