package ua.testing.controller;

import javafx.util.Pair;
import ua.testing.model.Model;
import ua.testing.view.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller {
    Model model;
    View  view;
    Scanner scanner;
    Matcher matcher;



    public Controller (Model model, View view){
        this.model = model;
        this.view = view;
        scanner = new Scanner(System.in);
    }



    public void processUser(){
        view.printMessage(View.USER_LAST_NAME_INPUT_MESSAGE);
        processUserLastName(scanner);

        view.printMessage(View.USER_NICKNAME_INPUT_MESSAGE);
        processUserNickname(scanner);

        view.printMessage(model.getUserLastName());
        view.printMessage(model.getUserNickname());

    }

    private void processUserLastName(Scanner scanner){
        Pattern regexPattern = Pattern.compile(RegexContainer.LAST_NAME_REGEX);
        submitUserInput(scanner,regexPattern);
        model.setUserLastName(matcher.group());
    }

    private void processUserNickname(Scanner scanner){
        Pattern regexPattern = Pattern.compile(RegexContainer.NICKNAME_REGEX);
        submitUserInput(scanner,regexPattern);
        model.setUserNickname(matcher.group());

    }

   private void submitUserInput(Scanner scanner, Pattern pattern){
        boolean stringIsMatchesTemplate = false;
        while (!stringIsMatchesTemplate)
        {
            matcher = pattern.matcher(scanner.nextLine());
            if(matcher.matches()){
                stringIsMatchesTemplate = true;
            }
            else {
                view.printMessage(View.WRONG_USER_INPUT_MESSAGE);
            }
        }

   }



}
