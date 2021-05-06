package sales;

import util.DButil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * Created by JFormDesigner on Wed May 05 13:40:10 CST 2021
 */



/**
 * @author 1
 */
public class sales extends JFrame {
    public sales() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        scrollPane3 = new JScrollPane();
        table3 = new JTable();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        textField2 = new JTextField();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        menu2 = new JMenu();
        radioButtonMenuItem1 = new JRadioButtonMenuItem();
        label3 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u9500\u552e\u4fe1\u606f");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 17f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(250, 25), label1.getPreferredSize()));

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(table2);
        }
        contentPane.add(scrollPane2);
        scrollPane2.setBounds(15, 45, scrollPane2.getPreferredSize().width, 165);

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(table3);
        }
        contentPane.add(scrollPane3);
        scrollPane3.setBounds(15, 230, scrollPane3.getPreferredSize().width, 163);

        //---- label2 ----
        label2.setText("\u5f53\u524d\u5b58\u5728\u5546\u54c1");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 7f));
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(185, 10), label2.getPreferredSize()));
        contentPane.add(textField1);
        textField1.setBounds(555, 80, 55, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u6dfb\u52a0");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(555, 115), button1.getPreferredSize()));
        contentPane.add(textField2);
        textField2.setBounds(555, 150, 55, textField2.getPreferredSize().height);

        //---- button2 ----
        button2.setText("\u5220\u9664");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(555, 190), button2.getPreferredSize()));

        //---- button3 ----
        button3.setText("\u652f\u4ed8");
        contentPane.add(button3);
        button3.setBounds(550, 265, 75, 40);

        //---- button4 ----
        button4.setText("\u786e\u8ba4\u6536\u6b3e");
        contentPane.add(button4);
        button4.setBounds(550, 340, button4.getPreferredSize().width, 33);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(25, 85, 625, 325);

        //======== menu2 ========
        {
            menu2.setText("text");
        }
        contentPane.add(menu2);
        menu2.setBounds(new Rectangle(new Point(620, -20), menu2.getPreferredSize()));

        //---- radioButtonMenuItem1 ----
        radioButtonMenuItem1.setText("text");
        contentPane.add(radioButtonMenuItem1);
        radioButtonMenuItem1.setBounds(new Rectangle(new Point(40, -20), radioButtonMenuItem1.getPreferredSize()));

        //---- label3 ----
        label3.setText("text");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(30, -20), label3.getPreferredSize()));

        contentPane.setPreferredSize(new Dimension(670, 430));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        //---- 从数据库中获得数据并放在表格中 ----
        DefaultTableModel tableModel1 = new DefaultTableModel(queryData1(), head1) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(tableModel1);

        setVisible(true);


    }

    public Object[][] queryData1() {
        java.util.List<Sale> list = new ArrayList<Sale>();
        DButil util = new DButil();
        String sql = "select code,name,sprice,num,total,SUBSTR(date,6) date from sales;";
        PreparedStatement ps = util.getPs(sql);
        System.out.println(sql);
        ResultSet rs = null;
        try {
            rs = util.getRs(ps.executeQuery());
            while (rs.next()) {
                Sale sale =new Sale();
                sale.setCode(rs.getString(1));
                sale.setName(rs.getString(2));
                sale.setSprice(rs.getString(3));
                sale.setCum(rs.getInt(4));
                sale.setTotl(rs.getDouble(5));
                sale.setDate(rs.getString(6));
                list.add(sale);
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
                data1[i][2] = list.get(i).getSprice();
                data1[i][3] = list.get(i).getCum();
                data1[i][4] = list.get(i).getTotl();
                data1[i][5] = list.get(i).getDate();
            }
        }
        return data1;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JScrollPane scrollPane3;
    private JTable table3;
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JMenu menu2;
    private JRadioButtonMenuItem radioButtonMenuItem1;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Object[][] data1 = null;
    private String[] head1 = {"编号", "名称", "价格", "数量", "总计","时间"};

    public static void main(String[] args) {
        new sales();
    }


}
