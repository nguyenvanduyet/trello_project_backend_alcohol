package com.example.trello_project_alcohol.repo;

import com.example.trello_project_alcohol.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepo extends JpaRepository<Board,Long> {
    List<Board> findBoardByAppUser_Id (Long app_user_id);

}
