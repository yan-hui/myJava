package hch.lone.wolf.gof.factory.abstractFactory;
/**
 * @description： 抽象工厂模式
 * @author: hch
 * @create: 2019/2/11 21:57
 *
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {
        CarFactory car = new LuxuryCarFactory();
        Engine e = car.createEngine();
        Seat s = car.createSeat();
        Tyre t = car.createTyre();
        e.run();
        e.start();
        s.massage();
        t.revolve();
        System.out.println("----------");
        CarFactory car2 = new LowCarFactory();
        Engine engine = car2.createEngine();
        Seat seat = car2.createSeat();
        Tyre tyre = car2.createTyre();
        engine.run();
        engine.start();
        seat.massage();
        tyre.revolve();
    }
}
