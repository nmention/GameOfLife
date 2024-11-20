

public class VisiteurLife34 extends Visiteur{
    public VisiteurLife34(JeuDeLaVie jeuDeLaVie) {
        super(jeuDeLaVie);
    }

    @Override
    public void visiterCelluleVivante(Cellule cellule) {
        if (cellule.nombreVoisines(jeuDeLaVie) != 3 || cellule.nombreVoisines(jeuDeLaVie) != 4){
            cellule.accepte(this);
        }
    }

    @Override
    public void visiterCelluleMorte(Cellule cellule) {
        if (cellule.nombreVoisines(jeuDeLaVie) == 3 || cellule.nombreVoisines(jeuDeLaVie) == 4){
            cellule.accepte(this);
        }

    }
}
