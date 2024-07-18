package Moviezz;


import java.util.ArrayList;
import java.util.List;

public class MovieMain {

    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
//        Movie m = new Movie("student1","ssr","NTR","gajala");
//        movieList.add(m);
//        Movie m1 = new Movie("okkadu","guna","MAHESH","bhumika");
//        movieList.add(m1);
//        Movie m2 = new Movie("chakaram","gsekhar","prabhas","bhumika");
//        movieList.add(m2);

        Movie m = new Movie();
        m.setDirector("ssr");
        m.setHero("ntr");
        m.setHeroine("gajala");
        m.setMovieName("Student1");
        movieList.add(m);

        Movie m1 = new Movie();
        m1.setDirector("guna");
        m1.setHero("mahesh");
        m1.setHeroine("bhumika");
        m1.setMovieName("okkadu");
        movieList.add(m1);

        for (Movie mo : movieList){
           if( mo.getDirector() == "ssr"){
               System.out.println("moviename: " +mo.getMovieName());
           }

        }

    }

}
