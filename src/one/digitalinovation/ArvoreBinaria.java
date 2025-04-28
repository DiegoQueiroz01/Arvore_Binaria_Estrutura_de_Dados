package one.digitalinovation;

public class ArvoreBinaria<T extends Comparable<T>> {
    private binNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        binNo<T> novoNo = new binNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    public binNo<T> inserir(binNo<T> atual, binNo<T> novoNo){
        if(atual == null){
            return novoNo;
        }
        else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsquerdo(inserir(atual.getNoEsquerdo(), novoNo));
        }
        else{
            atual.setNoDireito(inserir(atual.getNoDireito(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(binNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsquerdo());
            System.out.println(atual.getConteudo() + ",");
            exibirInOrdem(atual.getNoDireito());
        }
    }
    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }
    private void exibirPreOrdem(binNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoEsquerdo());
            exibirPreOrdem(atual.getNoDireito());
        }
    }
    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }
    private void exibirPosOrdem(binNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsquerdo());
            exibirPosOrdem(atual.getNoDireito());
            System.out.println(atual.getConteudo() + ",");
        }
    }
}
