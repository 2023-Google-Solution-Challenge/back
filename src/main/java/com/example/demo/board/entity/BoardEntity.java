package com.example.demo.board.entity;


import com.example.demo.board.dto.BoardDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "board_table")
public class BoardEntity extends BaseEntity {
    @Id // pk 컬럼 지정. 필수
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column
    private String boardPlace;

    @Column
    private String boardTitle;

    @Column
    private String boardHoilday;

    @Column
    private String boardProbation;

    @Column
    private String boardMoney;

    @Column
    private String boardDay;

    @Column
    private String boardTime;

    @Column
    private String boardTerm;
    @Column(length = 500)
    private String boardContent;

    @Column
    private int boardHits;

    public static BoardEntity toSaveEntity(BoardDTO boardDto){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardContent(boardDto.getBoardContent());
        boardEntity.setBoardPlace(boardDto.getBoardPlace());
        boardEntity.setBoardTitle(boardDto.getBoardTitle());
        boardEntity.setBoardHoilday(boardDto.getBoardHoilday());
        boardEntity.setBoardDay(boardDto.getBoardDay());
        boardEntity.setBoardTime(boardDto.getBoardTime());
        boardEntity.setBoardTerm(boardDto.getBoardTerm());
        boardEntity.setBoardMoney(boardDto.getBoardMoney());
        boardEntity.setBoardProbation(boardDto.getBoardProbation());
        boardEntity.setBoardHits(0);
        return boardEntity;
    }
}