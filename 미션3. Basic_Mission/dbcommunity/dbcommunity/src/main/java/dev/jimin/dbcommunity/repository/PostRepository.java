package dev.jimin.dbcommunity.repository;

import dev.jimin.dbcommunity.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
}