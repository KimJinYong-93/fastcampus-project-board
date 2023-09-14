package com.fastcampus.projectBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastcampus.projectBoard.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
    
}
