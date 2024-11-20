/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue May 02 01:53:29 CEST 2023
*
*/
public abstract class Commande {

    protected Cellule cellule;

    public Commande(Cellule cellule) {
        this.cellule = cellule;
    }

    public abstract void executer();

}
