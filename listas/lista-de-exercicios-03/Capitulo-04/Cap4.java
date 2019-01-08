class Cap4{
    //Resolução da 1,2,3,4,5
public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        f1.nome = "Programadora Clezyanna";
        f1.departamento = "TI";
        f1.dataEntrada = "07/01/2019";
        f1.RG = "123456789-0";
        f1.salario = 2000;
        f1.mostra();
        
        System.out.println("\n o funcionário obteve bonificação de mil reais.");
        System.out.println("Os novos dados, após o aumento, são:\n");
        f1.bonifica(1000);
        f1.mostra();
        
        
        f2.nome = "Programador Java";
        f2.departamento = "TI";
        f2.dataEntrada = "21/12/2012";
        f2.RG = "123456789-0";
        f2.salario = 2000;
        f2.bonifica(1000);
        
        if(f1 == f2){
            System.out.println("\nFuncionários 1 e 2 sao iguais");
        } else {
            System.out.println("\nFuncionários 1 e 2 sao diferentes");
        }
        
        Funcionario f3 = f1;
        if(f1 == f3){
            System.out.println("Funcionarios 1 e 3 são iguais");
        } else {
            System.out.println("Funcionarios 1 e 3 são diferentes");
        }
        
    }
}
