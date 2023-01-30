package chatgpt.example.chatgpt.repository;

import chatgpt.example.chatgpt.entities.ChatGptResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatGptResponseRepository extends JpaRepository<ChatGptResponse, String> {
}
