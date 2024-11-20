/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue May 02 01:53:18 CEST 2023
*
*/
public class VisiteurHighLife extends Visiteur{
    public VisiteurHighLife(JeuDeLaVie jeuDeLaVie) {
        super(jeuDeLaVie);
    }

    @Override
    public void visiterCelluleVivante(Cellule cellule) {
        if (cellule.nombreVoisines(jeuDeLaVie) > 3 || cellule.nombreVoisines(jeuDeLaVie) < 2){
            cellule.accepte(this);
        }
    }

    @Override
    public void visiterCelluleMorte(Cellule cellule) {
        if (cellule.nombreVoisines(jeuDeLaVie) == 3 || cellule.nombreVoisines(jeuDeLaVie) == 6){
            cellule.accepte(this);
        }
    }
}