/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Thu Apr 13 11:47:11 CEST 2023
*
*/
public interface Observable {
	public void attacheObservateur(Observateur o);

	public void detacheObservateur(Observateur o);


	public void notifieObservateurs();
	
}