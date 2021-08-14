package com.uj.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uj.aws.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
