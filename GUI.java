//Importing Neccessary Packages
import javax.swing.*;

//Main Class
public class GUI
{

    //Main Code
    public void gui()
    {
        //Collecting Information
        String name = JOptionPane.showInputDialog("What is your Name?");
        String sex = JOptionPane.showInputDialog("What is your Sex?");
        String age = JOptionPane.showInputDialog("What is your Age?");
        String abilities = JOptionPane.showInputDialog("name two things you're good at");
        
        //Displaying results
        JOptionPane.showMessageDialog(null, "Name: " + name + "\n\nSex: " + sex + "\n\nAge: " + age + "\n\nAbilities: " + abilities, "GUI", JOptionPane.DEFAULT_OPTION);

    }

    //Main Function
    public static void main(String[] args) 
    {
        GUI run = new GUI();

        run.gui();
    }
}
