package singleton;

public class GeneralManager {
    // 唯一のインスタンスを保持する静的変数
    private static GeneralManager instance;

    // プライベートコンストラクタで外部からのインスタンス化を防止
    private GeneralManager() {}

    // 唯一のインスタンスを取得するメソッド
    public static GeneralManager getInstance() {
        if (instance == null) {
            instance = new GeneralManager();
        }
        return instance;
    }

    // 業務報告を受け付けるメソッド
    public void report(String message) {
        System.out.println("総務部長への報告: " + message);
    }
}

