import util.DButil;
import util.MD5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * Created by JFormDesigner on Sun May 02 21:50:27 CST 2021
 */


/**
 * @author 1
 */
public class Form extends JFrame {
    public static void main(String[] args) {
        new Form();
    }

    public Form() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem10 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menu2 = new JMenu();
        menuItem4 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menu3 = new JMenu();
        menuItem7 = new JMenuItem();
        menuItem8 = new JMenuItem();
        menuItem9 = new JMenuItem();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField("lsy");
        textField2 = new JTextField("1111");
        button1 = new JButton();
        button2 = new JButton();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label4 = new JLabel();
        button3 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u7528\u6237\u7ba1\u7406");

                //---- menuItem1 ----
                menuItem1.setText("\u67e5\u770b\u7528\u6237");
                menu1.add(menuItem1);

                //---- menuItem10 ----
                menuItem10.setText("\u4fee\u6539\u7528\u6237");
                menu1.add(menuItem10);

                //---- menuItem2 ----
                menuItem2.setText("\u6dfb\u52a0\u7528\u6237");
                menu1.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("\u5220\u9664\u7528\u6237");
                menu1.add(menuItem3);
            }

            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u5546\u54c1\u7ba1\u7406");

                //---- menuItem4 ----
                menuItem4.setText("\u67e5\u770b\u5e93\u5b58");
                menu2.add(menuItem4);

                //---- menuItem5 ----
                menuItem5.setText("\u6dfb\u52a0\u5546\u54c1");
                menu2.add(menuItem5);

                //---- menuItem6 ----
                menuItem6.setText("\u5220\u9664\u5546\u54c1");
                menu2.add(menuItem6);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("\u9500\u552e\u7ba1\u7406");

                //---- menuItem7 ----
                menuItem7.setText("text");
                menu3.add(menuItem7);

                //---- menuItem8 ----
                menuItem8.setText("text");
                menu3.add(menuItem8);

                //---- menuItem9 ----
                menuItem9.setText("text");
                menu3.add(menuItem9);
            }
            menuBar1.add(menu3);
        }

        //查看用户
        menuItem1.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) { }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        label3.setVisible(false);
                        label4.setVisible(true);
                        scrollPane1.setVisible(true);
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) { }
                    @Override
                    public void mouseEntered(MouseEvent e) { }
                    @Override
                    public void mouseExited(MouseEvent e) { }}
        );

        //添加用户
        menuItem2.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) { }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        adduser au = new adduser();
                        au.setVisible(true);
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) { }
                    @Override
                    public void mouseEntered(MouseEvent e) { }
                    @Override
                    public void mouseExited(MouseEvent e) { }}
        );

        //删除用户
        menuItem3.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) { }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        int count=table1.getSelectedRow();//获取你选中的行号（记录）
                        String id= table1.getValueAt(count, 0).toString();//读取你获取行号的某一列的值（也就是字段）
                        DButil dButil = new DButil();
                        String sql = "delete from users where id= "+id+";";
                        System.out.println(sql);
                        PreparedStatement ps = dButil.getPs(sql);
                        table1.repaint();
                        table1.updateUI();

                        try {
                            ps.executeUpdate();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }finally {
                            dButil.closeAll();
                        }
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) { }
                    @Override
                    public void mouseEntered(MouseEvent e) { }
                    @Override
                    public void mouseExited(MouseEvent e) { }}
        );

        //修改用户
        menuItem10.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) { }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        modifyuser mu = new modifyuser();
                        mu.setVisible(true);
                    }
                    @Override
                    public void mouseReleased(MouseEvent e) { }
                    @Override
                    public void mouseEntered(MouseEvent e) { }
                    @Override
                    public void mouseExited(MouseEvent e) { }}
        );

        menuBar1.setVisible(false);
        setJMenuBar(menuBar1);

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 6f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(5, 335), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u5bc6\u7801");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 6f));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(135, 335), label2.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(65, 335, 55, 26);
        contentPane.add(textField2);
        textField2.setBounds(195, 335, 85, 25);

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(295, 335), button1.getPreferredSize()));
        /*
        给登录按钮添加监听事件
         */
        button1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
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
                                menuBar1.setVisible(true);
                                textField1.setText("******");
                                textField2.setText("******");
                            }
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        } catch (NoSuchAlgorithmException ex) {
                            ex.printStackTrace();
                        } catch (UnsupportedEncodingException ex) {
                            ex.printStackTrace();
                        }finally {
                            dButil.closeAll();
                        }
                    }
                }
        );

        //---- button2 ----
        button2.setText("\u9000\u51fa");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(505, 335), button2.getPreferredSize()));

        //---- label3 ----
        label3.setText("\u6d77\u6f9c\u4e4b\u5bb6");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 85f));
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(100, 115), label3.getPreferredSize()));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(60, 85, scrollPane1.getPreferredSize().width, 215);
        scrollPane1.setVisible(false);

        //---- 从数据库中获得数据并放在表格中 ----
        DefaultTableModel tableModel = new DefaultTableModel(queryData(), head) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(tableModel);

        //---- label4 ----
        label4.setText("\u7528\u6237\u4fe1\u606f");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 17f));
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(225, 20), label4.getPreferredSize()));
        label4.setVisible(false);

        //---- button3 ----
        button3.setText("\u5237\u65b0");
        contentPane.add(button3);
        button3.setBounds(new Rectangle(new Point(385, 335), button3.getPreferredSize()));
        button3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        DefaultTableModel tableModel = new DefaultTableModel(queryData(), head) {
                            public boolean isCellEditable(int row, int column) {
                                return false;
                            }
                        };
                        table1.setModel(tableModel);
                    }
                }
        );

        contentPane.setPreferredSize(new Dimension(615, 430));
        pack();
        setLocationRelativeTo(getOwner());
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public Object[][] queryData() {
        java.util.List<Users> list = new ArrayList<Users>();
        DButil util = new DButil();
        String sql = "select * from users;";
        PreparedStatement ps = util.getPs(sql);
        ResultSet rs = null;
        try {
            rs = util.getRs(ps.executeQuery());
            while (rs.next()){
                Users user = new Users();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            util.closeAll();
        }

        data = new Object[list.size()][head.length];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < head.length; j++) {
                data[i][0] = list.get(i).getId();
                data[i][1] = list.get(i).getUsername();
                data[i][2] = list.get(i).getPassword();
            }
        }
        return data;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem10;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenu menu2;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenu menu3;
    private JMenuItem menuItem7;
    private JMenuItem menuItem8;
    private JMenuItem menuItem9;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label4;
    private JButton button3;
    private Object[][] data = null;
    private String head[] = {"id", "username", "password"};
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}