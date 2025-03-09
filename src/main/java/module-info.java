module aplicacao {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    exports aplicacao;
    exports controle;

    opens aplicacao to javafx.fxml; // Abre o pacote aplicacao para javafx.fxml
    opens controle to javafx.fxml; // Abre o pacote controle para javafx.fxml
}
