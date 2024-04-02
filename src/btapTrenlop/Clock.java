
package btapTrenlop;


import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Clock {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Clock App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(0, 1));

            String[] timezones = TimeZone.getAvailableIDs();
            JComboBox<String> timezoneSelector = new JComboBox<>(timezones);
            frame.add(timezoneSelector);

            timezoneSelector.addActionListener(e -> {
                String selectedTimezone = (String) timezoneSelector.getSelectedItem();
                createClockWindow(frame, selectedTimezone);
            });

            // Create the first clock with the first timezone
            createClockWindow(frame, timezones[0]);

            frame.pack();
            frame.setLocationRelativeTo(null); // Center the frame
            frame.setVisible(true);
        });
    }

    private static void createClockWindow(JFrame frame, String timezone) {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel clockLabel = new JLabel();
        JLabel timezoneLabel = new JLabel(timezone, SwingConstants.CENTER);

        panel.add(clockLabel, BorderLayout.CENTER);
        panel.add(timezoneLabel, BorderLayout.SOUTH);

        new Thread(() -> {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            format.setTimeZone(TimeZone.getTimeZone(timezone));
            while (true) {
                clockLabel.setText(format.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        frame.add(panel);
        frame.pack();
    }
}
