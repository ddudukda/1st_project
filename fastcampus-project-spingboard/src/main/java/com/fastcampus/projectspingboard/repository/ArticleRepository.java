package com.fastcampus.projectspingboard.repository;

import com.fastcampus.projectspingboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}