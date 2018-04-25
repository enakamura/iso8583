package com.example.test;

import org.jpos.iso.ISOException;

import com.example.ParseISOMessage;

public class TestParseISOMessage {

	public static void main(String[] args) {
		testSiteExample();
		System.err.println("");
		testDocExample215();
	}
	
	/**
	 * Test using data from:
	 * http://jimmod.com/blog/2011/07/26/jimmys-blog-iso-8583-tutorial-build-and-parse-iso-message-using-jpos-library/
	 */
	public static void testSiteExample(){
		
		String isoMessage = "0200B2200000001000000000000000800000201234000000010000011072218012345606A5DFGR021ABCDEFGHIJ 1234567890"; 
		
		ParseISOMessage parseISOMessage = new ParseISOMessage();
		try {
			parseISOMessage.execute(isoMessage);
		} catch (ISOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void testDocExample215(){
		
		String isoMessage = "0215A01800008A0000060000000010000002890002140304031704812700000079631800558ESCOLA BRASILEIRA DE TECNOLOGIA________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________1240301200212/2001846100000005186001502010303432055220040101120402200201/2002846000000004981001502020403432055220040102010304200203/2002846500000003843001502040303432055220040102030305200204/20028466000000009770015020503034320552200401020403700141001502885522004_________________040104009000000254";
		
		ParseISOMessage parseISOMessage = new ParseISOMessage();
		try {
			parseISOMessage.execute(isoMessage);
		} catch (ISOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
