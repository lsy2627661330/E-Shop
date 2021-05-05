/*
 * Created by JFormDesigner on Wed May 05 15:20:12 CST 2021
 */

import util.DButil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 1
 */
public class addproduct extends JFrame {
    public addproduct() {
        initComponents();
    }

    public static void main(String[] args) {
        new addproduct();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u7f16\u53f7\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 6f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(65, 15), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u540d\u79f0\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 6f));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(65, 55), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("\u6570\u91cf\uff1a");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 6f));
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(65, 95), label3.getPreferredSize()));

        //---- label4 ----
        label4.setText("\u8fdb\u8d27\u4ef7\uff1a");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 6f));
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(60, 130), label4.getPreferredSize()));

        //---- label5 ----
        label5.setText("\u9500\u552e\u4ef7\uff1a");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 6f));
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(60, 170), label5.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(145, 10, 130, 26);
        contentPane.add(textField2);
        textField2.setBounds(145, 50, 130, 26);
        contentPane.add(textField3);
        textField3.setBounds(145, 90, 130, 26);
        contentPane.add(textField4);
        textField4.setBounds(145, 125, 130, 26);
        contentPane.add(textField5);
        textField5.setBounds(145, 165, 130, 26);

        //---- button1 ----
        button1.setText("\u6dfb\u52a0");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 6f));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(155, 215), button1.getPreferredSize()));

        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String code = textField1.getText();
                        String name = textField2.getText();
                        String amt = textField3.getText();
                        String pprice = textField4.getText();
                        String sprice = textField5.getText();
                        DButil dButil = new DButil();
                        String sql = "insert into stock values('"+code+"','"+name+"','"+amt+"','"+pprice+"','"+sprice+"');";
                        System.out.println(sql);
                        PreparedStatement ps = dButil.getPs(sql);
                        setVisible(false);
                        setResizable(false);
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
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
