package com.example.demo.qbs.controller;

import com.example.demo.qbs.domain.QnaBoard;
import com.example.demo.qbs.service.QnaBoardService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/qna")
@CrossOrigin(origins="*")
public class QnaBoardController {

    private final QnaBoardService qnaboardservice;

    @GetMapping("/board")
    public ResponseEntity<QnaBoard> board(){

        QnaBoard qnaboard = qnaboardservice.get();

        return new ResponseEntity<QnaBoard>(qnaboard, HttpStatus.OK);

    }

}
