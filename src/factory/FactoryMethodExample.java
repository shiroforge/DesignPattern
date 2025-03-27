package factory;

public class FactoryMethodExample {
    public static void main(String[] args) {
        // セダン工場からセダンを作成
        CarFactory factory = new SedanFactory();
        Car car = factory.createCar();
        car.drive(); // 出力: セダンを運転します。

        // SUV工場からSUVを作成
        factory = new SUVFactory();
        car = factory.createCar();
        car.drive(); // 出力: SUVを運転します。

        // 軽自動車工場から軽を作成
        factory = new KeiFactory();
        car = factory.createCar();
        car.drive(); // 出力: 軽   を運転します。
    }
}
