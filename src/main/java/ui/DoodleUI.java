package ui;

import javafx.application.Application;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *This class is the user interface for the program
 *
 * @author Ted Ginn
 * @version 1.0
 */
public class DoodleUI extends Application
{
    private static final Double DEFAULTSTROKE = 3.0;
    private static final Double MAXSTROKE = 30.0;
    private static final Double MINSTROKE = 1.0;
    private final int MAX_BUTTONS = 4;

    Canvas canvas;
    GraphicsContext graphicsContext;
    Slider strokeSlider;
    Button[] shapeButtons;
    private String[] shapes = {"Circle", "Rectangle", "Triangle", "Line"};
    private String[] shapeImgs = {"circle", "rec", "tri", "line"};
    ColorPicker colorPicker;
    Label thicknessLabel;
    CheckBox fillCheckbox;
    TextField numberThickness;


    Button btnClear = new Button("Clear");

    /**
     * This is the constructor for the UI
     *
     * @param stage this is the
     */
    public void start(Stage stage)
    {
        canvas = new Canvas(850,400);
        VBox vBox = new VBox();
        vBox.setStyle("-fx-background-color: white;");
        vBox.getChildren().add(getToolbar(canvas));
        vBox.getChildren().add(getShapeCanvas(canvas));
        stage.setTitle("Doodle Pad");
        stage.setScene(new Scene(vBox, canvas.getWidth() -1, canvas.getHeight() + 30));
        stage.show();

    }
    private HBox getShapeCanvas(Canvas canvas)
    {
        graphicsContext = canvas.getGraphicsContext2D();
        HBox hBox = new HBox();


        /*
        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, e ->
        {
            graphicsContext.beginPath();
            graphicsContext.moveTo(e.getX(), e.getY());
            graphicsContext.stroke();
            graphicsContext.closePath();
        });*/

        /*
        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, e ->
        {
            graphicsContext.lineTo(e.getX(), e.getY());
            graphicsContext.stroke();

        });*/

        btnClear.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                hBox.getChildren().removeAll(hBox.getChildren());
            }
        });

        hBox.getChildren().addAll(canvas);
        hBox.setStyle("-fx-border-color: black;");
        return hBox;
    }



    private HBox getToolbar(Canvas canvas) {
        graphicsContext = canvas.getGraphicsContext2D();
        HBox hBox = new HBox();
        colorPicker = new ColorPicker(Color.WHITE);
        thicknessLabel = new Label("Thickness");
        numberThickness = new TextField();
        fillCheckbox = new CheckBox("Fill");


        shapeButtons = new Button[MAX_BUTTONS];

        final int i;
        for (i = 0; i < MAX_BUTTONS;) {
            shapeButtons[i] = new Button(shapes[i]);

            shapeButtons[i].setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {

                }
            });

            hBox.getChildren().add(shapeButtons[i]);
        }




        strokeSlider = new Slider(MINSTROKE, MAXSTROKE, DEFAULTSTROKE);
        strokeSlider.setShowTickLabels(true);
        strokeSlider.setMax(10);
        strokeSlider.setMin(1);





        colorPicker.setOnAction(e -> graphicsContext.setStroke(colorPicker.getValue()));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(colorPicker, fillCheckbox, thicknessLabel, numberThickness, strokeSlider, btnClear);
        return hBox;
    }
}
