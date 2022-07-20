package com.fastcampus.projectspingboard.service;

import com.fastcampus.projectspingboard.dto.ArticleCommentDto;
import com.fastcampus.projectspingboard.repository.ArticleCommentRepository;
import com.fastcampus.projectspingboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {
    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;
    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComment(long id) {
        return List.of();
    }
}