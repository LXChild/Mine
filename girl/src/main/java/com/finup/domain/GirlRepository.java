package com.finup.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: Wang Chong
 * @Description:
 * @Date: Created on 2016/12/28.
 * @Modified by:
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    List<Girl> findByAge(Integer age);
}
