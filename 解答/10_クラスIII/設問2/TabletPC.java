public class TabletPC extends Computer {

    //  コンストラクタ
    public TabletPC(){
        super("タブレットPC");
    }

    //  入力処理
    public void input(){
        System.out.println("タッチパネルディスプレイをタップして操作");
    }

    //  出力処理
    public void output(){
        System.out.println("タッチパネルディスプレイに出力");
    }
}
