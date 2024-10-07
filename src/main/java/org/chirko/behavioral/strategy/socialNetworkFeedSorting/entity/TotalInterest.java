package org.chirko.behavioral.strategy.socialNetworkFeedSorting.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Map;
import java.util.Set;

@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class TotalInterest extends BaseEntity {
    private Map<Tag, Double> tagScoreMap;

    public void add(Set<Tag> tags, double score) {
        tags.forEach(tag -> tagScoreMap.put(tag, tagScoreMap.getOrDefault(tag, 0.0) + score));
    }
}
