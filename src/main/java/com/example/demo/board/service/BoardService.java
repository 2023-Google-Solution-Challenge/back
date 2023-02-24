
package com.example.demo.board.service;

import com.example.demo.board.dto.BoardDTO;
import com.example.demo.board.entity.BoardEntity;
import com.example.demo.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private static BoardRepository boardRepository;

    public static void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}

