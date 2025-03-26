package singleton;

public class Employee {
    public static void main(String[] args) {
//        GeneralManager gm = new GeneralManager(); // ←これはエラーになる（private コンストラクタ）
        GeneralManager gm1 = GeneralManager.getInstance();
        gm1.report("Employee からの報告です。");

        Employee2.doSomething();
    }
}

class Employee2 {
    public static void doSomething() {
        GeneralManager gm2 = GeneralManager.getInstance();
        gm2.report("Employee2 からの報告です。");

        System.out.println("gm1とgm2は同じ？: " + (gm2 == GeneralManager.getInstance())); // trueになる
    }
}
