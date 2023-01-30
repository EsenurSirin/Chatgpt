package chatgpt.example.chatgpt.repository;

import chatgpt.example.chatgpt.entities.ChatGptRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatGptRequestRepository extends JpaRepository<ChatGptRequest, String> {
}
