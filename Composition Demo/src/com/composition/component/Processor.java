package com.composition.component;

public class Processor {
	private String brand;
	private String series;
	private int generation;
	private int core;
	private int thread;
	private String cacheMemory;
	private String currFrequency;
	private String minFrequency;
	private String maxFrequency;
//	public String toString() {
//		return "Processor \n [brand = " + brand + ",\n series = " + series + ",\n generation = " + generation + ",\n core = " 
//				+ core + ",\n thread = " + thread + ",\n cacheMemory = " + cacheMemory + ",\n minFrequency = " + minFrequency
//				+ ",\n maxFrequency = " + maxFrequency + ",\n getClass() = " + getClass() + ",\n hashCode() = " + hashCode() + "]";
//	}
	
	public Processor(String brand, String series, int generation, int core, int thread, String cacheMemory,
			String currFrequency, String minFrequency, String maxFrequency) {
		
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.core = core;
		this.thread = thread;
		this.cacheMemory = cacheMemory;
		this.currFrequency = currFrequency;
		this.minFrequency = minFrequency;
		this.maxFrequency = maxFrequency;
	}
	public Processor() {
		this.brand = "intel";
		this.series = "i5 7200u";
		this.generation = 8;
		this.core = 4;
		this.thread = 4;
		this.cacheMemory = "4MB";
		this.currFrequency = "2.8GHz";
		this.minFrequency = "2.4GHz";
		this.maxFrequency = "3.8GHz";
	}
	public String getBrand() {
		return brand;
	}
	public String getSeries() {
		return series;
	}
	public int getGeneration() {
		return generation;
	}
	public int getCore() {
		return core;
	}
	public int getThread() {
		return thread;
	}
	public String getCacheMemory() {
		return cacheMemory;
	}
	public String getCurrFrequency() {
		return currFrequency;
	}
	public String getMinFrequency() {
		return minFrequency;
	}
	public String getMaxFrequency() {
		return maxFrequency;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", core=" + core
				+ ", thread=" + thread + ", cacheMemory=" + cacheMemory + ", currFrequency=" + currFrequency
				+ ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + ", hashCode()=" + hashCode()
				+ "]";
	}
	public void setCurrFrequency(String currFrequency) {
		this.currFrequency = currFrequency;
	}
	
	
	
	
	
	

}
