package com.example;

import java.io.InputStream;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;

public class ParseISOMessage {

	public void execute(String message) throws ISOException {

		System.out.println(String.format(">>> ISO 8583 Message packed:\n%s", message));

		// Load Data Elements file
		InputStream dataElementTypes = getClass().getResourceAsStream("/dataElementTypes.xml");
		GenericPackager genericPackager = new GenericPackager(dataElementTypes);

		ISOMsg isoMsg = new ISOMsg();

		// Set Data Elements
		isoMsg.setPackager(genericPackager);

		isoMsg.unpack(message.getBytes());

		logISOMsg(isoMsg);

	}

	private static void logISOMsg(ISOMsg msg) {
		System.out.println(">>> ISO 8583 Message unpacked:");
		try {
			System.out.println("MTI: " + msg.getMTI());
			for (int i = 1; i <= msg.getMaxField(); i++) {
				if (msg.hasField(i)) {
					System.out.println(String.format("Data Element [%03d]: %s", i, msg.getString(i)));
				}
			}
		} catch (ISOException e) {
			e.printStackTrace();
		}
	}
}
