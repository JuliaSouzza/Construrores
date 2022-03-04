package Funcionarioteste;

public class Funcionario {
    //Atributos  

    private String nome;
    private double salario;
    private String registro;
    private String endereco;
    private String area;

    private boolean trabalhando;

    public Funcionario() {

    }

    public Funcionario(String nome, Double salario, String registro, String endereco, String area) {
        this.nome = nome;
        this.salario = salario;
        this.registro = registro;
        this.endereco = endereco;
        this.area = area;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getEnderco() {
        return endereco;

    }

    public void setEnderco(String endereco) {
        this.endereco = endereco;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
