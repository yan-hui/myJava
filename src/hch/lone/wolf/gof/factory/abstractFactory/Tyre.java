package hch.lone.wolf.gof.factory.abstractFactory;

public interface Tyre {
    void revolve();
}

class luxuryTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("不易磨损！");
    }
}
class lowTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("易磨损");
    }
}
