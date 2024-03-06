package report;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

public class Report {

	public void generateReport() throws JRException {
		ClassLoader classLoader = getClass().getClassLoader();
		JasperReport report = (JasperReport) JRLoader.loadObject(new File(classLoader.getResource("billreport.jasper").getFile()));
		JRBeanCollectionDataSource coleccion = new JRBeanCollectionDataSource(new ArrayList<>());
		Map<String, Object> parameters = new HashMap<>();
		JasperPrint jasperPrint = JasperFillManager.fillReport(report, parameters, coleccion);
		JasperExportManager.exportReportToPdfFile(jasperPrint, "report.pdf");
	}
}
