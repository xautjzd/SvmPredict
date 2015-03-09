package edu.xautjzd.activityrecognition.svmpredict;

import java.io.Serializable;

/**
 * 
 * @author xautjzd
 */
public class PredictAttribute implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private double X_Average;       
	private double Y_Average;
	private double Z_Average;
	
	private double X_Deviation;     
	private double Y_Deviation;
	private double Z_Deviation;
	
	private double XY_Correlation;  
	private double YZ_Correlation;
	private double XZ_Correlation;
	
	private double X_Skewness;      
	private double Y_Skewness;
	private double Z_Skewness;
	
	private double X_Kurtosis;     
	private double Y_Kurtosis;
	private double Z_Kurtosis;
	
	public PredictAttribute() {
	}
	
	public PredictAttribute(double x_Average, double y_Average,
			double z_Average, double x_Deviation, double y_Deviation,
			double z_Deviation, double xY_Correlation, double yZ_Correlation,
			double xZ_Correlation, double x_Skewness, double y_Skewness,
			double z_Skewness, double x_Kurtosis, double y_Kurtosis,
			double z_Kurtosis) {
		X_Average = x_Average;
		Y_Average = y_Average;
		Z_Average = z_Average;
		X_Deviation = x_Deviation;
		Y_Deviation = y_Deviation;
		Z_Deviation = z_Deviation;
		XY_Correlation = xY_Correlation;
		YZ_Correlation = yZ_Correlation;
		XZ_Correlation = xZ_Correlation;
		X_Skewness = x_Skewness;
		Y_Skewness = y_Skewness;
		Z_Skewness = z_Skewness;
		X_Kurtosis = x_Kurtosis;
		Y_Kurtosis = y_Kurtosis;
		Z_Kurtosis = z_Kurtosis;
	}
	
	public double getX_Average() {
		return X_Average;
	}
	public void setX_Average(double x_Average) {
		X_Average = x_Average;
	}
	public double getY_Average() {
		return Y_Average;
	}
	public void setY_Average(double y_Average) {
		Y_Average = y_Average;
	}
	public double getZ_Average() {
		return Z_Average;
	}
	public void setZ_Average(double z_Average) {
		Z_Average = z_Average;
	}
	public double getX_Deviation() {
		return X_Deviation;
	}
	public void setX_Deviation(double x_Deviation) {
		X_Deviation = x_Deviation;
	}
	public double getY_Deviation() {
		return Y_Deviation;
	}
	public void setY_Deviation(double y_Deviation) {
		Y_Deviation = y_Deviation;
	}
	public double getZ_Deviation() {
		return Z_Deviation;
	}
	public void setZ_Deviation(double z_Deviation) {
		Z_Deviation = z_Deviation;
	}
	public double getXY_Correlation() {
		return XY_Correlation;
	}
	public void setXY_Correlation(double xY_Correlation) {
		XY_Correlation = xY_Correlation;
	}
	public double getYZ_Correlation() {
		return YZ_Correlation;
	}
	public void setYZ_Correlation(double yZ_Correlation) {
		YZ_Correlation = yZ_Correlation;
	}
	public double getXZ_Correlation() {
		return XZ_Correlation;
	}
	public void setXZ_Correlation(double xZ_Correlation) {
		XZ_Correlation = xZ_Correlation;
	}
	public double getX_Skewness() {
		return X_Skewness;
	}
	public void setX_Skewness(double x_Skewness) {
		X_Skewness = x_Skewness;
	}
	public double getY_Skewness() {
		return Y_Skewness;
	}
	public void setY_Skewness(double y_Skewness) {
		Y_Skewness = y_Skewness;
	}
	public double getZ_Skewness() {
		return Z_Skewness;
	}
	public void setZ_Skewness(double z_Skewness) {
		Z_Skewness = z_Skewness;
	}
	public double getX_Kurtosis() {
		return X_Kurtosis;
	}
	public void setX_Kurtosis(double x_Kurtosis) {
		X_Kurtosis = x_Kurtosis;
	}
	public double getY_Kurtosis() {
		return Y_Kurtosis;
	}
	public void setY_Kurtosis(double y_Kurtosis) {
		Y_Kurtosis = y_Kurtosis;
	}
	public double getZ_Kurtosis() {
		return Z_Kurtosis;
	}
	public void setZ_Kurtosis(double z_Kurtosis) {
		Z_Kurtosis = z_Kurtosis;
	}
}
