package dev.jimin.cruddemo.board;
import dev.jimin.cruddemo.post.PostDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("board")
public class BoardRestController {
    private static final Logger logger = LoggerFactory.getLogger(BoardRestController.class);
    private final BoardService boardService;

    public BoardRestController(
            @Autowired BoardService boardService
    ) {
        this.boardService = boardService;
    }

    // POST /board

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createBoard(@RequestBody BoardDto boardDto) {
        logger.info(boardService.toString());
        this.boardService.createBoard(boardDto);
    }

    // POST /board/0/

    @PostMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(
            @PathVariable("id") int id,
            @RequestBody PostDto postDto
    ) {
        logger.info(boardService.toString());
        this.boardService.createPost(id, postDto);
    }

    // GET /board

    @GetMapping()
    public List<BoardDto> readBoardAll() {
        logger.info("in read all");
        return this.boardService.readBoardAll();
    }

    // GET /board/post/

    @GetMapping("post/")
    public List<PostDto> readPostAll() {
        logger.info("in read all");
        return this.boardService.readPostAll();
    }

    // GET /board/0/

    @GetMapping("{id}")
    public BoardDto readBoard(@PathVariable("id") int id) {
        logger.info("in read one");
        return this.boardService.readBoard(id);
    }

    // GET /board/post/0/

    @GetMapping("post/{id}")
    public PostDto readPost(@PathVariable("id") int id) {
        logger.info("in read one");
        return this.boardService.readPost(id);
    }

    // PUT /board/0/

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBoard(
            @PathVariable("id") int id,
            @RequestBody BoardDto boardDto
    ) {
        logger.info("target id: " + id);
        logger.info("update content" + boardDto);
        this.boardService.updateBoard(id, boardDto);
    }

    // PUT /board/post/0

    @PutMapping("post/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePost(
            @PathVariable("id") int id,
            @RequestBody PostDto postDto
    ) {
        logger.info("target id: " + id);
        logger.info("update content" + postDto);
        this.boardService.updatePost(id, postDto);
    }

    // DELETE /board/0

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteBoard(@PathVariable("id") int id) {
        this.boardService.deleteBoard(id);
    }

    // DELETE /board/post/0

    @DeleteMapping("post/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePost(
            @PathVariable("id") int id,
            @RequestParam String password
    ) {
        this.boardService.deletePost(id, password);
    }
}
