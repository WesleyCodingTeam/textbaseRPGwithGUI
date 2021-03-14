module RPGgame {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.wesleycodingteam to javafx.fxml;
    exports com.wesleycodingteam;
}