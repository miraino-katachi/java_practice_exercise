public class PassengerPlane extends AirPlane {

    // コンストラクタ（引数なし）
	public PassengerPlane() {
    	super("旅客機");
    }

    //  タイプの取得
    public String getType(){
        return super.getType();
    }

    //  飛行する
    public void fly(){
        System.out.println("乗客を乗せて目的地まで飛行します。");
    }

    //  乗客を運ぶ
    public void carryPassengers(){
        System.out.println("乗客を目的地まで運びます。");
    }
}
