package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
	private PageMaker() { // インスタンスは作らないのでprivate宣言する
	}

	public static void makeWelcomePage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to " + username + "'s page!");
			writer.paragraph(username + "のページへようこそ。");
			writer.paragraph("メールまっていますね。");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void makeLinkPage(String filename) {

		try {
			Properties mailprop = Database.getProperties("maildata");
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Link page");
			Enumeration<?> list = mailprop.propertyNames();

			while (list.hasMoreElements()) {
				String mailaddr = (String) list.nextElement();
				String username = mailprop.getProperty(mailaddr);
				writer.mailto(mailaddr, username);
			}

			writer.close();
			System.out.println(filename + " is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
