package com.fastcampus.projectspringboard.repository;

import com.fastcampus.projectspringboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository  extends JpaRepository<UserAccount, String> {
}
