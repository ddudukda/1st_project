package com.fastcampus.projectspingboard.service;

import com.fastcampus.projectspingboard.domain.type.SearchType;
import com.fastcampus.projectspingboard.dto.ArticleDto;
import com.fastcampus.projectspingboard.dto.ArticleUpdateDto;
import com.fastcampus.projectspingboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
/*    @Transactional(readOnly = true)
    public List<ArticleDto> searchArticles(SearchType title, String search_keyword) {
        return List.of();
    }*/
    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l, String search_keyword) {
        return null;
    }

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType title, String search_keyword) {
        return Page.empty();
    }

    public void saveArticle(ArticleDto dto) {
    }

    public void updateArticle(long articleId, ArticleUpdateDto dto) {
    }

    public void deleteArticle(long articleId) {
    }
}
