package Restaurant;

import javafx.stage.Stage;

/**
 * Created by Jakub on 11.01.2017.
 */
public class ViewsDescription {
    private String windowTitle;
    private String viewPath;
    private Stage referenceToWindow;

    private ViewsDescription() {
        referenceToWindow = null;
    }

    public ViewsDescription(String windowTitle, String viewPath) {
        this.windowTitle = windowTitle;
        this.viewPath = viewPath;
    }

    public String getWindowTitle() {
        return windowTitle;
    }

    public void setWindowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
    }

    public String getViewPath() {
        return viewPath;
    }

    public void setViewPath(String viewPath) {
        this.viewPath = viewPath;
    }

    public Stage getReferenceToWindow() {
        return referenceToWindow;
    }

    public void setReferenceToWindow(Stage referenceToWindow) {
        this.referenceToWindow = referenceToWindow;
    }
}
