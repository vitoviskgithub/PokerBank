function enviarEmail(){
Email.send({
    Host : "smtp.gmail.com",
    Port : '465',
    Username : "vtvsk2022@gmail.com",
    Password : "Vidanova2022$Gmail",
    To : 'vtvsk2022@gmail.com',
    From : "vtvsk2022@gmail.com",
    Subject : "Teste",
    Body : "Teste"
}).then(
  message => alert(message)
);
}

import { include } from 'incluirArquivo.js'
var javasrc = 'https://smtpjs.com/v3/smtp.js';
include(javasrc);
