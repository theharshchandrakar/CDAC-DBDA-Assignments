package com.assignment.assignment8.ARTICLE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArticleManager {

    public static void main(String[] args) {
        List<Article> articles = Arrays.asList(
            new Article(1, "Java Streams", 2023, 15200, Arrays.asList("Java", "Programming")),
            new Article(2, "AI in Healthcare", 2022, 25000, Arrays.asList("AI", "Healthcare")),
            new Article(3, "Python Basics", 2023, 12500, Arrays.asList("Python", "Programming")),
            new Article(4, "COVID-19 Impact", 2020, 56000, Arrays.asList("Healthcare", "Covid")),
            new Article(5, "Java Concurrency", 2022, 9500, Arrays.asList("Java", "Programming")),
            new Article(6, "Machine Learning", 2023, 31000, Arrays.asList("AI", "Tech")),
            new Article(7, "Child Nutrition", 2021, 8000, Arrays.asList("Healthcare", "Children Health"))
        );

        System.out.println("  1. Articles published in 2023:");
        List<Article> articles2023 = articles.stream()
                .filter(article -> article.getYearOfPublishing() == 2023)
                .collect(Collectors.toList());
        articles2023.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("  2. Articles grouped by Subject:");
        Map<String, List<Article>> articlesBySubject = articles.stream()
                .collect(Collectors.groupingBy(Article::getSubject));
        articlesBySubject.forEach((subject, articleList) -> {
            System.out.println("Subject: " + subject);
            articleList.forEach(a -> System.out.println("\t" + a));
        });
        System.out.println("\n");

        System.out.println("  3. Count of articles by Subject:");
        Map<String, Long> countBySubject = articles.stream()
                .collect(Collectors.groupingBy(Article::getSubject, Collectors.counting()));
        countBySubject.forEach((subject, count) -> System.out.println(subject + ": " + count));
        System.out.println("\n");

        System.out.println("  4. Articles with more than 10k views:");
        List<Article> popularArticles = articles.stream()
                .filter(article -> article.getNoOfViews() > 10000)
                .collect(Collectors.toList());
        popularArticles.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("  5. Top 5 trending articles:");
        List<Article> top5Articles = articles.stream()
                .sorted(Comparator.comparingLong(Article::getNoOfViews).reversed())
                .limit(5)
                .collect(Collectors.toList());
        top5Articles.forEach(System.out::println);
        System.out.println("\n");
    }
}
