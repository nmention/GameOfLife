/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue May 02 01:54:06 CEST 2023
*
*/
public class JeuDeLaVieConsoleInfo implements Observateur{
    private JeuDeLaVie jeu;

    private int nbGen;


    public JeuDeLaVieConsoleInfo(JeuDeLaVie jeu) {
        this.jeu = jeu;
        nbGen = 0;
    }




    @Override
    public void actualise() {
        System.out.println(this);
        nbGen ++;

    }


    public int compteNbCellulesViv(){
        int cpt = 0;
        for (int i = 0; i < jeu.getXMax(); i++) {
            for (int j = 0; j < jeu.getYMax() ; j++) {
                if (jeu.getGrille()[i][j].estVivante()){
                    cpt ++;
                }
            }
        }
        return cpt;
    }




    @Override
    public String toString() {
        return "----------\nGeneration n " + nbGen + "\n Cellules vivantes : " + compteNbCellulesViv();
    }
}
