package testes;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class enviarEmail {

    public void enviarAnexo(String caminho, String desc_arquivo, String nome_arquivo) {

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");
        email.setSslSmtpPort("465");
        email.setStartTLSRequired(true);
        email.setStartTLSEnabled(true);
        email.setSSLOnConnect(true);

        email.setAuthenticator(new DefaultAuthenticator("parapokerbankemail@gmail.com", "vidanova2022"));

        try {
            email.setFrom("parapokerbankemail@gmail.com");//de quem vai

            email.setSubject("Assunto do email");//assunto
            email.setMsg("Texto conteúdo");//conteúdo
            email.addTo("parapokerbankemail@gmail.com");//para quem vai

//Anexando um arquivo
            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(caminho);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setDescription(desc_arquivo);
            attachment.setName(nome_arquivo);

            email.attach(attachment);

            email.send();

        } catch (EmailException erro) {
            JOptionPane.showMessageDialog(null, "Erro no envio do email com anexo: " + erro);
        }
    }

        public void enviar() {

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("email-smtp.us-east-1.amazonaws.com");
        email.setSslSmtpPort("587");
        email.setStartTLSRequired(true);
        email.setStartTLSEnabled(true);
        email.setSSLOnConnect(true);

        email.setAuthenticator(new DefaultAuthenticator("AKIAYXX745YRBNIOYSIU", "BCCTcvCKpssyRfhuCF98a73QT+BeEueIRKR8oaw"));

        try {
            email.setFrom("parapokerbankemail@gmail.com");//de quem vai

            email.setSubject("Assunto do email");//assunto
            email.setMsg("Texto conteúdo");//conteúdo
            email.addTo("parapokerbankemail@gmail.com");//para quem vai

            email.send();

        } catch (EmailException erro) {
            JOptionPane.showMessageDialog(null, "Erro no envio do email sem anexo: " + erro);
        }
    }
    
}
