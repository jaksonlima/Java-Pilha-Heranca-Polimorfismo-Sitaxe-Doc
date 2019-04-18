package hello;

import java.sql.SQLException;

import totalcross.phone.Dial;
import totalcross.sql.Connection;
import totalcross.sql.DriverManager;
import totalcross.sql.Statement;
import totalcross.sys.Convert;
import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Control;
import totalcross.ui.Edit;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.Spacer;
import totalcross.ui.Switch;
import totalcross.ui.Toast;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.gfx.Color;
import totalcross.ui.image.Image;
import totalcross.util.Date;
import totalcross.util.InvalidDateException;

/**
 * Simple example to help you create your own app with TotalCross.
 * 
 * If you need more help, reach us at www.totalcross.com
 * 
 * You can find the full explanation of this sample at
 * http://www.totalcross.com/documentation/getting_started.html
 */
public class HelloTC extends MainWindow {

	private Edit edName, edBorn, edPhone;
	private Connection dbcon;

	// fmH is the font size. We will set the components to have twice the size
	// of font.
	private final int COMPONENT_H = fmH * 2;

	private final int FLAT_EDGE_MARGIN = (int) (Math.min(Settings.screenHeight,
			Settings.screenWidth) * 0.20);

	public HelloTC() {
		super("Seja Muito Bem Vindo", NO_BORDER);
		setUIStyle(Settings.MATERIAL_UI);
		Settings.uiAdjustmentsBasedOnFontHeight = true;

		setBackForeColors(Color.getRGB(0,191,255), Color.getRGB(50, 50, 50));
	}

	@Override
	public void initUI() {
		try {
			ImageControl ic = new ImageControl(new Image("hello/JAVA#1.jpg"));
			ic.scaleToFit = ic.centerImage = true;
			add(ic, LEFT, PARENTSIZE + 25, FILL, PARENTSIZE + 20);

			// regular font is not bold
			add(edName = new Edit(), LEFT + FLAT_EDGE_MARGIN, AFTER + 100, FILL
					- FLAT_EDGE_MARGIN, COMPONENT_H);
			edName.caption = "Login";
			edName.captionColor = 0x049CEE;
			
//			add(edName = new Edit(), LEFT + FLAT_EDGE_MARGIN, AFTER + 100, FILL
//					- FLAT_EDGE_MARGIN, COMPONENT_H);
//			edName.caption = "Nome Representante";
//			edName.captionColor = 0x049CEE;

			add(edBorn = new Edit(), SAME, AFTER + FLAT_EDGE_MARGIN, FILL
					- FLAT_EDGE_MARGIN, SAME);
			edBorn.setMode(Edit.DATE);
			edBorn.caption = "Senha";
			edBorn.captionColor = 0x049CEE;
			
//			add(edBorn = new Edit(), SAME, AFTER + FLAT_EDGE_MARGIN, FILL
//					- FLAT_EDGE_MARGIN, SAME);
//			edBorn.setMode(Edit.DATE);
//			edBorn.caption = "Sua idade";
//			edBorn.captionColor = 0x049CEE;

			Button btDial;

			add(btDial = new Button("Seja Muito Bem Vindo"), RIGHT - FLAT_EDGE_MARGIN, AFTER
					+ FLAT_EDGE_MARGIN, PARENTSIZE + 90, SAME);
			btDial.setEnabled(Settings.platform.equals(Settings.ANDROID)
					|| Settings.isWindowsDevice() || Settings.isIOS());
			btDial.addPressListener((event) -> {
				if (edPhone.getTrimmedLength() > 0) {
					try {
						Dial.number(edPhone.getText());
					} catch (Exception ee) {
						MessageBox.showException(ee, true);
					}
				}
			});

//			add(edPhone = new Edit(), LEFT + FLAT_EDGE_MARGIN, SAME, FIT
//					- FLAT_EDGE_MARGIN, SAME);
//
//			edPhone.caption = "Número de telefone";
//			edPhone.captionColor = 0x049CEE;

			Switch s1 = new Switch(true);
			s1.setFont(font.adjustedBy(fmH / 2));
			add(s1, SAME, AFTER + FLAT_EDGE_MARGIN, FILL - FLAT_EDGE_MARGIN,
					SAME);

			s1.textForeOn = "I";
			s1.textForeOff = "O";
			s1.colorBackOn = Color.getRGB(111, 186, 255);
			s1.colorBarOn = Color.getRGB(111, 186, 255);
			s1.colorBallOn = Color.getRGB(47, 155, 255);
			s1.colorForeOn = Color.WHITE;
			s1.colorForeOff = Color.WHITE;

			Spacer sp = new Spacer(0, 0);
			add(sp, CENTER, BOTTOM - 400, PARENTSIZE + 10, COMPONENT_H);

			Button btInsert;
			add(btInsert = new Button("OK"), CENTER, SAME, PARENTSIZE + 90,
					COMPONENT_H, sp);

			// setting colors for buttons...
			btInsert.setBackForeColors(Color.getRGB(111, 186, 255), Color.WHITE);
			btInsert.addPressListener((event) -> {
				try {
					doInsert();
				} catch (Exception ee) {
					MessageBox.showException(ee, true);
				}
			});

			// TODO add button here...
			Button btClear;
			add(btClear = new Button("Limpar"), CENTER, AFTER, SAME, SAME);

			btClear.setBackForeColors(Color.getRGB(233, 154, 255), Color.WHITE);
			btClear.addPressListener((e) -> {
				clear();
				showToast("Todos os campos estão limpos");
			});

			if (Settings.onJavaSE || Settings.platform.equals(Settings.WIN32))
				add(new Label("Press F11 to open keypad"), CENTER, BOTTOM);

			dbcon = DriverManager.getConnection("jdbc:sqlite:"
					+ Convert.appendPath(Settings.appPath, "test.db"));
			Statement st = dbcon.createStatement();
			st.execute("create table if not exists person (name varchar, born datetime, number varchar)");
			st.close();
		} catch (Exception e) {
			MessageBox.showException(e, true);
			exit(0);
		}
	}

	private void doInsert() throws SQLException, InvalidDateException {
		if (edName.getLength() == 0 || edBorn.getLength() == 0
				|| edPhone.getLength() == 0)
			showToast("Por favor preencha todos os campos");
		else {
			// simple example of how you can insert data into SQLite..
			String SeuNome = edName.getText();
			Date born = new Date(edBorn.getText());
			String phone = edPhone.getText();

			Statement st = dbcon.createStatement();
			st.executeUpdate("insert into person values('" + SeuNome + "','"
					+ born.getSQLString() + "','" + phone + "')");
			st.close();
			clear();
			showToast("Data inserted successfully!");
		}
	}

	public void showToast(String message) {
		// fmh is the font size. Let's set the toast size to 3 times font size
		Toast.height = fmH * 3;
		// You can control position of toast too
		Toast.posY = (int) (Control.BOTTOM - 600);

		Toast.show(message, 2000);
	}
}
