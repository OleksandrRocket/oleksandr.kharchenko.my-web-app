package ua.javarush.project.answers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameData {
//    private final String STORY;
    @JsonProperty ("quantity")
    private final int quantityQuestions;
}
