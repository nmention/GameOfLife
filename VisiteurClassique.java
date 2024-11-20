/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue May 02 01:52:53 CEST 2023
*
*/
public class VisiteurClassique extends Visiteur{
    public VisiteurClassique(JeuDeLaVie jeuDeLaVie) {
        super(jeuDeLaVie);
    }

    @Override
    public void visiterCelluleVivante(Cellule cellule) {
        if (cellule.nombreVoisines(jeuDeLaVie) < 2 || cellule.nombreVoisines(jeuDeLaVie) > 3){
            cellule.accepte(this);
        }
    }

    @Override
    public void visiterCelluleMorte(Cellule cellule) {
        if (cellule.nombreVoisines(jeuDeLaVie) == 3){
            cellule.accepte(this);
        }

    }
}
