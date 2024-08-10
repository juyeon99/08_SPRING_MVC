package com.juyeon.example.board.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CreateBoardDTO {
    private String title;
    private String content;
}
