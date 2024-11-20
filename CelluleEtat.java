/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Apr 13 09:05:31 CEST 2023
*
*/
public interface CelluleEtat {
    public CelluleEtat vit();

    public CelluleEtat meurt();

    public boolean estVivante();


    public void accepte(Visiteur visiteur, Cellule cellule);

}