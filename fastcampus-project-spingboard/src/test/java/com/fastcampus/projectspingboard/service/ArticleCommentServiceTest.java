package com.fastcampus.projectspingboard.service;

import com.fastcampus.projectspingboard.domain.Article;
import com.fastcampus.projectspingboard.domain.ArticleComment;
import com.fastcampus.projectspingboard.dto.ArticleCommentDto;
import com.fastcampus.projectspingboard.repository.ArticleCommentRepository;
import com.fastcampus.projectspingboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@DisplayName("비지니스 로직 - 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {
    @InjectMocks
    private ArticleCommentService sut;
    @Mock
    private ArticleRepository articleRepository;

    @DisplayName("게시글 아이디로 조회하면, 해당하는 댓글 리스트 반환")
    @Test
    void givenArticleId_whenSearchArticleComments_thenReturnArticeComments() {
        //given
        Long articleId = 1L;
        given(articleRepository.findById(articleId)).willReturn(Optional.of(
                Article.of("title","content","#tag")));

        //when
        List<ArticleCommentDto> articleComments = sut.searchArticleComment(1L);
        //then
        assertThat(articleComments).isNotNull();
        then(articleRepository).should().findById(articleId);
    }

    @DisplayName("댓글 정보를 입력하면, 댓글을 저장한다.")
    @Test
    void  givenArticleCommentInfo_whenSavingArticleComment_thenSavesArticleComment() {
        //given
        Long articleId = 1L;
        given(articleRepository.findById(articleId)).willReturn(Optional.of(
                Article.of("title","content","#tag")));

        //when
        List<ArticleCommentDto> articleComments = sut.searchArticleComment(1L);
        //then
        assertThat(articleComments).isNotNull();
        then(articleRepository).should().findById(articleId);
    }
    //update
    //delete



}