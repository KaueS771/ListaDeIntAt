public class ListaDeInteiros{

    private int dados[];
    private int tamanho;

    public ListaDeInteiros(int capMax){
        dados = new int[capMax];
        // o java pré inicializa os atributos do tipo inteiro
        // com o valor 0 (zero), do tipo real com o valor 0.0()
        // valor 0.0(zero ponto zero) e  atributos com tipo
        // abstrato de dados são inicializados com null 
        //Portanto tamanho recebeu o valor 0(zero)

        if(dados.length != tamanho){
            dados[tamanho]=53;
            tamanho = tamanho +1;
        }else{
            System.out.println("Erro! Lista Cheia");
        }
    }

    public void adicionaFinal(int e)throws Exception{
        if(dados.length != tamanho){
            dados[tamanho]=e;
            tamanho = tamanho +1;
        }else{
            throw new Exception("Erro! Lista Cheia");
        }

    }
    public String toString(){
        String s = "Elemento:" ;
        for(int i = 0; i<tamanho;i++ ){
            s = s + " " + dados[i];
        }
        s = s + "\nTamanho: " + tamanho;
        return s;
    }

    public int removeFinal () throws Exception{
        //não está vazia 
        if(tamanho != 0){
            tamanho = tamanho -1;
            return dados[tamanho];
        }else{
            //sim está vazia
            throw new Exception("Eroo!, lista Cheia");
        }
    }
}
