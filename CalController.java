package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalController implements Initializable {

	@FXML Label lblR, lblD;
	@FXML Button btnPL, btnMI, btnMU, btn, DI, btnCL, btnEQ, btn8, btn9;
	
	int n,x,y,result;
	String num="", op;
	
	private CalModel model = new CalModel();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	public void btnPlAction(ActionEvent event) {
		op ="+";
		makelog(op);
	}
	public void btnMIAction(ActionEvent event) {
		op ="-";
		makelog(op);
	}
	public void btnMUAction(ActionEvent event) {
		op ="*";
		makelog(op);
	}
	public void btnDIAction(ActionEvent event) {
		op ="/";
		makelog(op);
	}
	public void btnCLAction(ActionEvent event) {
		lblR.setText("0");
		lblD.setText("");
		
	}
	public void btnEQAction(ActionEvent event) {
		y = Integer.parseInt(lblR.getText());
		num = lblD.getText();
		
		lblD.setText(num + y + " = ");
		result = model.calculate(op, x, y);
		
		lblR.setText(Integer.toString(result));
		num = lblD.getText();
		lblD.setText(num+result);
	}
	public void btn8Action(ActionEvent event) {
		n=8;
		makenum(n);
	}
	public void btn9Action(ActionEvent event) {
		n=9;
		makenum(n);
	}
	public void makenum(int n) {
		num = lblR.getText();
		if(num.equals("0"))  num ="";
		lblR.setText(num+ Integer.toString(n));
	}
	public void makelog(String op) {
		x = Integer.parseInt(lblR.getText());
		lblR.setText("");
		lblD.setText(Integer.toString(x) + " " + op + " ");
	}

}
