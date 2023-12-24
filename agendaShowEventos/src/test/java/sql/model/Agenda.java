package sql.model;

import java.math.BigInteger;

public class Agenda {

    private BigInteger codigo;
    private String data;
    private String horario;
    private String local;
    private String nome;

    public BigInteger getCodigo() {
        return codigo;
    }

    public void setCodigo(BigInteger codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public String setLocal(String local) {
        this.local = local;
        return local;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }
}
