package com.fastcampus.projectspingboard.repository;

import com.fastcampus.projectspingboard.domain.Article;
import com.fastcampus.projectspingboard.domain.QArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;

public interface ArticleWithCommentRepository extends
        JpaRepository<Article, Long>,
        QuerydslPredicateExecutor<Article>,
        QuerydslBinderCustomizer<QArticle>
{

}
