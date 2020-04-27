public class PersonalComputer extends Computer {
  
    //  コンストラクタ
    public PersonalComputer() {
        super("パーソナルコンピュータ");
    }

    //  入力処理
    public void input() {
        System.out.println("キーボード・マウスで入力");
    }

    //  出力処理
    public void output() {
        System.out.println("ディスプレイに出力");
    }
}
