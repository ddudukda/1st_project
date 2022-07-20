package com.fastcampus.projectspingboard.service;

import com.fastcampus.projectspingboard.domain.Article;
import com.fastcampus.projectspingboard.domain.type.SearchType;
import com.fastcampus.projectspingboard.dto.ArticleDto;
import com.fastcampus.projectspingboard.dto.ArticleUpdateDto;
import com.fastcampus.projectspingboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@DisplayName("비지니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private ArticleService sut;
    @Mock private ArticleRepository articleRepository;

/*    @DisplayName("게시글을 검색하면 게시글 리스트를 반환한다.")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnsArticleList() {
        //given

        //when
        List<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword"); //제목,본문,닉네임,아이디,해시태그
        //then
        assertThat(articles).isNotNull();
    }*/

    @DisplayName("게시글을 조회하면, 게시글 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticles_thenReturnsArticle() {
        //given

        //when
        ArticleDto article = sut.searchArticle(1L, "search keyword");
        //then
        assertThat(article).isNotNull();
    }
    @DisplayName("게시글을 검색하면 게시글 페이지 반환한다.")
    @Test
    void givenSearchParameters_whenSearchingArticles_thenReturnsArticlePage() {
        //given

        //when
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword");
        //then
        assertThat(articles).isNotNull();
    }
    @DisplayName("게시글 정보를 입력하면, 게시글을 저장한다.")
    @Test
    void givenArticleInfo_whenSavingArticle_thenCreatArticle() {
        //given
        given(articleRepository.save(any(Article.class))).willReturn(null);
        //when
        sut.saveArticle(ArticleDto.of(LocalDateTime.now(),"Me","title","content","#hashtag"));
        //then
        then(articleRepository).should().save(any(Article.class));

    }

    @DisplayName("게시글 정보를 수정하면, 게시글을 수정한다.")
    @Test
    void givenArticleIdAndModifiedInfo_whenUpdatingArticle_thenUpdqteArticle() {
        //given
        given(articleRepository.save(any(Article.class))).willReturn(null);
        //when
        sut.updateArticle(1L, ArticleUpdateDto.of("title","content","#hashtag"));
        //then
        then(articleRepository).should().save(any(Article.class));

    }

    @DisplayName("게시글 ID를 입력하면, 게시글을 삭제한다.")
    @Test
    void givenArticleId_whenDeletingArticle_thenDeleteArticle() {
        //given
        willDoNothing().given(articleRepository).delete(any(Article.class));
        //when
        sut.deleteArticle(1L);
        //then
        then(articleRepository).should().delete(any(Article.class));

    }




}