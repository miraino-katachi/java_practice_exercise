public class CellPhone implements IComputer, IMailer, IPhone {

	public void browseWeb(){
        System.out.println("ウェブを閲覧する");
    }

	public void playGame(){
        System.out.println("ゲームをする");
    }

	public void sendMail(){
        System.out.println("メールを送る");
    }

	public void recieveMail(){
        System.out.println("メールを受信する");
    }

	public void callPhone(){
        System.out.println("電話を掛ける");
    }

	public void recievePhone(){
        System.out.println("電話を受ける");
    }
}
