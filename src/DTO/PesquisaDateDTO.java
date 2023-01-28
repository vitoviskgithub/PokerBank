
package DTO;

import java.util.Date;

public class PesquisaDateDTO {
    
    private Date datainicio;
    private Date datafim;
    private int iduser,soma;
    private String nome_user;

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafim() {
        return datafim;
    }

    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }
    
    
}
