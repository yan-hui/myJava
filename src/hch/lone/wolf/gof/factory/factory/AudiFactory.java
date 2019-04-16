package hch.lone.wolf.gof.factory.factory;

import hch.lone.wolf.gof.factory.Audi;
import hch.lone.wolf.gof.factory.Car;

/**
 * @Description
 * @Author hechunhui
 * @Created 2019/1/2 21:55
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
