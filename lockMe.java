/**
 * 
 */
package project1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ganesh
 *
 */
public class lockMe {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("Application Nmae:LOCKME.COM");
		System.out.println("Developer Detail:Meena Mudaliar");
		show();
		int c = sc.nextInt();
		if(c>=4)
			System.out.println("Invalid input");

		String dir = "C:\\Users\\Ganesh\\myproject\\";
		String[] flist;
		try {
			while (true)
				switch (c) {

				case 1:

					File files = new File(dir);
					File[] fil = files.listFiles();
					Arrays.sort(fil);
					for (File f : fil) {
						System.out.println("File : " + f.getName());
					}
					main(null);

					break;
				case 2:
					lockMe.extracted();
					int k = sc.nextInt();
					if(k>=5)
						System.out.println("Invalid input");

					if (k == 1) {

						String n;
						System.out.println("Enter the file name:");
						n = sc.next();
						File file = new File(dir, n);

						// initialize File object and passing path as argument

						boolean result;
						try {

							result = file.createNewFile();
							// creates a new file
							// test if successfully created a new file
							if (result) {
								System.out.println("file created suceessfully"); // returns the path string
							}
						}

						catch (IOException e) {
							System.out.println("File already exist at location: " + file.getCanonicalPath());// prints
																												// exception
																												// if
																												// any
						}

					}

					else if (k == 2) {
						String d;
						System.out.println("Enter the file name to delete:");
						d = sc.next();
						File folder = new File(dir);
						File dfile = new File(dir, d);
						String[] delfile = folder.list();
						int flag = 0;
						try {
							for (int j = 0; j < delfile.length; j++) {
								String df = delfile[j];
								if (df.equals(d)) {
									dfile.delete();
									System.out.println("Deleted Successfully");
									flag = 1;
								}
							}
							if (flag == 0) {
								System.out.println("There is no file to delete");
							}
						} catch (Exception e) {
							System.out.println("file not found");
						}

					} else if (k == 3) {
						String search;
						System.out.println("Enter the file name to search:");
						search = sc.next();
						File file = new File(dir);
						flist = file.list(); // initialize File object and passing path as argument
						int flag = 0;

						try {
							for (int i = 0; i < flist.length; i++) {
								String filename = flist[i];
								if (filename.equals(search)) {
									System.out.println("File Found");
									flag = 1;
								}

							}
							if (flag == 0) {
								System.out.println("File not found");

							}

						} catch (Exception e) {
							System.out.println("Empty directory");
						}

					} else if (k == 4) {
						main(null);
					}

					break;

				case 3:
					System.exit(0);
					break;
				

				}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
	}

	/**
	 * 
	 */
	public static void show() {

		System.out.println("1. All Files");
		System.out.println("2. File Operations");
		System.out.println("3. close");

	}

	/**
	 * @return
	 */
	public static void extracted() {
		System.out.println("1.Add File");
		System.out.println("2.Delete File");
		System.out.println("3.Search File");
		System.out.println("4.Back to main");

	}

}
