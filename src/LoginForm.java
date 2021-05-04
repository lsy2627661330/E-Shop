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
 * Created by JFormDesigner on Sun May 02 21:50:27 CST 2021
 */



/**
 * @author 1
 */
public class LoginForm extends JFrame {
    public static void main(String[] args) {
        new LoginForm();
    }
    public LoginForm() { initComponents(); }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField("lsy");
        textField2 = new JTextField("1111");
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setResizable(false);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- 用户名 ----
        label1.setText("\u7528\u6237\u540d");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 14f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(55, 50), label1.getPreferredSize()));

        //---- 密码 ----
        label2.setText("\u5bc6\u7801");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 14f));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(65, 95), label2.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(150, 50, 155, 31);
        contentPane.add(textField2);
        textField2.setBounds(150, 100, 155, 30);

        //---- 登录按钮 ----
        button1.setText("\u767b\u5f55");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(140, 165), button1.getPreferredSize()));
        /*
        给登录按钮添加监听事件
        */
        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String username = textField1.getText();
                        String password = textField2.getText();
                        Util util = new Util();
                        String sql = "select password from users where username = '"+username+"';";
                        //System.out.println(sql);
                        PreparedStatement ps = util.getPs(sql);
                        try {
                            ResultSet rs = util.getRs(ps.executeQuery());
                            rs.next();
                            String encodepassword = rs.getString(1);
                            if  (MD5.checkpassword(password,encodepassword)){
                                System.out.println("登陆成功...");
                                setVisible(false);
                                MainForm mf = new MainForm();
                                mf.setVisible(true);
                            }else {
                                System.out.println("登陆失败...");
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        } catch (NoSuchAlgorithmException ex) {
                            ex.printStackTrace();
                        } catch (UnsupportedEncodingException ex) {
                            ex.printStackTrace();
                        }finally {
                            util.closeAll();
                        }
                    }
                }
        );
        //---- 注册按钮 ----
        button2.setText("\u6ce8\u518c");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(230, 165), button2.getPreferredSize()));

        contentPane.setPreferredSize(new Dimension(400, 260));
        pack();
        setLocationRelativeTo(getOwner());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
