package ua.javarush.project.answers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class GameUFO implements Game {
    @JsonProperty("data")
    private GameData gameData;

    @JsonProperty("questions")
    private List<Question> questions;
    @JsonProperty("win")
    private Winner winner;
    private static File file = new File("src/main/webapp/challengeUFO.json");

    private GameUFO(GameData gameData, List<Question> questions, Winner winner) {
        this.gameData = gameData;
        this.questions = questions;
        this.winner = winner;
    }

    public static GameUFO init() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            GameUFO gameUFO = objectMapper.readValue(file, GameUFO.class);
            return gameUFO;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Question> startGame() {
        return Optional.empty();
    }
}


