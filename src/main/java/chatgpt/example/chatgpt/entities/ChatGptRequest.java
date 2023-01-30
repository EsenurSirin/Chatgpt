package chatgpt.example.chatgpt.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "chatgpt_request", schema = "chatgpt")
public class ChatGptRequest extends BaseEntity {

    @Column(name = "model")
    private String model;

    @Column(name = "prompt")
    private String prompt;

    @Column(name = "temperature")
    private Double temperature;

    @JsonProperty("max_tokens")
    @Column(name = "max_tokens")
    private Integer maxTokens;

    @JsonProperty("top_p")
    @Column(name = "topP")
    private Double topP;
}
