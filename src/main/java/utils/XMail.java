/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Fixluck
 */
public class XMail {

    public static String generateCode(int length) {
        String letters = "ABCDFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        Random random = new Random();

        StringBuilder randomGenerate = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(letters.length());
            char randomLetter = letters.charAt(randomIndex);
            randomGenerate.append(randomLetter);

        }
        return randomGenerate.toString();
    }

    public static void sendMail(String receiveEmail, String code) {
        try {
            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.ssl.protocols", "TLSv1.2");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");
            String defaultEmail = "mannvps34827@fpt.edu.vn";
            String defaultPassword = "ggytetocigdzskgw";
            Session s = Session.getInstance(p, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(defaultEmail, defaultPassword);
                }
            });

            String from = defaultEmail;
            String to = receiveEmail;
            String subject = "Here is your code";
            String body = code;
            Message msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(from));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(subject);
            msg.setText(body);

            Transport.send(msg);
        } catch (MessagingException e) {
            System.out.println(e);
        }
    }

//    public static void main(String[] args) {
//        sendMail("caube.vodoi5@gmail.com", "sadwasdw");
//    }
}
