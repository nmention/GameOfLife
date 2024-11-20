/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Apr 13 09:10:21 CEST 2023
*
*/

public class Cellule implements CelluleEtat {
    private CelluleEtat etat;
    private int x;
    private int y;



    public Cellule(int x, int y, CelluleEtat ce){
        this.x = x;
        this.y = y;
        etat = ce;
    }





    public CelluleEtat vit(){
        etat = etat.vit();
        return etat;
    }

    public CelluleEtat meurt(){
        etat = etat.meurt();
        return etat;
    }


    public boolean estVivante(){
        return etat.estVivante();
    }

    @Override
    public void accepte(Visiteur visiteur, Cellule cellule) {

    }


    public int nombreVoisines(JeuDeLaVie jeu){
        int cpt = 0;
        for (Direction d : Direction.values()){
            if (jeu.possibleCoord(x + d.getX(), y + d.getY())){
                if (jeu.getGrille()[x + d.getX()][y + d.getY()].estVivante()){
                    cpt ++;
                }
            }
        }
        return cpt;

    }


    public String toString(){
        if (estVivante()){
            return "O";
        }
        return "X";
    }


    public void accepte(Visiteur visiteur){
        etat.accepte(visiteur,this);
    }


}
