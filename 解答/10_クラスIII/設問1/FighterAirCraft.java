public class FighterAirCraft extends AirPlane {

    // コンストラクタ（引数なし）
	public FighterAirCraft() {
		super("戦闘機");
	}

    //  タイプの取得
    public String getType(){
        return super.getType();
    }

    //  飛行する
    public void fly(){
        System.out.println("攻撃に出るために飛行します。");
    }

    //  戦闘する
    public void fight(){
        System.out.println("戦闘します。");
    }
}
