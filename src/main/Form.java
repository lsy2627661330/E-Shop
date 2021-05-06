package main;

import pay.Pay;
import product.Stock;
import product.addproduct;
import product.modifyproduct;
import sales.Corsor;
import user.Users;
import user.adduser;
import user.modifyuser;
import util.DButil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

    public Form() {
        initComponents();
    }

    private void initComponents() {
        {
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
            menuItem11 = new JMenuItem();
            menu3 = new JMenu();
            menuItem12 = new JMenuItem();
            menuItem7 = new JMenuItem();
            menuItem8 = new JMenuItem();
            menuItem9 = new JMenuItem();
            label3 = new JLabel();
            scrollPane1 = new JScrollPane();
            table1 = new JTable();
            label4 = new JLabel();
            button3 = new JButton();
            label5 = new JLabel();
            scrollPane2 = new JScrollPane();
            table2 = new JTable();
            scrollPane3 = new JScrollPane();
            table3 = new JTable();
            label1 = new JLabel();
            label2 = new JLabel();
            label6 = new JLabel();
            textField1 = new JTextField();
            button1 = new JButton();
            textField2 = new JTextField();
            button2 = new JButton();
            textField3 = new JTextField();
            button4 = new JButton();
            button5 = new JButton();
            scrollPane4 = new JScrollPane();
            table4 = new JTable();
            button6 = new JButton();
            label7 = new JLabel();
            scrollPane5 = new JScrollPane();
            table5 = new JTable();

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
                    menu2.setText("\u5e93\u5b58\u7ba1\u7406");

                    //---- menuItem4 ----
                    menuItem4.setText("\u67e5\u770b\u5e93\u5b58");
                    menu2.add(menuItem4);

                    //---- menuItem5 ----
                    menuItem5.setText("\u6dfb\u52a0\u5546\u54c1");
                    menu2.add(menuItem5);

                    //---- menuItem6 ----
                    menuItem6.setText("\u4fee\u6539\u5546\u54c1");
                    menu2.add(menuItem6);

                    //---- menuItem11 ----
                    menuItem11.setText("\u5220\u9664\u5546\u54c1");
                    menu2.add(menuItem11);
                }
                menuBar1.add(menu2);

                //======== menu3 ========
                {
                    menu3.setText("\u9500\u552e\u7ba1\u7406");

                    //---- menuItem12 ----
                    menuItem12.setText("\u5f00\u59cb\u552e\u8d27");
                    menu3.add(menuItem12);

                    //---- menuItem7 ----
                    menuItem7.setText("\u6dfb\u52a0\u8bb0\u5f55");
                    menu3.add(menuItem7);

                    //---- menuItem8 ----
                    menuItem8.setText("\u4fee\u6539\u8bb0\u5f55");
                    menu3.add(menuItem8);

                    //---- menuItem9 ----
                    menuItem9.setText("\u5220\u9664\u8bb0\u5f55");
                    menu3.add(menuItem9);
                }
                menuBar1.add(menu3);
            }
            setJMenuBar(menuBar1);

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
            scrollPane1.setBounds(40, 80, 480, 250);

            //---- label4 ----
            label4.setText("\u7528\u6237\u4fe1\u606f");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 17f));
            contentPane.add(label4);
            label4.setBounds(new Rectangle(new Point(225, 20), label4.getPreferredSize()));

            //---- button3 ----
            button3.setText("\u5237\u65b0");
            button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 5f));
            contentPane.add(button3);
            button3.setBounds(550, 10, button3.getPreferredSize().width, 40);

            //---- label5 ----
            label5.setText("\u5e93\u5b58\u4fe1\u606f");
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 17f));
            contentPane.add(label5);
            label5.setBounds(new Rectangle(new Point(225, 20), label5.getPreferredSize()));

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(table2);
            }
            contentPane.add(scrollPane2);
            scrollPane2.setBounds(40, 80, 480, 250);

            //======== scrollPane3 ========
            {
                scrollPane3.setViewportView(table3);
            }
            contentPane.add(scrollPane3);
            scrollPane3.setBounds(15, 50, scrollPane3.getPreferredSize().width, 178);

            //---- label1 ----
            label1.setText("\u73b0\u6709\u5546\u54c1");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 8f));
            contentPane.add(label1);
            label1.setBounds(new Rectangle(new Point(15, 15), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText("\u8ba2\u5355\u4fe1\u606f");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 8f));
            contentPane.add(label2);
            label2.setBounds(new Rectangle(new Point(15, 235), label2.getPreferredSize()));

            //---- label6 ----
            label6.setText("\u9500\u552e\u8bb0\u5f55");
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 17f));
            contentPane.add(label6);
            label6.setBounds(new Rectangle(new Point(255, 15), label6.getPreferredSize()));
            contentPane.add(textField1);
            textField1.setBounds(555, 80, 60, textField1.getPreferredSize().height);

            //---- button1 ----
            button1.setText("\u6dfb\u52a0");
            contentPane.add(button1);
            button1.setBounds(555, 110, 60, button1.getPreferredSize().height);
            contentPane.add(textField2);
            textField2.setBounds(555, 145, 60, textField2.getPreferredSize().height);

            //---- button2 ----
            button2.setText("\u5220\u9664");
            contentPane.add(button2);
            button2.setBounds(555, 180, 62, button2.getPreferredSize().height);
            contentPane.add(textField3);
            textField3.setBounds(555, 215, 60, textField3.getPreferredSize().height);

            //---- button4 ----
            button4.setText("\u4fee\u6539");
            contentPane.add(button4);
            button4.setBounds(new Rectangle(new Point(555, 250), button4.getPreferredSize()));

            //---- button5 ----
            button5.setText("\u652f\u4ed8");
            button5.setFont(button5.getFont().deriveFont(button5.getFont().getSize() + 4f));
            contentPane.add(button5);
            button5.setBounds(540, 295, 70, 45);

            //======== scrollPane4 ========
            {
                scrollPane4.setViewportView(table4);
            }
            contentPane.add(scrollPane4);
            scrollPane4.setBounds(15, 265, scrollPane4.getPreferredSize().width, 158);

            //---- button6 ----
            button6.setText("\u786e\u8ba4");
            button6.setFont(button6.getFont().deriveFont(button6.getFont().getSize() + 6f));
            contentPane.add(button6);
            button6.setBounds(535, 355, 80, 50);

            //---- label7 ----
            label7.setText("\u6ca1\u6709\u9009\u62e9\u8bb0\u5f55");
            label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 20f));
            contentPane.add(label7);
            label7.setBounds(165, 170, 210, 60);

            contentPane.setPreferredSize(new Dimension(630, 430));
            pack();
            setLocationRelativeTo(getOwner());

            //======== scrollPane5 ========
            {
                scrollPane5.setViewportView(table5);
            }
        }// JFormDesigner - End of component initialization  //GEN-END:initComponents


        //================================================ 用户管理 =================================================
        {
            //查看用户
            menuItem1.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            label3.setVisible(false);
                            label4.setVisible(true);
                            scrollPane1.setVisible(true);
                            scrollPane2.setVisible(false);
                            label5.setVisible(false);
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );

            //添加用户
            menuItem2.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            adduser au = new adduser();
                            au.setVisible(true);
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );

            //删除用户
            menuItem3.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            int count = table1.getSelectedRow();//获取你选中的行号（记录）
                            String id = table1.getValueAt(count, 0).toString();//读取你获取行号的某一列的值（也就是字段）

                            DButil dButil = new DButil();
                            String sql = "delete from users where id= '" + id + "';";
                            System.out.println(sql);
                            PreparedStatement ps = dButil.getPs(sql);

                            try {
                                ps.executeUpdate();
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            } finally {
                                dButil.closeAll();
                            }
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );

            //修改用户
            menuItem10.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            modifyuser mu = new modifyuser();
                            mu.setVisible(true);
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );
        }

        //================================================ 库存管理 =================================================
        {
            //查看库存
            menuItem4.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            label3.setVisible(false);
                            label4.setVisible(false);
                            scrollPane1.setVisible(false);
                            scrollPane2.setVisible(true);
                            label5.setVisible(true);
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );

            //添加商品
            menuItem5.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            addproduct ap = new addproduct();
                            ap.setVisible(true);

                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );

            //修改商品
            menuItem6.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            modifyproduct mp = new modifyproduct();
                            mp.setVisible(true);
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );

            //删除商品
            menuItem11.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            int count = table2.getSelectedRow();//获取你选中的行号（记录）
                            String code = table2.getValueAt(count, 0).toString();//读取你获取行号的某一列的值（也就是字段）
                            DButil dButil = new DButil();
                            String sql = "delete from stock where code= '" + code + "';";
                            System.out.println(sql);
                            PreparedStatement ps = dButil.getPs(sql);
                            table1.repaint();
                            table1.updateUI();

                            try {
                                ps.executeUpdate();
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            } finally {
                                dButil.closeAll();
                            }
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );
        }

        //================================================ 销售管理 =================================================
        {

            //开始售货
            menuItem12.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            scrollPane3.setVisible(true);
                            scrollPane4.setVisible(true);
                            label3.setVisible(false);
                            label1.setVisible(true);
                            label2.setVisible(true);
                            button1.setVisible(true);
                            button2.setVisible(true);
                            button4.setVisible(true);
                            button5.setVisible(true);
                            button6.setVisible(true);
                            label4.setVisible(false);
                            label5.setVisible(false);
                            scrollPane1.setVisible(false);
                            scrollPane2.setVisible(false);
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );

        }

        //================================================   Form   =================================================
        {
            //给menuBar1添加监听器
            menuBar1.addMouseListener(
                    new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {
                            button3.setVisible(true);
                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                        }
                    }
            );

            //刷新按钮
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

                            DefaultTableModel tableModel1 = new DefaultTableModel(queryData1(), head1) {
                                public boolean isCellEditable(int row, int column) {
                                    return false;
                                }
                            };
                            table2.setModel(tableModel1);
                        }
                    }
            );

            button5.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Pay pay = new Pay();
                            pay.setVisible(true);
                        }
                    }
            );

            //---- 用户信息：从数据库中获得数据并放在表格中 ----
            DefaultTableModel tableModel = new DefaultTableModel(queryData(), head) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            table1.setModel(tableModel);

            //---- 库存信息：从数据库中获得数据并放在表格中 ----
            DefaultTableModel tableModel1 = new DefaultTableModel(queryData1(), head1) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            table2.setModel(tableModel1);

            //现有商品
            DefaultTableModel tableModel2 = new DefaultTableModel(queryData2(), head2) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            table3.setModel(tableModel2);

            //订单记录表
            DefaultTableModel tableModel3 = new DefaultTableModel(queryData3(), head3) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            table4.setModel(tableModel3);

            //==========================================  组件显示与隐藏  ===========================================
            {
                setVisible(true);
                scrollPane1.setVisible(false);
                scrollPane2.setVisible(false);
                scrollPane3.setVisible(false);
                scrollPane4.setVisible(false);
                scrollPane5.setVisible(false);
                label1.setVisible(false);
                label2.setVisible(false);
                label4.setVisible(false);
                label5.setVisible(false);
                label6.setVisible(false);
                label7.setVisible(false);
                textField1.setVisible(false);
                textField2.setVisible(false);
                textField3.setVisible(false);
                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                button6.setVisible(false);


                setResizable(false);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }
    }

    //用户信息表
    public Object[][] queryData() {
        java.util.List<Users> list = new ArrayList<Users>();
        DButil util = new DButil();
        String sql = "select * from users;";
        PreparedStatement ps = util.getPs(sql);
        ResultSet rs = null;
        try {
            rs = util.getRs(ps.executeQuery());
            while (rs.next()) {
                Users user = new Users();
                user.setId(rs.getString(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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

    //库存信息表
    public Object[][] queryData1() {
        java.util.List<Stock> list = new ArrayList<Stock>();
        DButil util = new DButil();
        String sql = "select * from stock;";
        PreparedStatement ps = util.getPs(sql);
        ResultSet rs = null;
        try {
            rs = util.getRs(ps.executeQuery());
            while (rs.next()) {
                Stock stock = new Stock();
                stock.setCode(rs.getString(1));
                stock.setName(rs.getString(2));
                stock.setAmt(rs.getString(3));
                stock.setPprice(rs.getString(4));
                stock.setSprice(rs.getString(5));
                list.add(stock);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.closeAll();
        }

        data1 = new Object[list.size()][head1.length];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < head1.length; j++) {
                data1[i][0] = list.get(i).getCode();
                data1[i][1] = list.get(i).getName();
                data1[i][2] = list.get(i).getAmt();
                data1[i][3] = list.get(i).getPprice();
                data1[i][4] = list.get(i).getSprice();
            }
        }
        return data1;
    }

    //现有商品信息表
    public Object[][] queryData2() {
        java.util.List<Stock> list = new ArrayList<Stock>();
        DButil util = new DButil();
        String sql = "select code,name,amt,sprice from stock;";
        PreparedStatement ps = util.getPs(sql);
        ResultSet rs = null;
        try {
            rs = util.getRs(ps.executeQuery());
            while (rs.next()) {
                Stock stock = new Stock();
                stock.setCode(rs.getString(1));
                stock.setName(rs.getString(2));
                stock.setAmt(rs.getString(3));
                stock.setSprice(rs.getString(4));
                list.add(stock);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.closeAll();
        }

        data2 = new Object[list.size()][head2.length];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < head2.length; j++) {
                data2[i][0] = list.get(i).getCode();
                data2[i][1] = list.get(i).getName();
                data2[i][2] = list.get(i).getAmt();
                data2[i][3] = list.get(i).getSprice();
            }
        }
        return data2;
    }

    //订单记录表
    public Object[][] queryData3() {
        java.util.List<Corsor> list = new ArrayList<Corsor>();
        DButil util = new DButil();
        String sql = "select * from corsor;";
        PreparedStatement ps = util.getPs(sql);
        ResultSet rs = null;
        try {
            rs = util.getRs(ps.executeQuery());
            while (rs.next()) {
                Corsor corsor = new Corsor();
                corsor.setCode(rs.getString(1));
                corsor.setName(rs.getString(2));
                corsor.setPrice(rs.getString(3));
                corsor.setNum(rs.getInt(4));
                corsor.setTotal(rs.getString(5));
                list.add(corsor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.closeAll();
        }

        data1 = new Object[list.size()][head1.length];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < head1.length; j++) {
                data1[i][0] = list.get(i).getCode();
                data1[i][1] = list.get(i).getName();
                data1[i][2] = list.get(i).getPrice();
                data1[i][3] = list.get(i).getNum();
                data1[i][4] = list.get(i).getTotal();
            }
        }
        return data1;
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
    private JMenuItem menuItem11;
    private JMenu menu3;
    private JMenuItem menuItem12;
    private JMenuItem menuItem7;
    private JMenuItem menuItem8;
    private JMenuItem menuItem9;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label4;
    private JButton button3;
    private JLabel label5;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JScrollPane scrollPane3;
    private JTable table3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label6;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JButton button2;
    private JTextField textField3;
    private JButton button4;
    private JButton button5;
    private JScrollPane scrollPane4;
    private JTable table4;
    private JButton button6;
    private JLabel label7;
    private JScrollPane scrollPane5;
    private JTable table5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    //用户信息表
    private Object[][] data = null;
    private String head[] = {"编号", "用户名", "密码"};
    //库存信息表
    private Object[][] data1 = null;
    private String[] head1 = {"编号", "名称", "数量", "进货价", "销售价"};
    //现有商品信息表
    private Object[][] data2 = null;
    private String[] head2 = {"编号", "名称", "数量","价格"};
    //订单记录表
    private Object[][] data3 = null;
    private String[] head3 = {"编号", "名称", "单价", "数量", "总计"};

    public static void main(String[] args) {
        new Form();
    }
}

