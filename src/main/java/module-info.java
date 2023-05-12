module com.example.harrypotterjfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.harrypotterjfx to javafx.fxml;
    exports com.example.harrypotterjfx;
    exports com.example.harrypotterjfx.vue;
    opens com.example.harrypotterjfx.vue to javafx.fxml;
}