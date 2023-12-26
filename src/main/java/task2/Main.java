package task2;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;
public class Main {
    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("API_KEY", "apiSecret", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "sahaidak.pn@ucu.edu.ua")
                                        .put("Name", "Yura"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", "sahaidak.pn@ucu.edu.ua")
                                                .put("Name", "Yura")))
                                .put(Emailv31.Message.SUBJECT, "Mailjet")
                                .put(Emailv31.Message.TEXTPART, "Welcome to Mailjet")
                                .put(Emailv31.Message.HTMLPART, "<h3>Welcome!</h3>")
                                .put(Emailv31.Message.CUSTOMID, "GettingText")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
