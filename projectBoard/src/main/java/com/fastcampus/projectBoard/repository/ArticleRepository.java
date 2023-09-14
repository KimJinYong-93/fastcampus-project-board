package com.fastcampus.projectBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastcampus.projectBoard.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    
}
