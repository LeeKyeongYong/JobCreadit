package org.jc.jobcreadit.domain.board.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class BoardController { //게시판 컨트롤
    @GetMapping("/boards")
    fun findAllBoards(): String {
        return "AAA"
    }
}