package one.digitalinovation.model;

public abstract class ObjArvore<T> implements Comparable<T> {
    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int comparaTo(T outro);
    public abstract String toString();
}
