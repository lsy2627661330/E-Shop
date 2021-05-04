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
import java.util.List;
/*
 * Created by JFormDesigner on Mon May 03 14:28:47 CST 2021
 */


/**
 * @author 1
 */
public class MainForm extends JFrame {
    public MainForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();//用户管理
        menuItem1 = new JMenuItem();//添加用户
        menuItem2 = new JMenuItem();//查看用户
        menuItem3 = new JMenuItem();//修改密码
        menuItem6 = new JMenuItem();//退出
        menu2 = new JMenu();//商品管理
        menuItem4 = new JMenuItem();//添加商品
        menuItem5 = new JMenuItem();//查看库存
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label2 = new JLabel();
        button1 = new JButton();//刷新按钮
        button2 = new JButton();//添加按钮

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {

            //======== 用户管理 ========
            {
                menu1.setText("\u7528\u6237\u7ba1\u7406");

                //---- 添加用户 ----
                menuItem1.setText("\u6dfb\u52a0\u7528\u6237");
                menu1.add(menuItem1);

                //---- 查看用户 ----
                /*menuItem2.setText("\u67e5\u770b\u7528\u6237");
                menu1.add(menuItem2);*/
                JMenuItem menuItem2 = new JMenuItem("\u67e5\u770b\u7528\u6237");
                menu1.add(menuItem2);
                menuItem2.addMouseListener(
                        new MouseListener() {
                            @Override
                            public void mouseClicked(MouseEvent e) {

                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                //System.out.println("ddddddddddd");
                                label2.setVisible(false);
                                label1.setVisible(true);
                                scrollPane1.setVisible(true);
                                button1.setVisible(true);
                                button2.setVisible(true);
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

                //---- 修改密码 ----
                menuItem3.setText("\u4fee\u6539\u5bc6\u7801");
                menu1.add(menuItem3);

                //---- 添加分隔符 ----
                menu1.addSeparator();


                //---- 退出 ----
                menuItem6.setText("\u9000\u51fa");
                menu1.add(menuItem6);
            }
            menuBar1.add(menu1);

            //======== 商品管理 ========
            {
                menu2.setText("\u5546\u54c1\u7ba1\u7406");

                //---- 添加商品 ----
                menuItem4.setText("\u6dfb\u52a0\u5546\u54c1");
                menu2.add(menuItem4);

                //---- 查看库存 ----
                menuItem5.setText("\u67e5\u770b\u5e93\u5b58");
                menu2.add(menuItem5);
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        //---- 用户信息 ----
        label1.setText("\u7528\u6237\u4fe1\u606f");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 24f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(200, 20), label1.getPreferredSize()));
        label1.setVisible(false);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(60, 75, scrollPane1.getPreferredSize().width, 180);
        scrollPane1.setVisible(false);

        //---- 从数据库中获得数据并放在表格中 ----
        DefaultTableModel tableModel = new DefaultTableModel(queryData(), head) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(tableModel);


        //---- 桂电电子小卖铺 ----
        label2.setText("\u6842\u7535\u7535\u5b50\u5c0f\u5356\u94fa");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 65f));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(15, 110), label2.getPreferredSize()));
        label2.setVisible(true);

        //---- 刷新按钮 ----
        button1.setText("\u5237\u65b0");
        contentPane.add(button1);
        button1.addActionListener(
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
        button1.setBounds(new Rectangle(new Point(170, 280), button1.getPreferredSize()));
        button1.setVisible(false);

        //---- 添加按钮 ----
        button2.setText("\u6dfb\u52a0");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(325, 280), button2.getPreferredSize()));
        button2.setVisible(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane.setPreferredSize(new Dimension(620, 395));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public Object[][] queryData() {
        List<Users> list = new ArrayList<Users>();
        Util util = new Util();
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
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem6;
    private JMenu menu2;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private Object[][] data = null;
    private String head[] = {"id", "username", "password"};
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
