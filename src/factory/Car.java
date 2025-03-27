package factory;

// 車インターフェース
interface Car {
    void drive();
}

// 具体的な車クラス
class Sedan implements Car {
    public void drive() {
        System.out.println("セダンを運転します。");
    }
}

class SUV implements Car {
    public void drive() {
        System.out.println("SUVを運転します。");
    }
}

class Kei implements Car {
    public void drive() {
        System.out.println("軽自動車を運転します。");
    }
}

// 車工場の抽象クラス
abstract class CarFactory {
    // ファクトリーメソッド
    public abstract Car createCar();
}

// セダン工場クラス
class SedanFactory extends CarFactory {
    public Car createCar() {
        return new Sedan();
    }
}

// SUV工場クラス
class SUVFactory extends CarFactory {
    public Car createCar() {
        return new SUV();
    }
}

//軽自動車
class KeiFactory extends CarFactory {
    public Car createCar() {
        return new Kei();
    }
}


