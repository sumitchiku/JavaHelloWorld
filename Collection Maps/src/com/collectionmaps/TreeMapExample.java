package com.collectionmaps;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNumber;
	private String lectureNumber;

	public Code(String sectionNumber, String lectureNumber) {
		this.sectionNumber = sectionNumber;
		this.lectureNumber = lectureNumber;
	}
	
	public String getSectionNumber() {
		return sectionNumber;
	}
	
	public String getLectureNumber() {
		return lectureNumber;
	}

	@Override
	public String toString() {
		return "code [sectionNumber=" + sectionNumber + ", lectureNumber=" + lectureNumber + "]";
	}

	@Override
	public int compareTo(Code obj) {
		String code1 = sectionNumber.concat(lectureNumber);
		String code2 = obj.getSectionNumber() + obj.getLectureNumber();
		return code1.compareTo(code2);
	}

}

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Code, String> topics = new TreeMap<>();
		topics.put(new Code("S01", "L03"), "OOPs");
		topics.put(new Code("S01", "L05"), "Array");
		topics.put(new Code("S01", "L04"), "String");
		topics.put(new Code("S02", "L05"), "Collection");
		topics.put(new Code("S02", "L07"), "Generic");
		topics.put(new Code("S03", "L02"), "MultiThreading");
		topics.put(new Code("S01", "L05"), "File I/O");

		for (Map.Entry<Code, String> entry : topics.entrySet()) {
			// System.out.println(entry);
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

	}

}
