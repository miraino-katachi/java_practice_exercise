public class Main {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        funcPhone(cellPhone);
        funcMailer(cellPhone);
        funcComputer(cellPhone);
    }

    //  電話としての処理
    public static void funcPhone(IPhone phone) {
        phone.callPhone();      //  電話を掛ける
        phone.recievePhone();   //  電話を受ける
    }

    //  メーラーとしての処理
    public static void funcMailer(IMailer mailer) {
        mailer.sendMail();      //  メールを送信する
        mailer.recieveMail();   //  メールを受信する
    }
 
    //  コンピュータとしての処理
    public static void funcComputer(IComputer computer) {
        computer.playGame();    //  ゲームをする
        computer.browseWeb();   //  ウェブを閲覧する
    }
}