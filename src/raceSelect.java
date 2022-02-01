import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class raceSelect extends Application {

    @Override
    public void start(Stage testStage) throws Exception {
        testStage.setTitle("Does it work? :O");
        
        Label label = new Label(PlayerClass.WIZARD.getAbilityOne() + "\n" + 
        PlayerClass.WIZARD.abilityOneDescription());
        Scene scene = new Scene(label, 400, 200);
        testStage.setScene(scene);
        
        testStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
