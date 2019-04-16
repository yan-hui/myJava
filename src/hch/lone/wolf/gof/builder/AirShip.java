package hch.lone.wolf.gof.builder;
/**
 * 飞船
 */
public class AirShip {
    OrbitalModual orbitalModual;
    AireShipEngine engine;
    EscapeTower escapeTower;

    public OrbitalModual getOrbitalModual() {
        return orbitalModual;
    }

    public void setOrbitalModual(OrbitalModual orbitalModual) {
        this.orbitalModual = orbitalModual;
    }

    public AireShipEngine getEngine() {
        return engine;
    }

    public void setEngine(AireShipEngine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
class AireShipEngine{
    private String name;

    public AireShipEngine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class OrbitalModual{
    private String name;

    public OrbitalModual(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}