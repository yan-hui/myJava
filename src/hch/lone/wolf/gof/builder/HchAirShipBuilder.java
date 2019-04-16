package hch.lone.wolf.gof.builder;
/**
 * @description： 辉哥牌飞船构建者
 * @author: hch
 * @create: 2019/2/11 22:53
 *
 */
public class HchAirShipBuilder implements AirShipBuilder{
    @Override
    public OrbitalModual builderOrbitalModual() {
        System.out.println("构建辉哥牌返回舱。。。。");
        return new OrbitalModual("辉哥牌返回舱");
    }

    @Override
    public AireShipEngine builderEngine() {
        System.out.println("构建辉哥拍发动机。。。。");
        return new AireShipEngine("辉哥牌发动机");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建辉哥牌逃逸舱。。。。");
        return new EscapeTower("辉哥牌逃逸舱");
    }
}
