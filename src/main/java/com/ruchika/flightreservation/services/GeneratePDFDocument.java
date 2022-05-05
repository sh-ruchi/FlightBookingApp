package com.ruchika.flightreservation.services;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.ruchika.flightreservation.pojo.Reservation;

import net.bytebuddy.implementation.bytecode.constant.TextConstant;

@Component
public class GeneratePDFDocument {

	public void generateItinerary(String pdfFileLoc, Reservation reservation) {
		
		Document doc = new Document();
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(pdfFileLoc);
			PdfWriter.getInstance(doc,fos);
			doc.open();
			doc.add(addTable(reservation));
			doc.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private PdfPTable addTable(Reservation reservation) {
		
		PdfPTable table = new PdfPTable(2);
		PdfPCell cell;
         
		 cell = new PdfPCell();	
         cell.setPhrase(new Phrase("Flight Itinerary"));
		 cell.setColspan(2);
		 table.addCell(cell);
		 
		 cell.setPhrase(new Phrase("Flight Details :"));
		 cell.setColspan(2);
		 table.addCell(cell);
		
		 table.addCell("Departure City");
		 table.addCell(reservation.getFlight().getDepartureCity());
		 
		 table.addCell("Arrival City");
		 table.addCell(reservation.getFlight().getArrivalCity());
		 
		 table.addCell("Flight #");
		 table.addCell(reservation.getFlight().getFlightNumber());
		 
		 table.addCell("Departure Date");
		 table.addCell(reservation.getFlight().getDateOfDeparture().toString());
		 
		 table.addCell("Departure Time");
		 table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
		 
		 table.addCell("Airline ");
		 table.addCell(reservation.getFlight().getOperatingAirlines()); 
		 
		
		 cell.setPhrase(new Phrase("Passenger Details: "));
		 cell.setColspan(2);
		 table.addCell(cell);
		
		 table.addCell("Passenger Name");
		 table.addCell(reservation.getPassenger().getFirstName()+" "+reservation.getPassenger().getLastName()); 

		 table.addCell("Email: ");
		 table.addCell(reservation.getPassenger().getEmail());
		 
		 table.addCell("Phone: ");
		 table.addCell(reservation.getPassenger().getPhone());
		 
		 return table;
	}
}
