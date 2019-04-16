package hch.lone.wolf.thread;

/**
 * @description:
 * @author: hch
 * @create: 2019/4/15 12:26
 * @version: v1.0
 */
public class Watcher implements Runnable{
    private Movie movie;


    public Watcher(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            movie.watch();
        }
    }
}
