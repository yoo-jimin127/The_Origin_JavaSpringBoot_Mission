package dev.jimin.cruddemo.board;
import dev.jimin.cruddemo.post.PostDto;

import java.util.List;

public interface BoardRepository {
    boolean createBoard(BoardDto boardDto);
    List<BoardDto> findAllBoard();
    BoardDto findBoardById(int id);
    boolean updateBoard(int id, BoardDto boardDto);
    boolean deleteBoard(int id);

    boolean createPost(int boardId, PostDto postDto);
    List<PostDto> findAllPost();
    PostDto findPostByID(int id);
    boolean updatePost(int id, PostDto postDto);
    boolean deletePost(int id, String password);
}
