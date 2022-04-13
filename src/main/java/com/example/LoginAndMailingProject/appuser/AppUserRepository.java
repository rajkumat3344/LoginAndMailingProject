package com.example.LoginAndMailingProject.appuser;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);
}
