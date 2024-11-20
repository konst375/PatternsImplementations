package org.chirko.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Wiki {
    private final Map<Long, Article> wikiArticles = new HashMap<>(Map.of(
            1L, new Article(1, "Java", "Konstantin", "Java it is a strongly typed language"),
            2L, new Article(2, "Spring", "Younger Kohler", "Spring is one of the most popular Java framework"),
            3L, new Article(3, "SQL", "Donald D. Chamberlin", "SQL is a declarative language for relational database management")
    ));

    // provides an article for some changes, but still keeps the original prototype article in case a recovery is needed
    public Article getArticleById(long id) {
        return wikiArticles.get(id).clone();
    }

    public void updateArticleById(long id, Article article) {
        wikiArticles.put(id, article.clone());
    }
}
