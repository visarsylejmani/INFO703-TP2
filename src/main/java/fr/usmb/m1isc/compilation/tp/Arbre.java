package fr.usmb.m1isc.compilation.tp;

public class Arbre {
    public enum NoeudType{SEQUENCE,EXPRESSION,EXPR, VAR, INT, OUTPUT, INPUT, NIL}
    public NoeudType type;
    public String valeur;
    public Arbre gauche,droite;

    public Arbre(NoeudType type,String valeur){
            this.type=type;
            this.valeur=valeur;
            this.gauche=null;
            this.droite=null;

    }
    public Arbre(NoeudType type,String valeur,Arbre gauche, Arbre droite){
        this.type=type;
        this.valeur=valeur;
        this.gauche=gauche;
        this.droite=droite;


    }
    @Override
    public String toString() {
        String str="";
        if (!(this.gauche==null && this.droite==null))
            str = "(";

        str=str.concat(this.valeur);

        if (this.gauche != null) {
            str=str.concat(" "+this.gauche.toString()+" ");
        }
        if (this.droite != null) {
            str=str.concat(" "+this.droite.toString()+" ");
        }
        if (!(this.gauche==null && this.droite==null))
            str=str.concat(")");
        
        return str;
    }
}