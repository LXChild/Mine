package com.example.dao;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Wang Chong
 * @description
 * @date 2017/3/1
 * @modified by
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
