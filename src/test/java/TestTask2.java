import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.task2.BirthdayMail;
import com.example.task2.Client;
import com.example.task2.MailBox;
import com.example.task2.MailCode;
import com.example.task2.MailInfo;
import com.example.task2.MailSender;
import com.example.task2.Sex;

public class TestTask2 {
    @Test
    public void testClient() {
        Client client = new Client("John", 25, Sex.MALE);
        assertEquals("John", client.getName());
        assertEquals(25, client.getAge());
        assertEquals(Sex.MALE, client.getSex());
    }

    @Test
    public void testMailInfo() {
        Client client = new Client("Jane", 30, Sex.FEMALE);
        MailInfo mailInfo = new MailInfo(client, MailCode.GIFTMAIL);

        assertEquals(client, mailInfo.getClient());
        assertEquals(MailCode.GIFTMAIL, mailInfo.getMailCode());
    }

    @Test
    public void testSendMail() {
        Client client = new Client("John", 25, Sex.MALE);
        MailInfo mailInfo = new MailInfo(client, MailCode.BIRTHDAYMAIL);

        MailSender mailSender = new MailSender(new BirthdayMail());

        mailSender.sendMail(mailInfo);
    }

    @Test
    public void testMailBox() {
        Client client1 = new Client("John", 25, Sex.MALE);
        MailInfo birthdayMail = new MailInfo(client1, MailCode.BIRTHDAYMAIL);

        Client client2 = new Client("Jane", 30, Sex.FEMALE);
        MailInfo giftMail = new MailInfo(client2, MailCode.GIFTMAIL);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(giftMail);
    }
}
