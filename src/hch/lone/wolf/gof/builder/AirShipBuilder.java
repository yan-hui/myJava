package hch.lone.wolf.gof.builder;
/**
 * @description： 飞船构建者接口
 * @author: hch
 * @create: 2019/2/11 22:52
 *
 */
public interface AirShipBuilder {
    OrbitalModual builderOrbitalModual();
    AireShipEngine builderEngine();
    EscapeTower builderEscapeTower();

}
