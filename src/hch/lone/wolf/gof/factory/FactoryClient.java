package hch.lone.wolf.gof.factory;

import hch.lone.wolf.gof.factory.factory.AudiFactory;
import hch.lone.wolf.gof.factory.factory.BydFactory;
import hch.lone.wolf.gof.factory.simplefactory.SimpleFactory;
import org.junit.Test;

/**
 * @Description
 * @Author hechunhui
 * @Created 2019/1/2 21:08
 */
public class FactoryClient {
    @Test
    public void testSimpleFactory() {
        Car car1 = SimpleFactory.createCar("奥迪");
        Car car2 = SimpleFactory.createCar("比亚迪");
        Car audi = SimpleFactory.createAudi();
        Car byd = SimpleFactory.createByd();
        car1.run();
        car2.run();
        audi.run();
        byd.run();

    }

    /**
     * 测试工厂方法模式
     */
    @Test
    public void testFactory(){
        Car car = new AudiFactory().createCar();
        Car car1 = new BydFactory().createCar();
        car.run();
        car1.run();
    }
}
