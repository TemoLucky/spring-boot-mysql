package com.temo.db.springbootmysql.repository;

import com.temo.db.springbootmysql.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
