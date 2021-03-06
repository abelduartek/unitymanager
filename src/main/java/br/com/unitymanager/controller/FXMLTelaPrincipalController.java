package br.com.unitymanager.controller;

import br.com.unitymanager.stage.Telas;
import br.com.unitymanager.tab.TabModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

public class FXMLTelaPrincipalController implements Initializable {
    
    @FXML private MenuItem menuCadastroOS;
    @FXML private MenuItem menuCadastroProduto;
    @FXML private MenuItem menuCadastroEmpresa;
    @FXML private MenuItem menuCadastroUsuario;
    @FXML private MenuItem menuFinanceiroEmissaoFatura;
    @FXML private MenuItem menuFinanceiroEmissaoNF;
    @FXML private MenuItem menuRelatorioMovEstoque;
    @FXML private MenuItem menuRelatorioNF;
    @FXML private MenuItem menuRelatorioOS;
    @FXML private MenuItem menuRelatorioFatura;
    @FXML private MenuItem menuUtilitarioRomaneio;
    @FXML private MenuItem menuUtilitarioAcompanhamentoOS;
    @FXML private MenuItem menuUtilitarioFaturamentoOS;
    @FXML private MenuItem menuUtilitarioSeparacaoOS;
    @FXML private MenuItem menuUtilitarioCalculadora;
    @FXML private MenuItem menuSobreVersao;
    @FXML private MenuItem menuSobreManual;
    @FXML private MenuItem menuSairDeslogar;
    @FXML private MenuItem menuSair;
    @FXML private TabPane tabPanePrincipal;
    @FXML private AnchorPane tabHome;
    @FXML public Label lblUsuario;
    @FXML private Label lblBandoDeDados;
    @FXML public Label lblData;
    @FXML private Button btnTeste;
   
    TabModel tabModel = new TabModel(); //Responsável por chamar os FXML na TabPrincipal
    Telas chamandoTelas = new Telas(); 
  
    @FXML
    void actionButtonMenuCadEmpresa(ActionEvent event) throws IOException {
        chamandoTelas.telaGerenciadorEmpresa();

    }
    @FXML //O método abaixo é responsável por chamar a tela de cadastro de usuário
    void actionButtonMenuCadUsuario(ActionEvent event) throws IOException {
        tabPanePrincipal.getTabs().add(tabModel.tabTelaGerenciadorUsuario());
    }
    
    @FXML
    void actionButtonMenuCadOS(ActionEvent event) throws IOException {
        tabPanePrincipal.getTabs().add(tabModel.tabTelaGerenciadorOS());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    
    
}
