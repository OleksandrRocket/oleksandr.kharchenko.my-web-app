package ua.javarush.project.answers;

public class CreatorOfGames {
    public Game createGame(String type) {
        switch (type){
            case "ufo" : return GameUFO.init();
            default:
                throw new IllegalArgumentException();
        }
    }
}
