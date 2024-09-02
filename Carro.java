public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void exibirInfo(){
        System.out.println(
            ", Marca: " + marca + 
            ", Modelo: " + modelo +
            ", Ano: " + ano
        );
    }

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }

    public void setMarca(String marcaNovo){
        this.marca = marcaNovo;
    }
    public void setModelo(String modeloNovo){
        this.modelo = modeloNovo;
    }
    public void setAno(int anoNovo){
        this.ano = anoNovo;
    }

}
