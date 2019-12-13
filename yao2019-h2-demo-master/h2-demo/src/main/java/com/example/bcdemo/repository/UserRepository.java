package com.example.bcdemo.repository;

import com.example.bcdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author hjf
 * @date 2019/10/10 - 15:25
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
