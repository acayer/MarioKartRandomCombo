module com.example.mariokartrandomcombo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mariokartrandomcombo to javafx.fxml;
    exports com.example.mariokartrandomcombo;
    exports com.example.mariokartrandomcombo.ComboGenerators;
    opens com.example.mariokartrandomcombo.ComboGenerators to javafx.fxml;
    exports com.example.mariokartrandomcombo.Model.MK8;
    opens com.example.mariokartrandomcombo.Model.MK8 to javafx.fxml;
}