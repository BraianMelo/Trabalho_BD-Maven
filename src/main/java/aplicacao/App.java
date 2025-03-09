package aplicacao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import controle.MenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import persistencia.ConexaoBD;

public class App extends Application {
	
	private static final boolean REDIMENSIONAVEL = false;
	
    public static void main(String[] args) {
    	try {
			Connection conexao = ConexaoBD.getConexao();
			launch(args);  
			
    	} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			ConexaoBD.fecharConexao();
		}
    }

    @Override
    public void start(Stage stage) {
    	abrirJanela(
    			"/visao/MenuVisao.fxml", 
            	"/visao/estilos/MenuVisaoModoEscuro.css", 
            	"SGBD: Criptozoologia", 
            	"/visao/imagens/Icone_Aplicativo.png");

    }
    
	public static void abrirJanela(String caminhoFXML, String caminhoCss, String titulo, String iconePath) {
		try {
			FXMLLoader loader = new FXMLLoader(App.class.getResource(caminhoFXML));

			Parent parent = loader.load();

			Scene scene = new Scene(parent);

			// Adiciona o CSS à cena, se o caminho for fornecido
			if (caminhoCss != null && !caminhoCss.isEmpty()) {
				scene.getStylesheets().add(App.class.getResource(caminhoCss).toExternalForm());
			}

			Stage stage = new Stage();
			stage.setScene(scene);

			// Configura o ícone, se fornecido
			if (iconePath != null && !iconePath.isEmpty()) {
				Image icone = new Image(App.class.getResourceAsStream(iconePath));
				stage.getIcons().add(icone);
			}

			stage.setTitle(titulo);
			stage.setResizable(REDIMENSIONAVEL);
			stage.show();
			
			MenuController controller = loader.getController();
			controller.setDados(stage);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
