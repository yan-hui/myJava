package hch.lone.wolf.gof.factory.abstractFactory;

public class LowCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new lowEngine();
    }

    @Override
    public Seat createSeat() {
        return new lowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new lowTyre();
    }
}
