package top.fksoft.simple;

/**
 * @author Explo
 */


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jdkUtils.logcat.Logger;

public class Main extends Application {
    private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("项目的范例已经启动 ！");
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.initStyle(StageStyle.TRANSPARENT);
        Scene value = new Scene(FXMLLoader.load(getClass().getResource("/res/layout/window.fxml")));
        value.getStylesheets().add(getClass().getResource("/res/values/style.css").toExternalForm());
        stage.setScene(value);
        stage.show();
    }
}
