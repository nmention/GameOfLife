/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Apr 13 09:09:09 CEST 2023
*
*/
public class CelluleEtatMort implements CelluleEtat {

    public static CelluleEtat etatMort = null;

    private CelluleEtatMort(){

    }


    public static CelluleEtat creerCelluleEtat(){
        if (etatMort == null){
            etatMort = new CelluleEtatMort();
        }
        return etatMort;
    }



    public CelluleEtat vit(){
        return CelluleEtatVivant.creerCelluleEtat();
    }

    public CelluleEtat meurt(){
        return this;
    }

    public boolean estVivante(){
        return false;
    }

    @Override
    public void accepte(Visiteur visiteur, Cellule cellule) {
        visiteur.getJeuDeLaVie().ajouteCommande(new CommandeVit(cellule));
    }


}