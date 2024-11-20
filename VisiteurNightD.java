/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue May 02 01:53:05 CEST 2023
*
*/
public class VisiteurNightD extends Visiteur{
    public VisiteurNightD(JeuDeLaVie jeuDeLaVie) {
        super(jeuDeLaVie);
    }

    @Override
    public void visiterCelluleVivante(Cellule cellule) {
        if (cellule.nombreVoisines(jeuDeLaVie) != 3 || cellule.nombreVoisines(jeuDeLaVie) != 4 || cellule.nombreVoisines(jeuDeLaVie)  !=6 || cellule.nombreVoisines(jeuDeLaVie) !=7 || cellule.nombreVoisines(jeuDeLaVie) !=8){
            cellule.accepte(this);
        }
    }

    @Override
    public void visiterCelluleMorte(Cellule cellule) {
        if (cellule.nombreVoisines(jeuDeLaVie) == 3 || cellule.nombreVoisines(jeuDeLaVie) == 6 ||cellule.nombreVoisines(jeuDeLaVie) == 7 || cellule.nombreVoisines(jeuDeLaVie) == 8 ){
            cellule.accepte(this);
        }
    }
}
