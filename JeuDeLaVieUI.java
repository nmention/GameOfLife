/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Apr 13 11:49:22 CEST 2023
*
*/
import javax.swing.*;
import java.awt.*;

public class JeuDeLaVieUI extends JPanel implements Observateur {

    private JeuDeLaVie jeu;

    public void actualise(){
        System.out.println("Actualisation");
        repaint();
    }




    public JeuDeLaVieUI(JeuDeLaVie jeu) {
        this.jeu = jeu;
        setView();

    }


    public void setView(){

    }

    public void paint(Graphics g){
        super.paint(g);


        for (int x = 0; x < jeu.getXMax(); x ++){
            for (int y = 0; y < jeu.getYMax(); y ++){
                if (jeu.getGrilleXY(x,y).estVivante()){
                    g.fillOval(y *3, x * 3, 3, 3);
                }
            }
        }

    }




}