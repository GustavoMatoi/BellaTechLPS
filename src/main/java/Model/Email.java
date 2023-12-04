/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;


public class Email{
    
    public void enviarEEmail(String nome, String dataHora, String destinatario) {
        String emailRemetente = "Bella.tech.estetica@gmail.com";
        String senhaEmailRemetente = "fioh ngvb kufp mwwp";

        try {
            HtmlEmail email = new HtmlEmail();
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator(emailRemetente, senhaEmailRemetente));
            email.setSSLOnConnect(true);

            email.setFrom(emailRemetente);
            email.setSubject("Consulta marcada!");

            String mensagem = "<html>"
                    + "<body style='font-family: Arial, sans-serif; color: #FFFFFF; background-color: #F15C7F;'>"
                    + "<h1>Olá, " + nome + ",</h1>"
                    + "<p>Espero que este e-mail o encontre bem. Gostaríamos de informar que a sua consulta foi marcada com sucesso.</p>"
                    + "<p>Agradecemos por escolher os nossos serviços e estamos ansiosos para recebê-lo em nosso consultório.</p>"
                    + "<p>Data: <strong style='color: #9B59B6;'>" + dataHora + "</strong></p>"
                    + "<p>Caso haja qualquer alteração ou se precisar reagendar, por favor, entre em contato conosco o mais breve possível. Estamos aqui para ajudar.</p>"
                    + "<p>Agradecemos pela sua confiança em nossos serviços e aguardamos ansiosamente para atendê-lo na data marcada.</p>"
                    + "<p style='color: #FFFFFF;'>Atenciosamente,<br/>Equipe BellaTech</p>"
                    + "</body>"
                    + "</html>";

            email.setHtmlMsg(mensagem);
            email.setCharset("UTF-8");

            email.addTo(destinatario);
            email.send();

            System.out.println("Email enviado com sucesso!");

        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}