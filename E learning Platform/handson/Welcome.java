package handson;
import java.awt.EventQueue;

public class Welcome {
	public Welcome(){
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dem window = new dem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
