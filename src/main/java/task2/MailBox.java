package task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mail){
        infos.add(mail);
    }

    public void sendAll() {
        MailSender sender = new MailSender();
        for (int i = 0; i < infos.size(); i++) {
            sender.sendMail(infos.get(i));
        }

    }
}