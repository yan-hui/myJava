package hch.lone.wolf.gof.factory.simplefactory;

import hch.lone.wolf.gof.factory.Audi;
import hch.lone.wolf.gof.factory.Byd;
import hch.lone.wolf.gof.factory.Car;

/**
 * @Description 简单工厂,通过接收的参数的不同来返回不同的实例，对于增加新产品无能为力！不修改代码的话，无法扩展
 * @Author hechunhui
 * @Created 2019/1/2 21:06
 */
public class SimpleFactory {
    public static Car createCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("比亚迪".equals(type)) {
            return new Byd();
        } else {
            return null;
        }
    }

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }
}
