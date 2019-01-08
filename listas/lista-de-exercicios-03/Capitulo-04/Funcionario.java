class Funcionario {
    String nome,
           departamento,
           dataEntrada,
           RG;
    
    double salario;
    
    void bonifica(double aumento){
        this.salario += aumento;
    }
    
    double calculaGanhoAtual(){
        return (salario * 12);
    }
    
    void mostra(){
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Entrou em: " + this.dataEntrada);
        System.out.println("RG: " + this.RG);
        System.out.println("Salário: " + this.salario);
        System.out.println("Ganha anualmente: " + calculaGanhoAtual());
    }

}