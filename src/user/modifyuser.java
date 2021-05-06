package user;

import util.DButil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 * Created by JFormDesigner on Tue May 04 20:06:36 CST 2021
 */



/**
 * @author 1
 */
public class modifyuser extends JFrame {
    public modifyuser() {
        initComponents();
    }

    public static void main(String[] args) {
        new modifyuser();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("id\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(45, 45), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u7528\u6237\u540d\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 10f));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 90), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("\u5bc6\u7801\uff1a");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 10f));
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(40, 135), label3.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(135, 45, 100, 26);
        contentPane.add(textField2);
        textField2.setBounds(135, 90, 100, 26);
        contentPane.add(textField3);
        textField3.setBounds(135, 135, 100, 26);

        //---- button1 ----
        button1.setText("\u4fee\u6539");
        contentPane.add(button1);
        button1.setBounds(145, 195, 60, 30);

        contentPane.setPreferredSize(new Dimension(340, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String id = textField1.getText();
                        String username = textField2.getText();
                        String password = textField3.getText();
                        DButil dButil = new DButil();
                        String sql = "update users set username = '"+username+"', password= '"+password+"' where id= '"+id+"';";
                        System.out.println(sql);
                        PreparedStatement ps = dButil.getPs(sql);
                        setVisible(false);
                        try {
                            ps.executeUpdate();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }finally {
                            dButil.closeAll();
                        }
                    }
                }
        );
        setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
