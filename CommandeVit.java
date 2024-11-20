/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue May 02 01:53:38 CEST 2023
*
*/
public class CommandeVit extends Commande{
    public CommandeVit(Cellule cellule) {
        super(cellule);
    }

    @Override
    public void executer() {
        this.cellule.vit();
    }
}