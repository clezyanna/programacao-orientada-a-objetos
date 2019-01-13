class Testa{

    public static void main(String[] args) {
        Empresa JP = new Empresa("Clezy Serv", "12345");
        
        for (int i = 0; i < 10; i++) {
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            f.numero = i+1;
            JP.adiciona(f);
        }
        System.out.println("MostrandoEmpregados:");
        JP.mostraEmpregados();
        
        System.out.println("\nUsando o método 'mostra', de cada funcionário:");
        for(int i=0 ; i < JP.empregados.length ; i++){
            JP.empregados[i].mostra();
        }
        
        Funcionario f7 = new Funcionario();
        Funcionario f11 = new Funcionario();
        f7.numero = 7;
        f11.numero = 11;
        System.out.println("\nContém o funcionario 7? : " + JP.contem(f7));
        System.out.println("Contém o funcionario 11? : " + JP.contem(f11));
        
        //Criando um array de 11 elementos
        Funcionario[] empregados2 = new Funcionario[11];
        
        //Copiando os elementos dos array anterior para o novo array
        for(int i=0 ; i < JP.empregados.length ; i++){
            empregados2[i] = JP.empregados[i];
        }
        
        //Adicionando o empregado 11
        empregados2[10] = f11;

        //checando de novo
        System.out.println("\nContém o funcionario 11? : " + JP.contem(f11));
        
        //Mostrando os empregados
        System.out.println("\nUsando o método 'mostra', de cada funcionário:");
        for(int i=0 ; i < empregados2.length ; i++){
            empregados2[i].mostra();
        }
        

        
    }

}
