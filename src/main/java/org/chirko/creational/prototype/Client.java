package org.chirko.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Wiki wiki = new Wiki();

        Article articleCopy = wiki.getArticleById(1);
        System.out.printf("%-32s %s\n", "Unchanged copy (prototype): ", articleCopy);

        articleCopy.setContent("Java is a high-level, class-based, object-oriented programming language " +
                "that is designed to have as few implementation dependencies as possible.");
        System.out.println("Now copy is updated, but not the real article:");
        System.out.printf("%-32s %s\n" ,"Copy: ", articleCopy);
        System.out.printf("%-32s %s\n" ,"Real (prototype): ", wiki.getArticleById(1));

        wiki.updateArticleById(1, articleCopy);
        System.out.println("And finally successfully updated real article (prototype): ");
        System.out.printf("%-32s %s\n" ,"Updated article: ", wiki.getArticleById(1));
    }
}
