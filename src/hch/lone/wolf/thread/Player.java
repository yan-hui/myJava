package hch.lone.wolf.thread;

/**
 * @description:
 * @author: hch
 * @create: 2019/4/15 12:29
 * @version: v1.0
 */
public class Player implements Runnable{
    private Movie movie;

    public Player(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            if (0==i%2){
                movie.play("左青龙");
            }else{
                movie.play("右白虎");
            }
        }
    }
}
