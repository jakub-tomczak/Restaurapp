package Restaurant;

/**
 * Created by Jakub on 11.01.2017.
 */
public class ViewsManager {
    private String windowTitle;
    private String viewPath;

    private ViewsManager() {
    }

    public ViewsManager(String windowTitle, String viewPath) {
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
}
