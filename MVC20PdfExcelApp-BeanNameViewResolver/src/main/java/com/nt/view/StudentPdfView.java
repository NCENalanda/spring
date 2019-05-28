package com.nt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.nt.dto.StudentDTO;

public class StudentPdfView extends AbstractPdfView {

	@Override
	public void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<StudentDTO> listDTO=null;
		Paragraph p=null;
		Table table=null;
		//get Model Attribute
		listDTO=(List<StudentDTO>) map.get("studList");
		//add paragraph
		p=new Paragraph("Student Report",new Font(Font.BOLD));
		doc.add(p);
		// add table
		table=new Table(3,2);
		for(StudentDTO dto:listDTO){
			table.addCell(String.valueOf(dto.getSno()));
			table.addCell(dto.getSanme());
			table.addCell(dto.getCourse());
		}
		doc.add(table);

	}

}
