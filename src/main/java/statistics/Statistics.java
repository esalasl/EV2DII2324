package statistics;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Statistics {

	public ChartPanel generateChart() {
		DefaultPieDataset dataset = new DefaultPieDataset();
		JFreeChart jfreeChart = ChartFactory.createPieChart("", dataset);
		return new ChartPanel(jfreeChart);
	}

}
