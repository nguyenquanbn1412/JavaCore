public class MovieService {
    Movie[] createMovieArr() {
        Movie movie = new Movie();
        Movie[] moviesArr = new Movie[3];
        movie.setId(1);
        movie.setTitle("Nhiem Vu Bat Kha Thi");
        movie.setCategory("Action");
        movie.setDirector("Tom Cruise");
        movie.setReleaseDate("2000-12-11");
        movie.setTime("11:00:00");
        moviesArr[0] = movie;
        movie.setId(2);
        movie.setTitle("Chua Te Cua Nhung Chiec Nhan");
        movie.setCategory("Science");
        movie.setDirector("Peter Jackson");
        movie.setReleaseDate("2002-11-11");
        movie.setTime("06:00:00");
        moviesArr[1] = movie;
        movie.setId(3);
        movie.setTitle("Harry Potter");
        movie.setCategory("Science");
        movie.setDirector("Rowling");
        movie.setReleaseDate("2005-05-11");
        movie.setTime("09:00:00");
        moviesArr[2] = movie;
        return moviesArr;
    }
}
