package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Long> {
    Optional<AppUser> findAppUserByUserName(String username);
    @Query(nativeQuery = true, value = "select * from app_user join card_tag_user ctu on app_user.id = ctu.app_user_id where ctu.card_id = ?")
    List<AppUser> findListAppUserByCardId(Long card_id);
}
