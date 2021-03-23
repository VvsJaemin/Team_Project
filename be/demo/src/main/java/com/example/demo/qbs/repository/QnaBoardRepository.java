package com.example.demo.qbs.repository;

import com.example.demo.qbs.domain.QnaBoard;

import org.springframework.data.jpa.repository.JpaRepository;

interface QnaBoardCustomRepository {}
public interface QnaBoardRepository extends JpaRepository<QnaBoard, Long>,
QnaBoardCustomRepository {
    
}