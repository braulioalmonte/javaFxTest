import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class diceController {

    @FXML
    private ImageView diceImage;

    @FXML
    private Label numberLabel;

    Random random = new Random();

    Integer numero = 0;

    public String[] imagePaths = {
        "images/cara1.png",
        "images/cara2.png",
        "images/cara3.png",
        "images/cara4.png",
        "images/cara5.png",
        "images/cara6.png",
    };

    @FXML
    void onBtnClick(ActionEvent event) {
        Integer number = random.nextInt(1,6);
        numberLabel.setText(number.toString());
        diceImage.setImage(new Image(imagePaths[number]));

        // switch (number) {
        //     case 1:
        //         diceImage.setImage(new Image("images/cara1.png"));
        //         break;
        //     case 2:
        //         diceImage.setImage(new Image("images/cara2.png"));
        //         break;
        //     case 3:
        //         diceImage.setImage(new Image("images/cara3.png"));
        //         break;
        //     case 4:
        //         diceImage.setImage(new Image("images/cara4.png"));
        //         break;
        //     case 5:
        //         diceImage.setImage(new Image("images/cara5.png"));
        //         break;
        //     case 6:
        //         diceImage.setImage(new Image("images/cara6.png"));
        //         break;
        
        //     default:
        //         break;
        // }

    }

}
