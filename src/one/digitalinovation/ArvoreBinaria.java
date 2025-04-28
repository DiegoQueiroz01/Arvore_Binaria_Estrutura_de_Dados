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
        System.out.print("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(binNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsquerdo());
            System.out.print(atual.getConteudo() + ",");
            exibirInOrdem(atual.getNoDireito());
        }
    }
    public void exibirPreOrdem(){
        System.out.print("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }
    private void exibirPreOrdem(binNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoEsquerdo());
            exibirPreOrdem(atual.getNoDireito());
        }
    }
    public void exibirPosOrdem(){
        System.out.print("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }
    private void exibirPosOrdem(binNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsquerdo());
            exibirPosOrdem(atual.getNoDireito());
            System.out.print(atual.getConteudo() + ",");
        }
    }

    public void remover(T conteudo){
        try{
            binNo<T> atual = this.raiz;
            binNo<T> pai = null;
            binNo<T> filho = null;
            binNo<T> temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsquerdo();
                }
                else{
                    atual = atual.getNoDireito();
                }
            }
            if(atual == null){
                System.out.println("Conteúdo não encontrado. Bloco try.");
            }
            if(pai == null){
                if(atual.getNoDireito() == null){
                    this.raiz = atual.getNoEsquerdo();
                }
                else if(atual.getNoEsquerdo() == null){
                    this.raiz = atual.getNoDireito();
                }
                else{
                    for(temp = atual, filho = atual.getNoEsquerdo();
                    filho.getNoDireito() != null;
                    temp = filho, filho = filho.getNoEsquerdo()
                    ){
                        if(filho != atual.getNoEsquerdo()){
                            temp.setNoDireito(filho.getNoEsquerdo());
                            filho.setNoEsquerdo(raiz.getNoEsquerdo());
                        }
                    }
                    filho.setNoDireito(raiz.getNoDireito());
                    raiz = filho;
                }
            }
            else if(atual.getNoDireito() == null){
                if(pai.getNoEsquerdo() == atual){
                    pai.setNoEsquerdo(atual.getNoEsquerdo());
                }
                else{
                    pai.setNoDireito(atual.getNoEsquerdo());
                }
            }
            else if (atual.getNoEsquerdo() == null){
                if(pai.getNoEsquerdo() == atual){
                    pai.setNoEsquerdo(atual.getNoDireito());
                }
                else{
                    pai.setNoDireito(atual.getNoDireito());
                }
            }
            else{
                for(
                    temp = atual, filho = atual.getNoEsquerdo();
                    filho.getNoDireito() != null;
                    temp = filho, filho = filho.getNoDireito()
                ){
                    if(filho != atual.getNoEsquerdo()){
                        temp.setNoDireito(filho.getNoEsquerdo());
                        filho.setNoEsquerdo(atual.getNoEsquerdo());
                    }
                    filho.setNoDireito(atual.getNoDireito());
                    if(pai.getNoEsquerdo() == atual){
                        pai.setNoEsquerdo(filho);
                    }
                    else{
                        pai.setNoDireito(filho);
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.print("Conteúdo não encontrado. Bloco catch.");
        }
    }
}
