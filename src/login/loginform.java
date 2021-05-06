package login;

import main.Form;
import util.DButil;
import util.MD5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * Created by JFormDesigner on Wed May 05 20:17:08 CST 2021
 */



/**
 * @author 1
 */
public class loginform extends JFrame {
    public loginform() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();

        //======== this ========
        setTitle("\uff1a");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(70, 80), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u5bc6\u7801\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 10f));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(80, 135), label2.getPreferredSize()));

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 10f));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(165, 190), button1.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(165, 80, 125, 30);
        contentPane.add(textField2);
        textField2.setBounds(165, 135, 125, 31);

        contentPane.setPreferredSize(new Dimension(400, 280));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField1.setText("lsy");
                        textField2.setText("1111");
                        String username = textField1.getText();
                        String password = textField2.getText();
                        DButil dButil = new DButil();
                        String sql = "select password from users where username = '" + username + "';";
                        System.out.println(sql);
                        PreparedStatement ps = dButil.getPs(sql);
                        try {
                            ResultSet rs = dButil.getRs(ps.executeQuery());
                            rs.next();
                            String encodepassword = rs.getString(1);
                            MD5 md5 = new MD5();
                            if (md5.checkpassword(password, encodepassword)) {
                                System.out.println("登陆成功...");
                                Form form = new Form();
                                form.setVisible(true);
                                setVisible(false);
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        } catch (NoSuchAlgorithmException ex) {
                            ex.printStackTrace();
                        } catch (UnsupportedEncodingException ex) {
                            ex.printStackTrace();
                        } finally {
                            dButil.closeAll();
                        }
                    }
                }
        );

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new loginform();
    }
}
