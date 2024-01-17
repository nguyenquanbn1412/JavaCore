import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

// Functional interface for counting movies
@FunctionalInterface
interface MovieCounter<T extends Collection<Movie>> {
    long count(T movies);
}

// Generic class representing a MovieList
class MovieList<T extends Collection<Movie>> {
    private T movies;

    public MovieList(T movies) {
        this.movies = movies;
    }

    public T getMovies() {
        return movies;
    }

    public void setMovies(T movies) {
        this.movies = movies;
    }
}

public class MovieService {
    public static void main(String[] args) {
        // Read JSON file and convert to MovieList using Gson
        MovieList<Queue<Movie>> movieQueue = readMoviesFromJson("movie.json", new TypeToken<Queue<Movie>>(){}.getType());

        // Display movie information using Method References
        movieQueue.getMovies().forEach(MovieService::displayMovieInfo);

        // Count the number of Comedy movies using lambda expression
        MovieCounter<Queue<Movie>> comedyCounter = movies -> movies.stream()
                .filter(movie -> movie.getCategory().contains("Comedy"))
                .count();
        System.out.println("\nNumber of Comedy movies: " + comedyCounter.count(movieQueue.getMovies()));

        // Sort movies by title using lambda expression
        Set<Movie> movieSet = new TreeSet<>(Comparator.comparing(Movie::getTitle));
        movieQueue.setMovies(new LinkedList<>(movieSet));

        // Sort movies by length using anonymous class
        List<Movie> sortedByLength = sortMoviesByLength(movieQueue.getMovies());
        movieQueue.setMovies(new LinkedList<>(sortedByLength));

        // Sort movies by views using Method References
        List<Movie> sortedByViews = sortMoviesByViews(movieQueue.getMovies());
        movieQueue.setMovies(new LinkedList<>(sortedByViews));

        // Count movies for each category using Stream API and Optional
        Map<String, Long> categoryCount = movieQueue.getMovies().stream()
                .flatMap(movie -> movie.getCategory().stream())
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        categoryCount.forEach((category, count) ->
                System.out.println(category + ": " + count + " movies"));
    }

    private static MovieList<Queue<Movie>> readMoviesFromJson(String filePath, Type type) {
        try (FileReader reader = new FileReader(filePath)) {
            // Use Gson to parse JSON and convert to MovieList
            Queue<Movie> movies = new Gson().fromJson(reader, type);
            return new MovieList<>(movies);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void displayMovieInfo(Movie movie) {
        System.out.println(movie.getTitle() + " - Length: " + movie.getLength() + " mins");
    }

    private static List<Movie> sortMoviesByLength(Queue<Movie> movies) {
        return movies.stream()
                .sorted(Comparator.comparingInt(Movie::getLength))
                .collect(Collectors.toList());
    }

    private static List<Movie> sortMoviesByViews(Queue<Movie> movies) {
        return movies.stream()
                .sorted(Comparator.comparingInt(Movie::getView).reversed())
                .collect(Collectors.toList());
    }
}
