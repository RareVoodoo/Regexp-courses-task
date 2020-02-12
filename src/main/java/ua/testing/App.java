package ua.testing;


import ua.testing.controller.Controller;
import ua.testing.model.Model;
import ua.testing.view.View;

public class App
{
    public static void main( String[] args )
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.processUser();


    }
}
