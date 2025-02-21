import javax.swing.JOptionPane;

public class SpeedDetector2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter your speed");
        int speed = Integer.parseInt(input);
        
        // Show the speed value
        JOptionPane.showMessageDialog(null, "Your speed is " + speed);
        
        // Check speed and show appropriate message
        if (speed > 60) {
            JOptionPane.showMessageDialog(null, "Slow down! Drive safe.", 
                "Ticket warning", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Congratulations! You are a safe driver.", 
                "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}