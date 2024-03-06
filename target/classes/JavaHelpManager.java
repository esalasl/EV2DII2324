package doc;

import java.net.MalformedURLException;
import java.net.URL;

import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;

public class JavaHelpManager {
	
	private HelpSet helpset;
	private HelpBroker helpBroker;
	
	public JavaHelpManager(String filename) throws MalformedURLException, HelpSetException {
		URL test = HelpSet.findHelpSet(getClass().getClassLoader(), filename);
		helpset = new HelpSet(getClass().getClassLoader(), test);
		helpBroker = helpset.createHelpBroker();
	}
}
