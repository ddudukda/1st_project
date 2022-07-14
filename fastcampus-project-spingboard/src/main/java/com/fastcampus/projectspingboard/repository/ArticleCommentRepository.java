package com.fastcampus.projectspingboard.repository;

import com.fastcampus.projectspingboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
