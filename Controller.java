package calc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
    private Stage secondStage;
    private AnchorPane panel;
    private Scene sceneS;
    private int[] number;

    @FXML private MenuBar bar;
    @FXML private Menu help;
    @FXML private MenuItem about;
    @FXML private TextField Fields;
    @FXML private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;   //Numbers
    @FXML private Button minusBtn,plusBtn,divideBtn,multiplicationBtn ,equallyBtn;    //act for num
    @FXML private Button Cbtn, CEbtn, Clearbtn, ChangeSignBtn, DoubleBtn, btnWasd;    //function
    @FXML private Button ProcentBtn,JustVBtn,v2Btn,v3Btn;    //second function





    @FXML
    public void initialize() {
        number = new int[99];
        btn0.setOnAction((c5) -> {
           numberVisable(0);
        });
        btn1.setOnAction((c5) -> {
            numberVisable(1);
        });
        btn2.setOnAction((c5) -> {
            numberVisable(2);
        });
        btn3.setOnAction((c5) -> {
            numberVisable(3);
        });
        btn4.setOnAction((c5) -> {
            numberVisable(4);
        });
        btn5.setOnAction((c5) -> {
            numberVisable(5);
        });
        btn6.setOnAction((c5) -> {
            numberVisable(6);
        });
        btn7.setOnAction((c5) -> {
            numberVisable(7);
        });
        btn8.setOnAction((c5) -> {
            numberVisable(8);
        });
        btn9.setOnAction((c5) -> {
            numberVisable(9);
        });

        CEbtn.setOnAction((f) -> Fields.setText(""));
    }

    public int numberVisable(int num) {
        String s = Fields.getText();
        Fields.setText(s+num);
        return num;

    }


    @FXML public void c(){
        System.out.println("C");
    }


    //        System.out.println("1");
    //        Fields.setText("1");
//    @FXML public void one(){

//    }
    //    {
    //
//    public void one(e ->  ActionEvent)

//



    @FXML public void minus(){
        System.out.println("-");
    }

    @FXML public void plus(){
        System.out.println("+");
    }

    @FXML public void multiplication(){
        System.out.println("X");
    }

    @FXML public void divide() {
        System.out.println("/");
    }

    @FXML public void chengeSign(){
        System.out.println("+/-");
    }

    @FXML
    public void wasd() {
        System.out.println(",");
    }

    @FXML
    public void clear() {
        System.out.println("<-");
    }

    @FXML
    public void procent() {
        System.out.println("%");
    }
    @FXML
    public void v2(){
        System.out.println("^2");
    }
    @FXML
    public void v3(){
        System.out.println("^3");
    }

    @FXML
    public void justV(){
        System.out.println("^");
    }
    @FXML
    public void equally() throws Exception{


    }

    @FXML public void about() throws Exception{
        AnchorPane panel = FXMLLoader.load(getClass().getResource("AboutGUI.fxml"));
        Scene sceneS = new Scene(panel);
        sceneS.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        secondStage = new Stage();
        secondStage.setScene(sceneS);
        secondStage.show();
    }
}