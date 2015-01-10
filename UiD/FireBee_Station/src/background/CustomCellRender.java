/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package background;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Observer;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JTabbedPane;

/**
 *
 * @author Jeroen
 */
public class CustomCellRender extends DefaultListCellRenderer {

    private Color color;
    private JTabbedPane listener;
    private int tabIndex;
    
    public CustomCellRender(JTabbedPane listener, int tabIndex) {
        super();
        color = Color.GREEN;
        this.listener = listener;
        this.tabIndex = tabIndex;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        String dateString = ((String) value).split(" ")[1];
        String[] dateSplit = dateString.split("-");
        Date expirationDate = new Date(Integer.parseInt(dateSplit[0]) - 1900, Integer.parseInt(dateSplit[1]) - 1, Integer.parseInt(dateSplit[2]));
        Date today = new Date();
        Date oneMonthFromNow = new Date();
        oneMonthFromNow.setMonth(today.getMonth() + 1);
        if (expirationDate.before(today)) {
            c.setFont(c.getFont().deriveFont(Font.BOLD));
            c.setForeground(Color.RED);
            if (color != Color.RED) {
                color = Color.RED;
                listener.setBackgroundAt(tabIndex, color);
            }
            c.setBackground(Color.DARK_GRAY);
        } else if (expirationDate.before(oneMonthFromNow)) {
            c.setFont(c.getFont().deriveFont(Font.ITALIC));
            c.setForeground(Color.ORANGE);
            if (color == Color.GREEN) {
                color = Color.ORANGE;
                listener.setBackgroundAt(tabIndex, color);
            }
            c.setBackground(Color.GRAY);
        } else {
            c.setFont(c.getFont().deriveFont(Font.PLAIN));
        }
        return c;
    }
}
