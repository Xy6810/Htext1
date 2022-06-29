package T1;
import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] arges){
        JFrame f = new JFrame("JFrame");
        f.setLayout(null);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setSize(300,400);                 //面板


        JLabel labelUsername = new JLabel("用户名: ");
        JTextField tfdUsername = new JTextField(10);
        JPanel p1 = new JPanel();
        p1.add(labelUsername);
        p1.add(tfdUsername);
        JLabel labelPwd = new JLabel("口 令: ");
        JPasswordField pfdpwd = new JPasswordField(10);
        pfdpwd.setEchoChar('&');
        JPanel p2 = new JPanel();
        p2.add(labelPwd);
        p2.add(pfdpwd);
        f.add(p1);
        f.add(p2);

        //用户

        JPanel p3 = new JPanel();
        p3.add(new JLabel("性别: "));
        ButtonGroup majorGroup = new ButtonGroup();
        String[] buttonsText = { "男" , "女"};
        JRadioButton[] buttons = new JRadioButton[buttonsText.length];
        for (int i = 0; i < buttons.length; i++){
            buttons[i] = new JRadioButton(buttonsText[i]);
            majorGroup.add(buttons[i]);
            p3.add(buttons[i]);
        }
        f.add(p3);
        //性别



        JPanel p4 = new JPanel();
        p4.add(new JLabel("爱好: "));
        String[] chkText = {"运动" , "音乐" , "网络"};
        JCheckBox[] hobbies = new JCheckBox[chkText.length];
        for (int i = 0; i < hobbies.length; i++){
            hobbies[i] = new JCheckBox(chkText[i]);
            p4.add(hobbies[i]);
        }

        f.add(p4);
        //爱好


        JPanel p5 = new JPanel();
        p5.setSize(260,180);
//			JTextArea tal = new JTextArea("此处为简介");
//			tal.setSize(140,40);
        JButton btnOK = new JButton("提交");
        JTextArea ta2 = new JTextArea("aaaa\r\nbbbb\r\nccc\r\nddddd\r\neeeee");
        ta2.setLineWrap(true);
        JScrollPane sp = new JScrollPane(ta2);
        sp.setBounds(13, 10, 350, 340);
        sp.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setSize(140, 70);
        p5.add(sp);
        //p5.add(tal);
        p5.add(btnOK);
        f.add(p5);

        f.setVisible(true);

    }
}
