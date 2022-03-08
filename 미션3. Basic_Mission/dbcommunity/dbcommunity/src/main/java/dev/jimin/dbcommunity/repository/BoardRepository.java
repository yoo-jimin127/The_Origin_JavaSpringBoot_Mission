package dev.jimin.dbcommunity.repository;

import dev.jimin.dbcommunity.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<BoardEntity, Long> {
}
