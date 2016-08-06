import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
//import org.openqa.selenium.chrome.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Firefox_Tinchi {
	static WebDriver web = new FirefoxDriver();

	static String username_id = "Login1_UserName";
	static String password_id = "Login1_Password";
	static String submit_id = "Login1_LoginButton";
	// static String signup_topbar_id = "DangKy";
	static String signup_button_id = "cmdDangKyLop1";
	static String server_error = "Server Error";

	public static void main(String[] args) throws IOException, FileNotFoundException {
		System.out.println("Class started.");

		String username, password;

		File file = new File("input.txt");
		List<String> courseList = new ArrayList<String>();
		String temp;
		BufferedReader f = new BufferedReader(new FileReader(file));
		f.readLine(); username = f.readLine();
		System.out.println("Username: " + username);
		f.readLine(); password = f.readLine();
		System.out.println("Password: " + "[REDACTED]");
		System.out.println("Course list:");
		f.readLine(); while ((temp = f.readLine()) != null) {
			courseList.add(temp);
			System.out.println("- " + temp);
		}
		int no_of_classes = courseList.size();
		String[][] classes = new String[2][no_of_classes];
		for (int i = 0; i < no_of_classes; ++i) {
			classes[1][i] = courseList.get(i);
			classes[0][i] = courseList.get(i).split("-")[0];
		}

		web.get("http://daotao.hnue.edu.vn/");

		WebElement button;
		WebElement checkbox;

		button = web.findElement(By.id("Header1_LoginPanel2_lnkLogin"));
		button.click();

		// Log in
		System.out.println("Logging in using given credential...");
		web.findElement(By.id(username_id)).sendKeys(username);
		web.findElement(By.id(password_id)).sendKeys(password);
		web.findElement(By.id(submit_id)).click();

		String query;

		while (true) {
			// enter the signup section
			web.get("http://daotao.hnue.edu.vn/wfrmDangKyLopTinChiB1.aspx?Chuyen_nganh=1");
			// web.findElement(By.id(signup_topbar_id)).click();

			// if (web.findElement(By.tagName("body")).getText().contains(server_error))
			// 		System.out.println("WHAT THE FUCK");

			try {
				// checkbox part
				System.out.println("Entering class selection...");
				for (int i = 0; i < no_of_classes; i++) {
					query = "//tr[td[2][text()='" + classes[0][i] + "']]//input[@type='checkbox']";
					// System.out.println("Finding by xpath: " + query);
					checkbox = web.findElement(By.xpath(query));
					System.out.println("Found " + classes[0][i] + "!");
					if (!checkbox.isSelected()) checkbox.click();
				}
				// confirm
				web.findElement(By.id(signup_button_id)).click();

				// radiobox part
				System.out.println("Entering section selection...");
				for (int i = 0; i < no_of_classes; i++) {
					query = "//tr[td[4][text()='" + classes[1][i] + "']]//input[@type='radio']";
					// System.out.println("Finding by xpath: " + query);
					checkbox = web.findElement(By.xpath(query));
					System.out.println("Found " + classes[1][i] + "!");
					checkbox.click();
				}
				// confirm
				web.findElement(By.id(signup_button_id)).click();

				if (!(web.findElement(By.tagName("body")).getText().contains(server_error))) {
					System.out.println("All done! Quitting...");
					break;
				}

			} catch (Exception e) {
				System.out.println("-- An error happened, retrying...");
				// System.out.print("An error happened: ");
				// System.out.println(e);
			}
		}
	}
}
