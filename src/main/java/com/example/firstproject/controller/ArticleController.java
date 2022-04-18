package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅 어노테이션
public class ArticleController {
    @Autowired // 스프링부트가 객채를 주입해준다 디펜던시 인잭션
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {

        return "/articles/new";
    }
    @PostMapping("/article/create")
    public String createArticle(ArticleForm form)
    {
        // 로깅
        log.info(form.toString());


        // 1. dto를 엔티티로 변환
        Article article = form.toEntity();
        //System.out.println(article.toString());
        log.info(article.toString());

        // 리포티토리에 엔티티를 디비안에 저장
        Article saved  = articleRepository.save(article);
        //System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }
}
