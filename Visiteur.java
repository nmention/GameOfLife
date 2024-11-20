/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue May 02 01:52:29 CEST 2023
*
*/
public abstract class Visiteur {

    protected JeuDeLaVie jeuDeLaVie;

    public Visiteur(JeuDeLaVie jeuDeLaVie) {
        this.jeuDeLaVie = jeuDeLaVie;
    }



    public abstract void visiterCelluleVivante(Cellule cellule);


    public JeuDeLaVie getJeuDeLaVie() {
        return jeuDeLaVie;
    }

    public void setJeuDeLaVie(JeuDeLaVie jeuDeLaVie) {
        this.jeuDeLaVie = jeuDeLaVie;
    }

    public abstract void visiterCelluleMorte(Cellule cellule);
}
