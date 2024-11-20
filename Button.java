import javax.swing.*;

public class Button extends JButton {
    private boolean pause;

    private Window win;
    private boolean avancement;

    public Window getWin() {
        return win;
    }

    public boolean isPause() {
        return pause;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }

    public boolean isAvancement() {
        return avancement;
    }

    public void setAvancement(boolean avancement) {
        this.avancement = avancement;
    }

    public Button(String text, boolean pause, boolean avancement, Window win) {
        super(text);
        this.win = win;
        this.pause = pause;
        this.avancement = avancement;
    }



}
