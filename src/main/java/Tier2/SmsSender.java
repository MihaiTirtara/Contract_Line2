package Tier2;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC7ea28bac157452619e09190b4cfec71d";
    public static final String AUTH_TOKEN =
            "cb64200f145bef558af89d2b9db28af4";

    public static void SendSms(String phoneNumber,String text) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber(phoneNumber), // to
                        new PhoneNumber("+4541992468"), // from
                        text)
                .create();

        System.out.println(message.getSid());
    }
}