package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor // 모든 필드로 생성자 작성
@ToString // toString 메소드 작성
public class Article {
    @Id // 유니크값 지정 어노테이션
    @GeneratedValue // id값 자동증가 identity
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }
//
//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
