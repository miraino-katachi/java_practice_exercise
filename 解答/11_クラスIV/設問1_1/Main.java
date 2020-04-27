public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Mailer mailer = new Mailer();
        Computer computer = new Computer();

        funcPhone(phone);
        funcMailer(mailer);
        funcComputer(computer);
    }

    //  電話としての処理
    public static void funcPhone(Phone phone) {
        phone.callPhone();      //  電話を掛ける
        phone.recievePhone();   //  電話を受ける
    }

    //  メーラーとしての処理
    public static void funcMailer(Mailer mailer) {
        mailer.sendMail();      //  メールを送信する
        mailer.recieveMail();   //  メールを受信する
    }
 
    //  コンピュータとしての処理
    public static void funcComputer(Computer computer) {
        computer.playGame();    //  ゲームをする
        computer.browseWeb();   //  ウェブを閲覧する
    }
}