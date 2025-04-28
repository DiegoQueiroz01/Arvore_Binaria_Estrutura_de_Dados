package one.digitalinovation.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
    Integer meuValor;
    
    public Obj(Integer meuValor){
        this.meuValor = meuValor;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    public int hashCode() {
        return Objects.hash(meuValor);
    }

    public int comparaTo(Obj outro) {
        int i = 0;
        if(this.meuValor < outro.meuValor){
            i = 1;
        }
        else if(this.meuValor > outro.meuValor){
            i = -1;
        }
        return i;
    }

    public String toString() {
        return meuValor.toString();
    }
}
