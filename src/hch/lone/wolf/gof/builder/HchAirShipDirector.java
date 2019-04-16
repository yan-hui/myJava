package hch.lone.wolf.gof.builder;
/**
 * @description： 辉哥牌飞船组装者
 * @author: hch
 * @create: 2019/2/11 22:54
 *
 */
public class HchAirShipDirector implements AirShipDirector{
    private AirShipBuilder builder;

    public HchAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        AireShipEngine engine = builder.builderEngine();
        OrbitalModual orbitalModual = builder.builderOrbitalModual();
        EscapeTower escapeTower = builder.builderEscapeTower();
        AirShip airShip = new AirShip();
        //装配成飞船对象
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModual(orbitalModual);
        return airShip;
    }
}
