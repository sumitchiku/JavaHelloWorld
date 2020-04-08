package com.markerInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.markerInterface.example.CloneDemo;
import com.markerInterface.example.SerializableDemo;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/* MarkerInterface is an empty Interface (no fields or methods) 
		 * public interface Serialzable{
		 * 		//nothing
		 * }
		 * ssdd*/
		CloneDemo demoObject = new CloneDemo(22, "Sumit");
		CloneDemo cloneDemoObject = (CloneDemo) demoObject.clone();		//typecast object type to our class type
		
		System.out.println(cloneDemoObject.integerValue);
		System.out.println(cloneDemoObject.stringValue);
	
		System.out.println("**************************");
		System.out.println();
		
		SerializableDemo sd = new SerializableDemo(04, "Puloma");
		
		//serializable sd Object
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		 oos.writeObject(sd);
		
		//de-serializable sd Object
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializableDemo sdObject = (SerializableDemo) ois.readObject();
	
		System.out.println(sdObject.intValue + "  " + sdObject.strValue);
	
		oos.close();
		ois.close();
	
		System.out.println("##############################");
		System.out.println();
	
	
	}

}
