package fr.cacib.kata.persistence.repository;

import fr.cacib.kata.persistence.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageEntityRepository extends JpaRepository<MessageEntity, Long> {
}
