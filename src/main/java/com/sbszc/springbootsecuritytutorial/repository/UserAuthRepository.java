package com.sbszc.springbootsecuritytutorial.repository;

import com.sbszc.springbootsecuritytutorial.entity.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthRepository extends JpaRepository<UserAuth, String> {
}
