package com.example.demo.board.dto;
;
import lombok.*;

import java.time.LocalDateTime;

// DTO(Data Transfer Object), VO, Bean,         Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private Long id;
    private String boardPlace;
    private String boardTitle;
    private String boardMoney;
    private String boardHoilday;
    private String boardDay;
    private String boardTime;
    private String boardTerm;

    private String boardProbation;

    private String boardContent;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

    }

