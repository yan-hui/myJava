package hch.lone.wolf.gof.factory.abstractFactory;

public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new lusuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new luxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new luxuryTyre();
    }
}
