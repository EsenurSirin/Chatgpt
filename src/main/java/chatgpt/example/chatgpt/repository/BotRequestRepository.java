package chatgpt.example.chatgpt.repository;

import chatgpt.example.chatgpt.entities.BotRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotRequestRepository extends JpaRepository<BotRequest, String> {
}
