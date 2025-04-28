package one.digitalinovation;

import one.digitalinovation.model.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaarvore = new ArvoreBinaria<>();
        minhaarvore.inserir(new Obj(13));
        minhaarvore.inserir(new Obj(10));
        minhaarvore.inserir(new Obj(25));
        minhaarvore.inserir(new Obj(2));
        minhaarvore.inserir(new Obj(12));
        minhaarvore.inserir(new Obj(20));
        minhaarvore.inserir(new Obj(31));
        minhaarvore.inserir(new Obj(29));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
    }
}
