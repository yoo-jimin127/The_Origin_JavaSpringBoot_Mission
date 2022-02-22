package dev.jimin.cruddemo.board;
import dev.jimin.cruddemo.post.PostDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceSimple implements BoardService {
    private static final Logger logger = LoggerFactory.getLogger(BoardServiceSimple.class);
    private final BoardRepository boardRepository;

    public BoardServiceSimple(
            @Autowired BoardRepository boardRepository
    ) {
        this.boardRepository = boardRepository;
    }

    @Override
    public void createBoard(BoardDto boardDto) {
        if (!this.boardRepository.createBoard(boardDto)) {
            throw new RuntimeException("save board failed");
        }
    }

    @Override
    public void createPost(int boardId, PostDto postDto) {
        if (!this.boardRepository.createPost(boardId, postDto)) {
            throw new RuntimeException("save post failed");
        }
    }

    @Override
    public List<BoardDto> readBoardAll() {
        return this.boardRepository.findAllBoard();
    }

    @Override
    public List<PostDto> readPostAll() {
        return this.boardRepository.findAllPost();
    }

    @Override
    public BoardDto readBoard(int id) {
        return this.boardRepository.findBoardById(id);
    }

    @Override
    public PostDto readPost(int id) {
        return this.boardRepository.findPostByID(id);
    }

    @Override
    public void updateBoard(int id, BoardDto boardDto) {
        if (!this.boardRepository.updateBoard(id, boardDto)) {
            throw new RuntimeException("update board failed");
        }
    }

    @Override
    public void updatePost(int id, PostDto postDto) {
        if (!this.boardRepository.updatePost(id, postDto)) {
            throw new RuntimeException("update post failed");
        }
    }

    @Override
    public void deleteBoard(int id) {
        if (!this.boardRepository.deleteBoard(id)) {
            throw new RuntimeException("delete board failed");
        }
    }

    @Override
    public void deletePost(int id, String password) {
        if (!this.boardRepository.deletePost(id, password)) {
            throw new RuntimeException("delete post failed");
        }
    }
}