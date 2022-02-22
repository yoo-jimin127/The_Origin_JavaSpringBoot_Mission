package dev.jimin.cruddemo.board;

import dev.jimin.cruddemo.post.PostDto;

import java.util.List;

public class BoardDto {
    private String name;
    private List<PostDto> postList = null;

    public BoardDto() {
    }

    public BoardDto(String name, List<PostDto> postList) {
        this.name = name;
        this.postList = postList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PostDto> getPostList() {
        return postList;
    }

    public void setPostList(List<PostDto> postList) {
        this.postList = postList;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "name='" + name + '\'' +
                ", postList=" + postList +
                '}';
    }
}
