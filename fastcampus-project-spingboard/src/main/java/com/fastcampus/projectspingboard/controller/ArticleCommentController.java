package com.fastcampus.projectspingboard.controller;

import com.fastcampus.projectspingboard.dto.ArticleCommentDto;
import com.fastcampus.projectspingboard.dto.UserAccountDto;
import com.fastcampus.projectspingboard.dto.request.ArticleCommentRequest;
import com.fastcampus.projectspingboard.dto.security.BoardPrincipal;
import com.fastcampus.projectspingboard.service.ArticleCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/comments")
@Controller
public class ArticleCommentController {

    private final ArticleCommentService articleCommentService;

    @PostMapping ("/new")
    public String postNewArticleComment(ArticleCommentRequest articleCommentRequest) {
        // TODO: 인증 정보를 넣어줘야 한다.
        articleCommentService.saveArticleComment(articleCommentRequest.toDto(UserAccountDto.of(
                "uno", "pw", "uno@mail.com", null, null
        )));


        return "redirect:/articles/" + articleCommentRequest.articleId();
    }

    @PostMapping ("/{commentId}/delete")
    public String deleteArticleComment(
            @PathVariable Long commentId,
            @AuthenticationPrincipal BoardPrincipal boardPrincipal,
            Long articleId) {
        articleCommentService.deleteArticleComment(commentId,boardPrincipal.getUsername());

        return "redirect:/articles/" + articleId;
    }

}
