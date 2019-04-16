package hch.lone.wolf.gof.factory.factory;

import hch.lone.wolf.gof.factory.Byd;
import hch.lone.wolf.gof.factory.Car;

/**
 * @Description
 * @Author hechunhui
 * @Created 2019/1/2 21:54
 */
public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
