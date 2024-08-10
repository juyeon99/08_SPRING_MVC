package com.juyeon.example.board.service;

import com.juyeon.example.board.model.dto.CreateBoardDTO;
import com.juyeon.example.board.model.entity.Board;
import com.juyeon.example.board.repository.BoardRepository;
import com.juyeon.example.member.model.entity.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void create(CreateBoardDTO boardDTO, Member member) {
        Board board = Board.builder()
                .title(boardDTO.getTitle())
                .content(boardDTO.getContent())
                .member(member)
                .build();

        Board savedBoard = boardRepository.save(board);

        log.info("저장된 게시글 번호 : {}", savedBoard.getBoardId());
    }

    // 보드 id로 보드 단건조회
    public Board findBoardById(int boardId) {
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> new IllegalArgumentException("게시글을 찾을 수 없습니다."));

        return board;
    }
}
