module bois.chernichkin.javatesttask {
    requires javafx.controls;
    requires javafx.fxml;


    opens bois.chernichkin.javatesttask to javafx.fxml;
    exports bois.chernichkin.javatesttask;
}