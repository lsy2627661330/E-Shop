/*
 * Created by JFormDesigner on Thu May 06 17:24:51 CST 2021
 */

package pay;

import javax.swing.*;
import java.awt.*;


/**
 * @author 1
 */
public class PaymentCodeForm extends JFrame {

    public PaymentCodeForm(String qrCodePath) {
        initComponents(qrCodePath);
    }

    private void initComponents(String qrCodePath) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        contentPane.setPreferredSize(new Dimension(380, 370));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        setBak(qrCodePath); // 调用背景方法
        JPanel jp = new JPanel(); // 创建个JPanel
        jp.setOpaque(false); // 把JPanel设置为透明 这样就不会遮住后面的背景 这样你就能在JPanel随意加组件了
        contentPane.add(jp);

    }
    public void setBak(String qrCodePath) {
        ((JPanel) this.getContentPane()).setOpaque(false);
        ImageIcon img = new ImageIcon(qrCodePath);

        JLabel background = new JLabel(img);
        this.getLayeredPane().add(background, Integer.valueOf(Integer.MIN_VALUE));
        background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // JFormDesigner - End of variables declaration  //GEN-END:variables
   /* public static void main(String[] args) {
        new PaymentCodeForm("C://Users//LSY66/Desktop/电子商城");
    }*/
}
