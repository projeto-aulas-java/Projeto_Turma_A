module LojaETEC {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	
	opens br.com.etec.model to javafx.graphics, javafx.fxml;
}
