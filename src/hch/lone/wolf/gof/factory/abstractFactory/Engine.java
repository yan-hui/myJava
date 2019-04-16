package hch.lone.wolf.gof.factory.abstractFactory;

public interface Engine {
    void run();
    void start();
}

class lusuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转得快！");
    }

    @Override
    public void start() {
        System.out.println("启停快！");
    }
}
class lowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转得慢！");
    }

    @Override
    public void start() {
        System.out.println("启停慢！");
    }
}