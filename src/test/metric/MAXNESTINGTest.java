package test.metric;

import main.resources.perfume.metric.AbstractMetricVisitor;
import main.resources.perfume.metric.MAXNESTINGMetric;
import main.resources.perfume.metric.MetricUtil;
import main.resources.perfume.util.LogUtil;

public class MAXNESTINGTest {

	public MAXNESTINGTest(String projectPath) {
		AbstractMetricVisitor measurement = new MAXNESTINGMetric();
		MetricUtil.startMetric(projectPath, measurement);
//		LogUtil.print(measurement.getMetricResult());
		LogUtil.print(measurement.getMetricResult().size());
	}

}
