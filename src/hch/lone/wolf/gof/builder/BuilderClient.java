package hch.lone.wolf.gof.builder;

public class BuilderClient {
    public static void main(String[] args) {
        AirShipBuilder builder = new HchAirShipBuilder();
        AirShipDirector director = new HchAirShipDirector(builder);
        AirShip airShip = director.directorAirShip();
        System.out.println(airShip.engine.getName());
        System.out.println(airShip.escapeTower.getName());
        System.out.println(airShip.orbitalModual.getName());

    }
}
