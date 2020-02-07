package com.osulld13;

import com.osulld13.alert.Alert;

import java.awt.*;

public class Main {

    public static void main(String[] args) throws AWTException {
        if (SystemTray.isSupported()) {
            Alert alert = new Alert();
            if (args.length > 1) {
                alert.displayTray(args[0]);
            }
            alert.displayTray("");
        } else {
            System.err.println("System tray not supported!");
        }
    }
}
