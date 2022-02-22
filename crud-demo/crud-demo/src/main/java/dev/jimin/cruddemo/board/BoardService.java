package dev.jimin.cruddemo.board;
import dev.jimin.cruddemo.post.PostDto;

import java.util.List;

public interface BoardService {
    void createBoard(BoardDto boardDto);
    List<BoardDto> readBoardAll();
    BoardDto readBoard(int id);
    void updateBoard(int id, BoardDto boardDto);
    void deleteBoard(int id);

    void createPost(int boardId, PostDto postDto);
    List<PostDto> readPostAll();
    PostDto readPost(int id);
    void updatePost(int id, PostDto postDto);
    void deletePost(int id, String password);
}
