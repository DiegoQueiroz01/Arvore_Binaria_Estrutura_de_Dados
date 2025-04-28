package one.digitalinovation;

public class binNo <T extends Comparable<T>>{
    private T conteudo;
    private binNo<T> noEsquerdo;
    private binNo<T> noDireito;

    public binNo(T conteudo){
        this.conteudo = conteudo;
        noEsquerdo = noDireito = null;
    }
    public binNo<T> getNoEsquerdo(){
        return noEsquerdo;
    }
    public void setNoEsquerdo(binNo<T> noEsquerdo){
        this.noEsquerdo = noEsquerdo;
    }
    public binNo<T> getNoDireito(){
        return noDireito;
    }
    public void setNoDireito (binNo<T> noDireito){
        this.noDireito = noDireito;
    }
    public T getConteudo(){
        return conteudo;
    }
    @Override
    public String toString(){
        return "binNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
