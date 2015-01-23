package edu.xautjzd.activityrecognition.svmpredict;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import edu.xautjzd.activityrecognition.svmpredict.svm_predict;

@Path("/svm")
/*@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)*/
public class SvmService {
	@GET
	@Produces("text/plain; charset=utf-8")  // 加上此行防止中文亂碼
	public Response getAction() 
			throws IOException {
		
		// 将实时提取的特征传给WebService
		/*PrintWriter writer = new PrintWriter("svm_test_set", "UTF-8");
		writer.println(
				a.action +
				" 1:" + a.x_average +
				" 2:" + a.y_average +
				" 3:" + a.z_average +
				" 4:" + a.x_deviation +
				" 5:" + a.y_deviation +
				" 6:" + a.z_deviation +
				" 7:" + a.xy_deviation +
				" 8:" + a.yz_deviation +
				" 9:" + a.xz_deviation
 		);
		writer.close();*/
		BufferedWriter out = new BufferedWriter(new FileWriter("marks.txt", false));
		out.write("hello");
		out.close();
		
		String modelFile = "svm_train_set.model";       // 加载训练好的svm模型
		String[] testArgs = { 
				"svm_test_set", 
				modelFile,
				"svm_result" 
		};                       // directory of test file, model file, result file
		int predicted = (int)svm_predict.main(testArgs);
		
		String action;
		switch(predicted) {
			case 1:
				action = "上楼";
				break;
			case 2:
				action = "下楼";
				break;
			case 3:
				action = "步行";
				break;
			case 4:
				action = "静坐";
				break;
			default:
				action = "静坐";
				break;
		}
		return Response.status(200).entity(action).build();
	}
}
