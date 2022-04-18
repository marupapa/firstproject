package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// CrudRepository<관리대상 엔티티, 태표값 id>
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
