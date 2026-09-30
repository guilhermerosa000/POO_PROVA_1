package poo_prova_1;

/**
 *
 * @author aluno
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private Departamento departamento;
    private Cargo cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cpf, Departamento departamento,
            Cargo cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }

    public Funcionario() {
        this.nome = "indefinido";
        this.cpf = "000.000.000-00";
        this.departamento = null;
        this.cargo = null;
        this.salario = 0.0;
        this.ativo = false;
    }

    public void alterarDados(String nome, String cpf, Departamento departamento,
            Cargo cargo, double salario, boolean ativo) {

        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = ativo;
    }

    public double aplicarReajuste(double percentual) {
        double reajuste = (salario * percentual) / 100;
        this.salario = salario 
                + reajuste;

        return salario;

    }

    public void demitir() {
        this.ativo = false;
    }

    public String toString() {

        String situacao = "";
        String nomeCargo = "";
        String nomeDepartamento = "";
        
        
        if (cargo == null) {
            nomeCargo = "Não definido";
            
        } else {
            nomeCargo = cargo.getNome();
        }

       if(departamento == null) {
           nomeDepartamento = "Não definido";
       } else {
           nomeDepartamento = departamento.getNome();
       }

        if (ativo == true) {
            situacao = "ATIVO";
        } else {
            situacao = "INATIVO";
        }

        return "Nome: " + this.nome
                + "\nCPF: " + this.cpf
                + "\nDepartamento: " + nomeDepartamento
                + "\nCargo: " + nomeCargo 
                + "\nSalário: " + this.salario
                + "\nSituacão: " + situacao;

    }
}
