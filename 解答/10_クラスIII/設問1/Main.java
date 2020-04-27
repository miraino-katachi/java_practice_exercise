public class Main {
    public static void main(String[] args) {

        //  戦闘機クラスのインスタンスの生成
        FighterAirCraft fighter = new FighterAirCraft();
        //  旅客機クラスのインスタンスの生成
        PassengerPlane airliner = new PassengerPlane();

        //  戦闘機クラスの処理
        System.out.println("戦闘機");
        fighter.fly();                  //  飛行する
        fighter.fight();                //  戦闘する

        //  旅客機クラスの処理
        System.out.println("旅客機");
        airliner.fly();                //  飛行する
        airliner.carryPassengers();    //  乗客を運ぶ
    }
}