//#4: Text and TextField
//https://www.youtube.com/watch?v=zx023kSsn94&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=8
//#5: RadioButton
//https://www.youtube.com/watch?v=hkINsm3Wr48&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=9
//#6: Slider updating text
//https://www.youtube.com/watch?v=DxK_Bv86S20&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=10


package com.itom.textfield;

        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private ToggleGroup Animal;

    @FXML
    private RadioButton Cat;

    @FXML
    private RadioButton Dog;
    @FXML
    private TextField namein;

    @FXML
    private Text nameout;

    @FXML
    private TextArea textArea;

    @FXML
    private Label welcomeText;
    private Toggle selectedToggle;

    @FXML
    private Slider slider0100;

    @FXML
    void nameChane(MouseEvent event) {
        welcomeText.setText(namein.getText());
        nameout.setText(namein.getText());

        if(Animal.getSelectedToggle().equals(Cat)){
            textArea.setText("Cat");
            System.out.println("Cat");
        }else {
            textArea.setText("Dog");

        }
        System.out.println(Animal.getSelectedToggle());

    }

    @FXML
    void upDateText(MouseEvent event) {
        textArea.setText(String.valueOf((int)slider0100.getValue()));
        System.out.println("Slider event");
    }

}
