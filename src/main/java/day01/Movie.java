package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> dateOfPlay;

    public Movie(String title, List<LocalDateTime> dateOfPlay) {
        this.title = title;
        this.dateOfPlay = dateOfPlay;
    }

    @Override
    public String toString() {
        return  title;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getDateOfPlay() {
        return dateOfPlay;
    }
}
