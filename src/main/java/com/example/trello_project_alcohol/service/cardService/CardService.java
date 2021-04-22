package com.example.trello_project_alcohol.service.cardService;

import com.example.trello_project_alcohol.model.Card;
import com.example.trello_project_alcohol.repo.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService implements ICardService{
    @Autowired
    private CardRepo cardRepo;
    @Override
    public List<Card> findAll() {
        return null;
    }

    @Override
    public Card findById(Long id) {
        return cardRepo.findById(id).get();
    }

    @Override
    public Card save(Card card) {
        return cardRepo.save(card);
    }

    @Override
    public void delete(Long id) {
        cardRepo.deleteById(id);

    }

    @Override
    public List<Card> findCardsByListId(Long id) {
        return cardRepo.findCardsByList_IdOrderByPosition(id);
    }
}