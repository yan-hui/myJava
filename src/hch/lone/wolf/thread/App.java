package hch.lone.wolf.thread;

/**
 * @description:
 * @author: hch
 * @create: 2019/4/15 12:33
 * @version: v1.0
 */
public class App {
    public static void main(String[] args) {
        //共同的资源
        Movie movie = new Movie();
        Player player = new Player(movie);
        Watcher watcher = new Watcher(movie);
        new Thread(player).start();
        new Thread(watcher).start();

    }
}
