public abstract class AirPlane {

    //  飛行機のタイプ
    private String type;

    // コンストラクタ（引数あり）
    AirPlane(String type){
    	this.type=type;
    }

    //  タイプの取得
    public String getType(){
        return type;
    }

    //  飛行する
    abstract void fly();
}
