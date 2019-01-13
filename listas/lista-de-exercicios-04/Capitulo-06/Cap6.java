class Cap6 {

    public static void main(String[] args){
      Funcionario programador = new Funcionario();
      //Questão 1
      //programador.nome = "Diego";
      
      //Questão 2 e 3
      System.out.println("Questões 2 e 3 ->");
      programador.setSalario(2000);
      programador.setNome("Alonso");
      programador.setSetor("TI - Programadora Java");
      
      System.out.println("Nome do funcionário: " + programador.getNome() +
            "\nSetor de trabalho: " + programador.getSetor() + 
            "\nSalário: " + programador.getSalario() + 
            "\nGanho anual: " + programador.getGanhoAtual() +
            "\nID: " + programador.getIdentificador());
      System.out.println("--------------------------------");
      
      //Questão 4
      Funcionario analista = new Funcionario("Bruce");
      analista.setSetor("Gestão de projetos");
      analista.setSalario(3000);
      System.out.println("Nome do analista: " + analista.getNome() + 
            "\nID: " + analista.getIdentificador());
      
      //Questão 6 e 7
      System.out.println("\n\nNa nova empresa");
      Empresa JP = new Empresa(3);
      JP.setNome("Empresa Clezy Serv");
      JP.adiciona(programador);
      JP.adiciona(analista);
      JP.adiciona(new Funcionario("Estagiário"));
      JP.getFuncionario(2).setSetor("Faz tudo");
      JP.getFuncionario(2).setSalario(0);
      
      System.out.println(JP.getNome());
      for(int i=0 ; i < 3 ; i++){
       System.out.println("Nome do funcionário: " + JP.getFuncionario(i).getNome() +
             "\nSetor de trabalho: " + JP.getFuncionario(i).getSetor() + 
             "\nSalário: " + JP.getFuncionario(i).getSalario() + 
             "\nGanho anual: " + JP.getFuncionario(i).getGanhoAtual() +
             "\nID: " + JP.getFuncionario(i).getIdentificador() + 
         "\n-----------------------");
      }
      
      
    }
    
}