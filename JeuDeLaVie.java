/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Apr 13 09:19:17 CEST 2023
*
*/
import java.util.ArrayList;
import java.util.List;

public class JeuDeLaVie implements Observable {
    private Cellule[][] grille;
    private int xMax;
    private int yMax;
    private Boolean start;

    List<Observateur> observateurs;

    List<Commande> commandes;


    private Visiteur visiteur;


    public Boolean getStart() {
        return start;
    }

    public void setStart(Boolean start) {
        this.start = start;
    }

    public JeuDeLaVie(){
        start = false;
        xMax = 50;
        yMax = 50;
        grille = new Cellule[xMax][yMax];
        observateurs = new ArrayList<>();
        commandes = new ArrayList<>();
        visiteur = new VisiteurClassique(this);

    }


    public void initialiseGrille(){
        for (int i = 0; i < xMax; i++){
            for (int j = 0; j < yMax; j++){


                double tirage = Math.random();

                CelluleEtat ce = null;
                if (tirage < 0.5){
                    ce = CelluleEtatMort.creerCelluleEtat();
                }
                else {
                    ce = CelluleEtatVivant.creerCelluleEtat();
                }
                grille[i][j] = new Cellule(i,j,ce);
            }
        }
    }





    public String toString(){
        String toBeDisplayed = "";
        for (int i = 0; i < xMax; i++){
            toBeDisplayed += "[";
            for (int j = 0; j < yMax; j++){
                toBeDisplayed += grille[i][j].toString();

            }
            toBeDisplayed += "]\n";
        }
        return toBeDisplayed;
    }

    public boolean possibleCoord(int x, int y){
        if ((x < 0) || (x >= xMax) || (y < 0) || (y >= yMax)){
            return false;
        }
        return true;
    }

    public Cellule[][] getGrille(){
        return grille;
    }

    public int getXMax(){
        return xMax;
    }

    public int getYMax(){
        return yMax;
    }

    public Cellule getGrilleXY(int x, int y){
        if (possibleCoord(x,y)){
            return grille[x][y];
        }
        return null;
    }

    public void ajouteCommande(Commande c){
        commandes.add(c);
    }

    public void executeCommandes(){
        for (Commande c: commandes){
            c.executer();
        }
        commandes.clear();
    }

    @Override
    public void attacheObservateur(Observateur o) {
        observateurs.add(o);
    }

    @Override
    public void detacheObservateur(Observateur o) {
        observateurs.remove(o);
    }

    @Override
    public void notifieObservateurs() {
        for (Observateur o: observateurs) {
            o.actualise();
        }
    }


    public void distribueVisiteur(){
        for (int i = 0; i < xMax ; i++) {
            for (int j = 0; j < yMax ; j++) {
                if (grille[i][j].estVivante()){
                    visiteur.visiterCelluleVivante(grille[i][j]);
                }
                else {
                    visiteur.visiterCelluleMorte(grille[i][j]);
                }
            }
        }
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public void calculerGenerationSuivante(){
        distribueVisiteur();
        executeCommandes();
        notifieObservateurs();

    }

}