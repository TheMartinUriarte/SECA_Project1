package com.company;

import java.util.Scanner;

public interface UserSelect {

    Scanner select = new Scanner(System.in);
    String userSelects = select.nextLine();
    String userSelection = userSelects.toLowerCase();

}
