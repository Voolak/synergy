package com.slack.synergy.model.dao;

import com.slack.synergy.model.PrivateMessage;
import com.slack.synergy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrivateMessageRepository extends JpaRepository<PrivateMessage, Integer> {
    List<PrivateMessage> findBySender_IdOrRecipient_Id(Integer id);
}
