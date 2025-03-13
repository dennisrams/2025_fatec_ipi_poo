class LivroDeNotas{

    private String nomeDaDisciplina = null;


    //construtor padrão (lista de paramentros void)
    public LivroDeNotas(String nomeDaDisciplina){
        setNomeDaDisciplina(nomeDaDisciplina);
    };

    //setter

    public void setNomeDaDisciplina(String n){
        if(n.lenght() >= 3){
            nomeDaDisciplina = n;
        }
        
    }

    //getter

    public String getNomeDaDisciplina(){
        return nomeDaDisciplina;
    };


    public void exibirMensagem(){
        System.out.println(
            "Bem-vindo ao livro de notas de " + nomeDaDisciplina
        );
    }

}