package chatgpt.example.chatgpt.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "bot_request", schema = "chatgpt")
public class BotRequest extends BaseEntity {

    @Column(name = "message")
    private String message;


}
