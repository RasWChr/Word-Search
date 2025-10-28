package dk.easv.dal;

import java.util.List;

public class WordsLogic {
    private WordsData data = new WordsData();
    public List<String> getWords(){
        return data.getWords();
    }

    }
