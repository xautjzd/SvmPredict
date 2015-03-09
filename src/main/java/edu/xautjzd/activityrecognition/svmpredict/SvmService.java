package edu.xautjzd.activityrecognition.svmpredict;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("svm")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SvmService {
	@GET
	@Produces("text/plain; charset=utf-8")  // 加上此行防止中文亂碼
	public Response getAction() 
			throws IOException {
		
		// 将实时提取的特征传给WebService
		/*File test_file = new File("src/main/resources/svm_test_set");
		PrintWriter writer = new PrintWriter(test_file, "UTF-8");
		writer.println(
				"1.0" +
				" 1:" + a.getX_Average() +
				" 2:" + a.getY_Average() +
				" 3:" + a.getZ_Average() +
				" 4:" + a.getX_Deviation() +
				" 5:" + a.getY_Deviation() +
				" 6:" + a.getZ_Deviation() +
				" 7:" + a.getXY_Correlation() +
				" 8:" + a.getYZ_Correlation() +
				" 9:" + a.getXZ_Correlation() +
				" 10:" + a.getX_Skewness() + 
				" 11:" + a.getY_Skewness() +
				" 12:" + a.getZ_Skewness() +
				" 13:" + a.getX_Kurtosis() +
				" 14:" + a.getY_Kurtosis() +
				" 15:" + a.getZ_Kurtosis()
 		);
		writer.close();*/
			
		String modelFile = "svm_train_set.model";       // 加载训练好的svm模型
		String[] testArgs = { 
				"svm_test_set", 
				modelFile,
				"svm_result" 
		};                       // directory of test file, model file, result file
		int predicted =  (int)svm_predict.main(testArgs);
		
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
				action = "站立";
				break;
			default:
				action = "站立";
				break;
		}
		return Response.status(200).entity(action).build();
	}
}
