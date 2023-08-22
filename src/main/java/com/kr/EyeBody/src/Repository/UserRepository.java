package com.kr.EyeBody.src.Repository;

import com.kr.EyeBody.src.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {

}
