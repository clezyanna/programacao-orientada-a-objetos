class BalancoTrimestral2 {

    public static void main(String[] args) {
        
        int gastosJaneiros = 15000,
            gastosFevereiro = 23000,
            gastosMarco = 17000;
        
        int gastosTrimestre = gastosJaneiros + gastosFevereiro + gastosMarco;
        
        System.out.println(gastosTrimestre);
        
        int mediaMensal = gastosTrimestre/3;
        System.out.println("Valor da média mensal = "+ mediaMensal);

    }

}
