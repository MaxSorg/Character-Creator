import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class raceSelect extends Application {

    @Override
    public void start(Stage testStage) throws Exception {
        testStage.setTitle("My Awesome Character Creator");  
        Text title = new Text("Character Creator");     
        Vbox vbox = new Vbox
        Scene scene = new Scene(vbox);
        testStage.setScene(scene);
        
        testStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
