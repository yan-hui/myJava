package hch.lone.wolf.gof.factory.abstractFactory;

public interface Seat {
    void massage();
}
class luxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("自动按摩！");
    }
}
class lowSeat implements Seat{
    @Override
    public void massage() {
        System.out.println("无自动按摩");
    }
}
