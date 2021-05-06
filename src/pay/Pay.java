/*
 * Created by JFormDesigner on Thu May 06 16:38:14 CST 2021
 */

package pay;

import util.ShouQRCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * @author 1
 */
public class Pay extends JFrame {
    public Pay() {
        initComponents();
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
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setFont(new Font(Font.DIALOG, Font.PLAIN, 14));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u603b\u989d\uff1a");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 14f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(45, 40), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u652f\u4ed8\uff1a");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 14f));
        contentPane.add(label2);
        label2.setBounds(45, 90, 78, 31);

        //---- label3 ----
        label3.setText("\u627e\u96f6\uff1a");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 14f));
        contentPane.add(label3);
        label3.setBounds(45, 145, 78, 31);
        contentPane.add(textField1);
        textField1.setBounds(130, 40, 75, 30);
        contentPane.add(textField2);
        textField2.setBounds(130, 90, 75, 30);
        contentPane.add(textField3);
        textField3.setBounds(130, 145, 75, 30);

        //---- button1 ----
        button1.setText("\u73b0\u91d1\u652f\u4ed8");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 12f));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(250, 35), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u4ed8\u6b3e\u7801\u652f\u4ed8");
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 12f));
        contentPane.add(button2);
        button2.setBounds(235, 85, 160, 37);

        //---- button3 ----
        button3.setText("\u626b\u7801\u652f\u4ed8");
        button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 12f));
        contentPane.add(button3);
        button3.setBounds(250, 140, 129, 37);

        contentPane.setPreferredSize(new Dimension(400, 270));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        setVisible(true);
        button2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String total = textField1.getText();
                        System.out.println(total);
                        Thread thread1 =new Thread(
                                new Runnable() {
                                    @Override
                                    public void run() {
                                        Main main = new Main();
                                        main.test_trade_precreate(total);
                                        java.util.List<File> qrCodeList = ShouQRCode.getFileSort("C://Users//LSY66/Desktop/电子商城");
                                        System.out.println(qrCodeList.get(qrCodeList.size()-1).getAbsolutePath());
                                        paymentCodeForm = new PaymentCodeForm(qrCodeList.get(qrCodeList.size()-1).getAbsolutePath());
                                    }
                                }
                        );
                        thread1.start();
                        try {
                            thread1.join();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        Thread thread2 = new Thread(
                                new Runnable() {
                                    @Override
                                    public void run() {
                                        paymentCodeForm.setVisible(true);
                                    }
                                }
                        );
                        thread2.start();
                    }
                }
        );
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    PaymentCodeForm  paymentCodeForm = null;
    public static void main(String[] args) {
        new Pay();
    }
}
