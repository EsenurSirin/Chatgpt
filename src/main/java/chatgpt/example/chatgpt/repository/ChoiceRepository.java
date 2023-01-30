package chatgpt.example.chatgpt.repository;

import chatgpt.example.chatgpt.entities.Choice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, String> {
}
