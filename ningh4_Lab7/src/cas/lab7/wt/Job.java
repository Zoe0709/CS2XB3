package cas.lab7.wt;

import java.io.BufferedInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Job {

	private final String jobName; 
	private final double processingTime;
	
	public Job(String jobName, double processingTime) {
		if(processingTime<0)
			throw new IllegalArgumentException();
		this.jobName = jobName;
		this.processingTime = processingTime; 
	}
	
	public String getJobName() { return jobName; } 
	
	public double getProcessingTime() { return processingTime; }
	
	
	public int compareTo(Job that) {
		// Compare processing times of tow jobs
		if (this.processingTime<that.processingTime) return -1; // Returns -1 if this is greater than that
		if (this.processingTime>that.processingTime) return 1; // Returns 1 if that is greater than this
		return 0; // Returns 0 if equal
	}
	
	public String toString() {
		//convert the job name and processing time to a String value
		return String.format("%s %.1f",jobName,processingTime); 
	}	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(new BufferedInputStream(System.in));
		PrintWriter output = new PrintWriter(new OutputStreamWriter(System.out),true);
		int size = input.nextInt(); 
		Job[] jobs = new Job[size]; 
		for(int i = 0; i < size; i++) {
			String jobName = input.next();
			double jobDuration = input.nextDouble();
		    jobs[i] = new Job(jobName,jobDuration); 
		}
		Arrays.sort(jobs); 
		output.println(); 
		output.println("sorted jobs"); 
		for(int i=0;i<size;i++)
			output.print(jobs[i]+" ");
		output.println();
	}
}
