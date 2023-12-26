package task2;

public class GiftMail implements MailCode{
    private static String TEMPLATE = "You %name got a discount";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%name", client.getName());
    }
}