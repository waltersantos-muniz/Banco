
package banco;


public class Principal {

  
    public static void main(String[] args) {
       Cliente c = new Cliente();
       Funcionario f = new Funcionario();
       Banco b = new Banco();
       
       c.setBanco(b);
       b.setCliente(c);
       f.setBanco(b);
       b.setFuncionario(f);
       
       f.setCodFuncionario(12);
       f.setCpf("548.787.879-70");
       f.setIdade(50);
       f.setNome("Adalberto");
       f.setSetor("Administrativo");
       
       c.setCodCliente(50);
       c.setCpf("500.500.500-70");
       c.setCredito(50.00);
       c.setIdade(80);
       c.setNome("José");
       
       b.setCodBanco(2000);
       b.setNome("Almit");
       
       System.out.println("Cliente: "+b.getCliente());
       System.out.println("Código do Banco: "+b.getCodBanco());
       System.out.println("Funcionário: "+b.getFuncionario());
       System.out.println("Nome: "+b.getNome());
       System.out.println("Nome funcionário: "+f.getNome());
       System.out.println("CPF: "+f.getCpf());
       System.out.println("Setor: "+f.getSetor());
       System.out.println("Banco: "+f.getBanco());
       System.out.println("Código funcionário: "+f.getCodFuncionario());
       System.out.println("Idade funcionário: "+f.getIdade());
       System.out.println("Banco: "+c.getBanco());
       System.out.println("Credito: "+c.getCredito());
       System.out.println("Código cliente: "+c.getCodCliente());
       System.out.println("Nome do cliente: "+c.getNome());
       System.out.println("CPF do cliente: "+c.getCpf());
       System.out.println("Idade do cliente: " +c.getIdade());
       
      
    }
    
}
