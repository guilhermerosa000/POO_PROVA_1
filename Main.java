
package poo_prova_1;

/**
 *
 * @author aluno
 */
public class Main {

   
    public static void main(String[] args) {
        
        Departamento compras = new Departamento("Compras");
        Departamento vendas = new Departamento("Vendas");
        Cargo comprador = new Cargo ("Comprador");
        Cargo vendedor = new Cargo ("Vendedor");
        
        
        Funcionario funcionario = new Funcionario("Teste", "999.888.777-76",vendas,vendedor,1000);
        Funcionario funcionarioDefault = new Funcionario();
        
        
        System.out.println(funcionario.toString());
        
        System.out.println("=============");
        
       
        System.out.println(funcionarioDefault.toString());
        
        funcionarioDefault.alterarDados("Anakata", "011.001.110-01", vendas, comprador, 1000, true);
        
          System.out.println("=============");
          
        System.out.println(funcionarioDefault.toString());
        
        funcionario.aplicarReajuste(10);
        System.out.println("=============");
        
        System.out.println(funcionario.toString());
        
        funcionarioDefault.demitir();
        
       System.out.println("=============");
       
     System.out.println(funcionarioDefault.toString());
        
    }
    
}
