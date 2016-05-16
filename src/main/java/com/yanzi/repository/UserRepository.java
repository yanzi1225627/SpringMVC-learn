package com.yanzi.repository;

import com.yanzi.db.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yanzi on 16/5/16.
 */
public interface UserRepository extends JpaRepository<UsersEntity, Integer> {

}
