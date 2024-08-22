package ui;

import persistence.Storage;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import core.Dress;
import core.Dresses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ProductOverviewController implements Initializable {


    /**
     * Images for the ProductOverview-scene.
     */
    @FXML
    private ImageView img1, img2, img3, img4, img5, img6, headerImage;


    /**
     * Buttons under the images in the ProductOverview-scene.
     */
    @FXML
    private Button dress1, dress2, dress3, dress4, dress5, dress6;

     /**
     * Header for the ProductOverview-scene.
     */
    @FXML
    private Label headerTxt;

    /**
     * Remote access.
     */
    private RemoteCoutureRentalAccess access = new RemoteCoutureRentalAccess();

    /**
     * Instance of storage.
     */
    private static Storage storage = new Storage();

    /**
     * A static list of all Button elements used in the controller.
     */
    private static List<Button> allButtons = new ArrayList<>();


    /**
     * Initializes the user interface components, setting images and text based on the stored data.
     * This method also handles any exceptions related to file access.
     *
     * @param location The URL location of the FXML file.
     * @param resources The ResourceBundle containing resources for the FXML file.
     */
    @Override
    public void initialize(final URL location, final ResourceBundle resources) {

        storage.initializeFile("DressStorage.json");

        try {
            if (allButtons.isEmpty()) {
                final int numOfButtons = 6;
                for (int i = 1; i <= numOfButtons; i++) {
                    Button button = (Button) this.getClass().getDeclaredField("dress" + i).get(this);
                    allButtons.add(button);
                }


            }
            loadImage(img1, "/pictures/img1.jpg");
            loadImage(img2, "/pictures/img2.jpg");
            loadImage(img3, "/pictures/img3.jpg");
            loadImage(img4, "/pictures/img1.jpg");
            loadImage(img5, "/pictures/img2.jpg");
            loadImage(img6, "/pictures/img3.jpg");
            loadImage(headerImage, "/pictures/header1.jpeg");
            loadImage(headerImage, "/pictures/header1.jpeg");

            setText();



        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();

        }
    }

    private void loadImage(final ImageView imageView, final String imageName) {
        InputStream inputStream = getClass().getResourceAsStream(imageName);

        if (inputStream != null) {
            Image image = new Image(inputStream);
            imageView.setImage(image);
        } else {
            System.err.println("Input stream is null for image: " + imageName);
        }
    }

    /**
     * Sets the text of the buttons based on the availability of the dresses.
     */
    public void setText() {
        Dresses dresses = access.getDresses();

        for (Dress dress : dresses.getDresses()) {
            for (Button button : allButtons) {
                if (button.getId().equals(dress.getId())) {
                    Boolean isAvailable = access.getAvailability(dress.getId());
                    button.setText(isAvailable ? "AVAILABLE" : "RENTED");
                    break;
                }
            }
        }
    }

    /**
     * Handles the button click event to toggle the availability status of a dress and update its text.
     *
     * @param event The ActionEvent triggered by the button click.
     */
    @FXML
    private void toggleButton(final ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        access.getAvailability(clickedButton.getId());

        access.changeAvailability(clickedButton.getId());
        access.getAvailability(clickedButton.getId());
        Boolean isAvailable = access.getAvailability(clickedButton.getId());
        clickedButton.setText(isAvailable ? "AVAILABLE" : "RENTED");
    }
}