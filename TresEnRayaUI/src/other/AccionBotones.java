package other;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionBotones implements ActionListener {
Main main;
public AccionBotones(Main main){
	this.main=main;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		main.textMensajes.setText(String.valueOf(main.btn01.getName()));

	}

}
