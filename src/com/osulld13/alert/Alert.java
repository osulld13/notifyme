package com.osulld13.alert;

import java.awt.*;
import java.awt.TrayIcon.MessageType;

public class Alert {

    private final static String ICON_PATH = "img\\icons8-notification-48.png";
    private final static String DEFAULT_MESSAGE = " A notification, as requested!";
    private final static String TOOLTIP = "NotifyMe";
    private final static String CAPTION = "NotifyMe";

    private SystemTray tray;
    private Image image;
    private TrayIcon trayIcon;

    public Alert () throws AWTException {
        tray = SystemTray.getSystemTray();
        image = Toolkit.getDefaultToolkit().createImage(ICON_PATH);
        trayIcon = new TrayIcon(image, TOOLTIP);
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip(TOOLTIP);
        tray.add(trayIcon);
    }

    public void displayTray(String message) throws AWTException {
        trayIcon.displayMessage(CAPTION, (message == null || message.isEmpty()) ? DEFAULT_MESSAGE : message, MessageType.INFO);
    }
}
