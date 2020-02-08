package myGUI;
import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TableItem;

public class HelloWorldSWT {
	private static ResourceBundle resourceBundle = ResourceBundle.getBundle("examples_layout");
	private TabFolder tabFolder;
	
	public HelloWorldSWT(Composite parent) {
		tabFolder = new TabFolder (parent, SWT.NONE);
		Tab [] tabs = new Tab [] {
			new FillLayoutTab (this),
			new GridLayoutTab (this),
		};
		for (int i=0; i<tabs.length; i++) {
			TabItem item = new TabItem (tabFolder, SWT.NONE);
		    item.setText (tabs [i].getTabText ());
		    item.setControl (tabs [i].createTabFolderPage (tabFolder));
		}
	}
	
	/**
	 * Grabs input focus.
	 */
	public void setFocus() {
		tabFolder.setFocus();
	}
	
	/**
	 * Disposes of all resources associated with a particular
	 * instance of the LayoutExample.
	 */	
	public void dispose() {
		tabFolder = null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		new HelloWorldSWT(shell);
		shell.setText("Hello world!");
		shell.open();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}
	
	/**
	 * Gets a string from the resource bundle.
	 * We don't want to crash because of a missing String.
	 * Returns the key if not found.
	 */
	static String getResourceString(String key) {
		try {
			return resourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return key;
		} catch (NullPointerException e) {
			return "!" + key + "!";
		}			
	}

	/**
	 * Gets a string from the resource bundle and binds it
	 * with the given arguments. If the key is not found,
	 * return the key.
	 */
	static String getResourceString(String key, Object[] args) {
		try {
			return MessageFormat.format(getResourceString(key), args);
		} catch (MissingResourceException e) {
			return key;
		} catch (NullPointerException e) {
			return "!" + key + "!";
		}
	}
}
