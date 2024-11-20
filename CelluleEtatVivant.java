/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Apr 13 09:07:06 CEST 2023
*
*/
public class CelluleEtatVivant implements CelluleEtat {
    public static CelluleEtat etatVivant = null;

    private CelluleEtatVivant(){

    }


    public static CelluleEtat creerCelluleEtat(){
        if (etatVivant == null){
            etatVivant = new CelluleEtatVivant();
        }
        return etatVivant;
    }

    public CelluleEtat vit(){
        return this;

    }

    public CelluleEtat meurt(){
        return CelluleEtatMort.creerCelluleEtat();
    }

    public boolean estVivante(){
        return true;

    }

    @Override
    public void accepte(Visiteur visiteur, Cellule cellule) {
        visiteur.getJeuDeLaVie().ajouteCommande(new CommandeMeurt(cellule));
    }


}