package com.example.test;

import java.util.HashMap;

import org.jpos.iso.ISOException;

import com.example.BuildISOMessage;

public class TestBuildISOMessage {

	public static void main(String[] args) {
		testSiteExample();
		System.err.println("");
		testDocExample0205();
		System.err.println("");
		testDocExample0200();
	}

	/**
	 * Test using data from:
	 * http://jimmod.com/blog/2011/07/26/jimmys-blog-iso-8583-tutorial-build-and-parse-iso-message-using-jpos-library/
	 */
	public static void testSiteExample() {

		String MTI = "0200";

		HashMap<Integer, String> dataElements = new HashMap<Integer, String>();
		dataElements.put(3, "201234");
		dataElements.put(4, "10000");
		dataElements.put(7, "110722180");
		dataElements.put(11, "123456");
		dataElements.put(44, "A5DFGR");
		dataElements.put(105, "ABCDEFGHIJ 1234567890");

		BuildISOMessage buildISOMessage = new BuildISOMessage();
		try {
			buildISOMessage.execute(MTI, dataElements);
		} catch (ISOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testDocExample0205() {

		String MTI = "0205";

		HashMap<Integer, String> dataElements = new HashMap<Integer, String>();
		dataElements.put(3, "890002");
		dataElements.put(12, "140304");
		dataElements.put(13, "0317");
		dataElements.put(33, "0104");
		dataElements.put(37, "000000796318");
		dataElements.put(63, "00141001502885522004");
		dataElements.put(100, "8127");

		BuildISOMessage buildISOMessage = new BuildISOMessage();
		try {
			buildISOMessage.execute(MTI, dataElements);
		} catch (ISOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void testDocExample0200() {

		String MTI = "0200";

		HashMap<Integer, String> dataElements = new HashMap<Integer, String>();
		dataElements.put(3, "890002");
		dataElements.put(12, "140327");
		dataElements.put(13, "0317");
		dataElements.put(15, "0317");
		dataElements.put(33, "0104");
		dataElements.put(37, "000000796319");
		dataElements.put(63, "00124100150288552200400000004981170320051160402200284600000000498100150202040343205522004010201");
		dataElements.put(100, "8127");

		BuildISOMessage buildISOMessage = new BuildISOMessage();
		try {
			buildISOMessage.execute(MTI, dataElements);
		} catch (ISOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
