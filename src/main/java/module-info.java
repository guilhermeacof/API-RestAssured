module br.com.iterasys.petstore {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.iterasys.petstore to javafx.fxml;
    exports br.com.iterasys.petstore;
}