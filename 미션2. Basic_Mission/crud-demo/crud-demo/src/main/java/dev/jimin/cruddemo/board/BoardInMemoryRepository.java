package dev.jimin.cruddemo.board;
import dev.jimin.cruddemo.post.PostDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardInMemoryRepository implements BoardRepository {
    private static final Logger logger = LoggerFactory.getLogger(BoardInMemoryRepository.class);
    private final List<BoardDto> boardList;

    public BoardInMemoryRepository() {
        this.boardList = new ArrayList<>();
    }

    @Override
    public boolean createBoard(BoardDto boardDto) {
        return this.boardList.add(boardDto);
    }

    @Override
    public boolean createPost(int boardId, PostDto postDto) {
        BoardDto targetBoard = this.boardList.get(boardId);
        if (targetBoard == null) {
            return false;
        } else {
            postDto.setBoardId(boardId);

            if (targetBoard.getPostList() == null) {
                ArrayList<PostDto> newPostList = new ArrayList<>();
                newPostList.add(postDto);

                targetBoard.setPostList(newPostList);
            } else {
                targetBoard.getPostList().add(postDto);
            }
            return true;
        }
    }

    @Override
    public List<BoardDto> findAllBoard() {
        return this.boardList;
    }

    @Override
    public List<PostDto> findAllPost() {
        List<PostDto> postList = new ArrayList<>();

        for (BoardDto boardDto : this.boardList) {
            postList.addAll(boardDto.getPostList());
        }

        return postList;
    }

    @Override
    public BoardDto findBoardById(int id) {
        return this.boardList.get(id);
    }

    @Override
    public PostDto findPostByID(int id) {
        List<PostDto> postList = new ArrayList<>();

        for (BoardDto boardDto : this.boardList) {
            postList.addAll(boardDto.getPostList());
        }

        return postList.get(id);
    }

    @Override
    public boolean updateBoard(int id, BoardDto boardDto) {
        BoardDto targetBoard = this.boardList.get(id);
        if (boardDto.getName() != null) {
            targetBoard.setName(boardDto.getName());
        }

        this.boardList.set(id, targetBoard);
        return true;
    }

    @Override
    public boolean updatePost(int id, PostDto postDto) {
        List<PostDto> postList = new ArrayList<>();

        for (BoardDto boardDto : this.boardList) {
            postList.addAll(boardDto.getPostList());
        }

        PostDto targetPost = postList.get(id);
        if (postDto.getTitle() != null) {
            targetPost.setTitle(postDto.getTitle());
        }
        if (postDto.getContent() != null) {
            targetPost.setContent(postDto.getContent());
        }
        postList.set(id, targetPost);
        return true;
    }

    @Override
    public boolean deleteBoard(int id) {
        this.boardList.remove(id);
        return true;
    }

    @Override
    public boolean deletePost(int id, String password) {
        List<PostDto> postList = new ArrayList<>();

        for (BoardDto boardDto : this.boardList) {
            postList.addAll(boardDto.getPostList());
        }

        PostDto targetPost = postList.get(id);
        if (targetPost.getPassword().equals(password)) {
            this.boardList.get(targetPost.getBoardId())
                    .getPostList()
                    .remove(targetPost);
            return true;
        }
        return false;
    }
}