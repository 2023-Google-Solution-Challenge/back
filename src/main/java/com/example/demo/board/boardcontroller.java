package com.example.demo.board;


import com.example.demo.board.dto.BoardDTO;
import com.example.demo.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class boardcontroller {
    private  final BoardService boardService;
    @GetMapping("/save")
    public String saveForm() {return "save";}

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        System.out.println("board=" + boardDTO);
        BoardService.save(boardDTO);
        return "index";
    }
}

