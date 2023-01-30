package chatgpt.example.chatgpt.entities;

import jakarta.persistence.*;
import lombok.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "chatgpt_response", schema = "chatgpt")
public class ChatGptResponse extends BaseEntity{

    @Column(name = "object")
    private String object;

    @Column(name = "model")
    private String model;

    @Temporal(TemporalType.DATE)
    @Column(name = "created")
    private LocalDate created;

    @Column(name = "choices")
    private List choices;
}
