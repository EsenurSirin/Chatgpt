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
@Table(name = "choice", schema = "chatgpt")
public class Choice extends BaseEntity {

    @Column(name = "index")
    private Integer index;

    @Column(name = "text")
    private String text;

    @Column(name = "finish_reason")
    @JsonProperty("finish_reason")
    private String finishReason;
}
