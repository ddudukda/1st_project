package com.fastcampus.projectspingboard.repository;

import com.fastcampus.projectspingboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository  extends JpaRepository<UserAccount, String> {
}
