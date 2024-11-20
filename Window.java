/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue May 02 15:21:17 CEST 2023
*
*/
import javax.swing.*;
import java.awt.*;

public class Window {


    private JFrame jFrame;
    private JeuDeLaVie jeu;
    private JeuDeLaVieUI jeuDeLaVieUI;
    private Observateur jeuDeLaVieConsoleInfo;

    private ClickListener clickListener;


    private Button b1;

    private Button b2;

    private JPanel mainPan;

    private JPanel panel;





    public Window() {

        mainPan = new JPanel();
        clickListener = new ClickListener();
        jeu = new JeuDeLaVie();
        jeu.initialiseGrille();
        jeuDeLaVieUI = new JeuDeLaVieUI(jeu);
        jeuDeLaVieConsoleInfo = new JeuDeLaVieConsoleInfo(jeu);
        jeu.attacheObservateur(jeuDeLaVieConsoleInfo);
        jeu.attacheObservateur(jeuDeLaVieUI);
        jFrame = new JFrame();



        panel = new JPanel();

        setView();
        setListeners();

    }

    public void setView() {
        b1 = new Button("Pause",true,false,this);
        b2 = new Button("Gen Suivante",false, true,this);
        mainPan.setLayout(new BoxLayout(mainPan,BoxLayout.PAGE_AXIS));
        jeuDeLaVieUI.setPreferredSize(new Dimension(60,75));

        panel.add(b1);
        panel.add(b2);
        mainPan.add(panel);

        //jFrame.getContentPane().add(jeuDeLaVieUI);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(200, 250);
        jFrame.setLocationRelativeTo(null);
        mainPan.add(jeuDeLaVieUI);
        mainPan.add(panel);
        jFrame.setContentPane(mainPan);
        //jFrame.pack();
        jFrame.setVisible(true);
    }

    public void setListeners(){
        b1.addMouseListener(clickListener);
        b2.addMouseListener(clickListener);
    }

    public void run() {
        jeu.setStart(true);
        while (jeu.getStart()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            jeu.calculerGenerationSuivante();
        }
    }

    public JeuDeLaVie getJeu() {
        return jeu;
    }

    public void interrupt() {

        jeu.setStart(!jeu.getStart());
        System.out.println(jeu.getStart());
        if (jeu.getStart()){
            this.run();
        }
    }


}



        
        

        
        


