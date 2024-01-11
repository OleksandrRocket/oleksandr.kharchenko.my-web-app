package ua.javarush.project.answers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Question {
    @JsonProperty("number")
    private final int number;
    @JsonProperty("text")
    private final String text;
    @JsonProperty("answer1")
    private final String answer1;
    @JsonProperty("answer2")
    private final String answer2;
    @JsonProperty("textlostgame")
    private final String textlostgame;
}
