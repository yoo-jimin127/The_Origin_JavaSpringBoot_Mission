package dev.jimin.dbcommunity.repository;

import dev.jimin.dbcommunity.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}