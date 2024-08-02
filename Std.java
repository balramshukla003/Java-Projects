import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

import static javax.swing.JOptionPane.showMessageDialog;


public class Std extends JFrame implements ActionListener,FocusListener {

    String name, fname, mname, age, gen="", stid, course, email, phone, city, addrs;
    JLabel l, n, fn, mn, ag, gd, id, cou, eml, phn, add, cty;
    JButton back, submit, clear;
    JPanel jp;
    JCheckBox ma, fe, ot;
    JComboBox date, month, year;
    JTextArea address;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8;

    Std() {

        ImageIcon icon = new ImageIcon("C:\\Users\\BalramShukla\\IdeaProjects\\Swing_Project\\src\\picture.jpg");
        setIconImage(icon.getImage());
        setTitle("Student Registration");
        setBounds(900, 30, 592, 750);
        setLayout(null);

        jp = new JPanel();
        jp.setBounds(20, 0, 540, 695);
        jp.setBackground(Color.LIGHT_GRAY);
        jp.setLayout(null);
        add(jp);

        back = new JButton("<<");
        back.setBounds(5, 8, 30, 23);
        back.setBorder(new SoftBevelBorder(2, null, null, null, null));
        back.setForeground(Color.black);
        back.setBackground(Color.lightGray);
        back.setFont(new Font("arial", Font.BOLD, 16));
        back.addActionListener(this);
        jp.add(back);


        l = new JLabel("Student Registration Form");
        l.setBounds(109, 37, 322, 30);
        l.setBackground(Color.white);
        l.setForeground(new Color(0x131348));
        l.setFont(new Font("Rockwell", Font.BOLD, 25));
        jp.add(l);

        n = new JLabel("Std Name :");
        n.setBounds(60, 120, 120, 22);
        n.setForeground(new Color(0x3A0101));
        n.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(n);

        t1 = new JTextField(" Enter Name");
        t1.setBounds(230, 115, 250, 25);
        t1.setForeground(Color.GRAY);
        t1.addFocusListener(this);
        t1.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        t1.setFont(new Font("Rockwell Bold", Font.ITALIC, 14));
        jp.add(t1);

        fn = new JLabel("Father Name :");
        fn.setBounds(60, 160, 150, 22);
        fn.setForeground(new Color(0x3A0101));
        fn.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(fn);

        t2 = new JTextField(" Father Name");
        t2.setBounds(230, 155, 250, 25);
        t2.setForeground(Color.GRAY);
        t2.addFocusListener(this);
        t2.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        t2.setFont(new Font("Rockwell Bold", Font.ITALIC, 14));
        jp.add(t2);

        mn = new JLabel("Mother Name :");
        mn.setBounds(60, 200, 150, 22);
        mn.setForeground(new Color(0x3A0101));
        mn.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(mn);

        t3 = new JTextField(" Mother Name");
        t3.setBounds(230, 195, 250, 25);
        t3.setForeground(Color.GRAY);
        t3.addFocusListener(this);
        t3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        t3.setFont(new Font("Rockwell Bold", Font.ITALIC, 14));
        jp.add(t3);

        ag = new JLabel("Age :");
        ag.setBounds(60, 240, 50, 22);
        ag.setForeground(new Color(0x3A0101));
        ag.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(ag);

        JLabel d = new JLabel("D");
        d.setBounds(230, 235, 13, 21);
        d.setForeground(new Color(0x3A0101));
        d.setFont(new Font("Rockwell", Font.PLAIN, 15));
        jp.add(d);

        date = new JComboBox();
        date.addItem("00");
        date.addItem("01");
        date.addItem("02");
        date.addItem("03");
        date.addItem("04");
        date.addItem("05");
        date.addItem("06");
        date.addItem("07");
        date.addItem("08");
        date.addItem("09");
        date.addItem("10");
        date.addItem("11");
        date.addItem("12");
        date.addItem("13");
        date.addItem("14");
        date.addItem("15");
        date.addItem("16");
        date.addItem("17");
        date.addItem("18");
        date.addItem("19");
        date.addItem("20");
        date.addItem("21");
        date.addItem("22");
        date.addItem("23");
        date.addItem("24");
        date.addItem("25");
        date.addItem("26");
        date.addItem("27");
        date.addItem("28");
        date.addItem("29");
        date.addItem("30");
        date.addItem("31");


        date.setForeground(Color.GRAY);
        date.setBounds(244, 235, 60, 20);
        date.setFont(new Font("Rockwell", Font.BOLD, 14));
        date.setBackground(Color.white);
        date.addFocusListener(this);
        jp.add(date);

        JLabel m = new JLabel("M");
        m.setBounds(313, 235, 14, 21);
        m.setForeground(new Color(0x3A0101));
        m.setFont(new Font("Rockwell", Font.PLAIN, 15));
        jp.add(m);

        month = new JComboBox();

        month.addItem("00");
        month.addItem("01");
        month.addItem("02");
        month.addItem("03");
        month.addItem("04");
        month.addItem("05");
        month.addItem("06");
        month.addItem("07");
        month.addItem("08");
        month.addItem("09");
        month.addItem("10");
        month.addItem("11");
        month.addItem("12");

        month.setForeground(Color.GRAY);
        month.setBounds(328, 235, 60, 20);
        month.setFont(new Font("Rockwell", Font.BOLD, 14));
        month.setBackground(Color.white);
        month.addFocusListener(this);
        jp.add(month);

        JLabel h = new JLabel("Y");
        h.setBounds(397, 235, 14, 21);
        h.setForeground(new Color(0x3A0101));
        h.setFont(new Font("Rockwell", Font.PLAIN, 15));
        jp.add(h);

        year = new JComboBox();
        year.addItem("0000");
        year.addItem("1950");
        year.addItem("1951");
        year.addItem("1952");
        year.addItem("1953");
        year.addItem("1954");
        year.addItem("1955");
        year.addItem("1956");
        year.addItem("1957");
        year.addItem("1958");
        year.addItem("1959");
        year.addItem("1960");
        year.addItem("1961");
        year.addItem("1962");
        year.addItem("1963");
        year.addItem("1964");
        year.addItem("1965");
        year.addItem("1966");
        year.addItem("1967");
        year.addItem("1968");
        year.addItem("1969");
        year.addItem("1970");
        year.addItem("1971");
        year.addItem("1972");
        year.addItem("1973");
        year.addItem("1974");
        year.addItem("1975");
        year.addItem("1976");
        year.addItem("1977");
        year.addItem("1978");
        year.addItem("1979");
        year.addItem("1980");
        year.addItem("1981");
        year.addItem("1982");
        year.addItem("1983");
        year.addItem("1984");
        year.addItem("1985");
        year.addItem("1986");
        year.addItem("1987");
        year.addItem("1988");
        year.addItem("1989");
        year.addItem("1990");
        year.addItem("1991");
        year.addItem("1992");
        year.addItem("1993");
        year.addItem("1994");
        year.addItem("1995");
        year.addItem("1996");
        year.addItem("1997");
        year.addItem("1998");
        year.addItem("1999");
        year.addItem("2000");
        year.addItem("2001");
        year.addItem("2002");
        year.addItem("2003");
        year.addItem("2004");
        year.addItem("2005");
        year.addItem("2006");
        year.addItem("2007");
        year.addItem("2008");
        year.addItem("2009");
        year.addItem("2010");
        year.addItem("2011");
        year.addItem("2012");
        year.addItem("2013");
        year.addItem("2014");
        year.addItem("2015");
        year.addItem("2016");
        year.addItem("2017");
        year.addItem("2018");
        year.addItem("2019");
        year.addItem("2020");
        year.addItem("2021");
        year.addItem("2022");
        year.addItem("2023");
        year.addItem("2024");
        year.addItem("2025");
        year.addItem("2026");
        year.addItem("2027");
        year.addItem("2028");
        year.addItem("2029");
        year.addItem("2030");
        year.addItem("2031");
        year.addItem("2032");
        year.addItem("2033");
        year.addItem("2034");
        year.addItem("2035");
        year.addItem("2036");
        year.addItem("2037");
        year.addItem("2038");
        year.addItem("2039");
        year.addItem("2040");
        year.addItem("2041");
        year.addItem("2042");
        year.addItem("2043");
        year.addItem("2044");
        year.addItem("2045");
        year.addItem("2046");
        year.addItem("2047");
        year.addItem("2048");
        year.addItem("2049");
        year.addItem("2050");
        year.addItem("2051");


        year.setForeground(Color.GRAY);
        year.setBounds(410, 235, 70, 20);
        year.setFont(new Font("Rockwell", Font.BOLD, 14));
        year.setBackground(Color.white);
        year.addFocusListener(this);
        jp.add(year);

        gd = new JLabel("Gender :");
        gd.setBounds(60, 280, 150, 22);
        gd.setForeground(new Color(0x3A0101));
        gd.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(gd);

        ma = new JCheckBox("Male", false);
        fe = new JCheckBox("Female", false);
        ot = new JCheckBox("Other's", false);

        ma.setBounds(230, 275, 60, 22);
        fe.setBounds(310, 275, 75, 22);
        ot.setBounds(405, 275, 75, 22);

        ma.setFont(new Font("Rockwell", Font.BOLD, 13));
        fe.setFont(new Font("Rockwell", Font.BOLD, 13));
        ot.setFont(new Font("Rockwell", Font.BOLD, 13));

        ma.setForeground(new Color(0x3A0101));
        fe.setForeground(new Color(0x3A0101));
        ot.setForeground(new Color(0x3A0101));

        ma.addFocusListener(this);
        fe.addFocusListener(this);
        ot.addFocusListener(this);

        jp.add(ma);
        jp.add(fe);
        jp.add(ot);


        id = new JLabel("Student ID :");
        id.setBounds(60, 320, 150, 22);
        id.setForeground(new Color(0x3A0101));
        id.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(id);

        t4 = new JTextField(" Student ID");
        t4.setBounds(230, 315, 250, 25);
        t4.setForeground(Color.GRAY);
        t4.addFocusListener(this);
        t4.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c != 8 && !Character.isDigit(c)) {
                    e.consume();
                    showMessageDialog(jp, "Enter Valid Student ID");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        t4.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        t4.setFont(new Font("Rockwell Bold", Font.ITALIC, 14));
        jp.add(t4);

        cou = new JLabel("Course :");
        cou.setBounds(60, 360, 150, 22);
        cou.setForeground(new Color(0x3A0101));
        cou.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(cou);

        t5 = new JTextField(" Enter Course");
        t5.setBounds(230, 355, 250, 25);
        t5.setForeground(Color.GRAY);
        t5.addFocusListener(this);
        t5.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        t5.setFont(new Font("Rockwell Bold", Font.ITALIC, 14));
        jp.add(t5);

        eml = new JLabel("Email :");
        eml.setBounds(60, 400, 150, 22);
        eml.setForeground(new Color(0x3A0101));
        eml.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(eml);

        t6 = new JTextField(" Enter Email");
        t6.setBounds(230, 395, 250, 25);
        t6.setForeground(Color.GRAY);
        t6.addFocusListener(this);
        t6.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        t6.setFont(new Font("Rockwell Bold", Font.ITALIC, 14));
        jp.add(t6);

        phn = new JLabel("Phone No :");
        phn.setBounds(60, 440, 150, 22);
        phn.setForeground(new Color(0x3A0101));
        phn.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(phn);

        t7 = new JTextField(" Phone No");
        t7.setBounds(230, 435, 250, 25);
        t7.setForeground(Color.GRAY);
        t7.addFocusListener(this);
        t7.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();
                if (c != 8 && !Character.isDigit(c)) {
                    e.consume();
                    showMessageDialog(jp, "Enter Valid Phone Number");
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        t7.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        t7.setFont(new Font("Rockwell Bold", Font.ITALIC, 14));
        jp.add(t7);

        cty = new JLabel("City :");
        cty.setBounds(60, 480, 150, 22);
        cty.setForeground(new Color(0x3A0101));
        cty.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(cty);

        t8 = new JTextField(" Enter City");
        t8.setBounds(230, 475, 250, 25);
        t8.setForeground(Color.GRAY);
        t8.addFocusListener(this);
        t8.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        t8.setFont(new Font("Rockwell Bold", Font.ITALIC, 14));
        jp.add(t8);

        add = new JLabel("Residence :");
        add.setBounds(60, 520, 150, 22);
        add.setForeground(new Color(0x3A0101));
        add.setFont(new Font("Rockwell", Font.BOLD, 15));
        jp.add(add);

        address = new JTextArea(" Address");
        address.setBounds(230, 510, 250, 70);
        address.setForeground(Color.GRAY);
        address.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        address.setFont(new Font("Rockwell", Font.BOLD, 15));
        address.addFocusListener(this);
        jp.add(address);


        clear = new JButton("Clear");
        clear.setBounds(100, 620, 120, 30);
        clear.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
        clear.setBackground(new Color(0xD02C1B));
        clear.setBorder(new BevelBorder(BevelBorder.RAISED));
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        jp.add(clear);

        submit = new JButton("Submit");
        submit.setBounds(320, 620, 120, 30);
        submit.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
        submit.setBackground(new Color(0x137521));
        submit.setBorder(new BevelBorder(BevelBorder.RAISED));
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        jp.add(submit);


        setVisible(true);

    }


    public static void main(String[] args) {
        Std s = new Std();
    }

    private void Submit() {


        String D = (String) date.getSelectedItem();
        String M = (String) month.getSelectedItem();
        String Y = (String) year.getSelectedItem();

        name = t1.getText();
        fname = t2.getText();
        mname = t3.getText();

        age = D + "/" + M + "/" + Y;

        if (ma.isSelected()) {
            gen = "Male";
        }
        if (fe.isSelected()) {
            gen = "Female";
        }
        if (ot.isSelected()) {
            gen = "Other";
        }

        stid = t4.getText();
        course = t5.getText();
        phone = t7.getText();
        email = t6.getText();
        city = t8.getText();
        addrs = address.getText();


        if(Objects.equals(name, " Enter Name")){
            t1.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
        }else {
            t1.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        }

        if(Objects.equals(fname, " Father Name")){
            t2.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
        }else {
            t2.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        }

        if(Objects.equals(mname, " Mother Name")){
            t3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
        }else {
            t3.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        }

        if(Objects.equals(D,"00")){
            date.setBorder(new MatteBorder(2, 2, 2, 2,new Color(0xF10606)));
        }else{
            date.setBorder(new EmptyBorder(0,0,0,0));
        }

        if(Objects.equals(M,"00")){
            month.setBorder(new MatteBorder(2, 2, 2, 2,new Color(0xF10606)));
        }else{
            month.setBorder(new EmptyBorder(0,0,0,0));
        }

        if(Objects.equals(Y,"0000")){
            year.setBorder(new MatteBorder(2, 2, 2, 2,new Color(0xF10606)));
        }else{
            year.setBorder(new EmptyBorder(0,0,0,0));
        }

        if(Objects.equals(gen, "")){

            if(ma.isSelected()){

            }else{
                ma.setBackground(new Color(0xEAB4B8));
            }
            if(fe.isSelected()){

            }else{
                fe.setBackground(new Color(0xEAB4B8));
            }
            if(ot.isSelected()){

            }else{
                ot.setBackground(new Color(0xEAB4B8));
            }
        }else {
            ma.setBackground(Color.white);
            fe.setBackground(Color.white);
            ot.setBackground(Color.white);
        }

        if(Objects.equals(stid, " Student ID")){
            t4.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
        }else {
            t4.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        }
        if(Objects.equals(course, " Enter Course")){
            t5.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
        }else {
            t5.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        }

        if(Objects.equals(email, " Enter Email")){
            t6.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
        }else {
            t6.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        }

        if(Objects.equals(phone, " Phone No")){
            t7.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
        }else {
            t7.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        }

        if(Objects.equals(city, " Enter City")){
            t8.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
        }else {
            t8.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        }

        if(Objects.equals(addrs, " Address")){
            address.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
        }else {
            address.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
        }



        if (t1.getText().equals(" Enter Name") || t2.getText().equals(" Father Name") || t3.getText().equals(" Mother Name") || t4.getText().equals(" Student ID") || t5.getText().equals(" Enter Course") || t6.getText().equals(" Enter Email") || t7.getText().equals(" Phone No") || t8.getText().equals(" Enter City") || address.getText().equals(" Address")
        ) {

            showMessageDialog(this, "No Field Should Empty");

        } else if (Objects.equals(D, "00") || Objects.equals(M, "00") || Objects.equals(Y, "0000")) {

            showMessageDialog(this, "Invalid Date Of Birth");

        } else if (ma.isSelected() || fe.isSelected() || ot.isSelected()) {
            {
                t6.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
                int k = email.length();
                String nn = "";
                int A;


                for (A = 0; A < k; A++) {

                    if (email.charAt(A) == '@') {

                        if (A < 4) {

                            t6.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
                            showMessageDialog(jp, "Invalid Email size");
                            return;

                        } else {

                            t6.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));
                            int j = A;

                            while (j < k) {

                                if (email.charAt(j) == '.') {
                                    break;
                                }
                                nn += email.charAt(j);

                                j++;
                            }

                            String[] K = {"@gmail", "@yahoo", "@outlook", "@hotmail", "@icloud", "@aol", "@protonmail", "@zoho", "@yandex", "@mail", "@gmx"};
                            int f = K.length;

                            for (int g = 0; g < f; g++)

                            {
                                if (nn.equals(K[g])) {
                                    break;
                                }
                                else {
                                    t6.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
                                    showMessageDialog(jp, "Invalid Email");
                                    return;
                                }
                            }
                        }
                    }
                }
            }

            int i = phone.length();

            if (i != 10) {

                t7.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0xF10606)));
                showMessageDialog(this, "Invalid Number (Digit Count)");

            } else {

                t7.setBorder(new MatteBorder(2, 2, 2, 2, new Color(0x969090)));

                {
                    //Connection
                    String url = "jdbc:mysql://localhost:3306/data_swing";
                    String username = "root";
                    String dbPassword = "";
                    String sqlQuery = "insert into studentdata(Name, Fname, MName, Age, Gender, StudentID, Course, Email, Contact, City, Address) values(?,?,?,?,?,?,?,?,?,?,?)";
                    try {

                        Connection con = DriverManager.getConnection(url, username, dbPassword);
                        PreparedStatement coo = con.prepareStatement(sqlQuery);

                        coo.setString(1, name);
                        coo.setString(2, fname);
                        coo.setString(3, mname);
                        coo.setString(4, age);
                        coo.setString(5, gen);
                        coo.setString(6, stid);
                        coo.setString(7, course);
                        coo.setString(8, email);
                        coo.setString(9, phone);
                        coo.setString(10, city);
                        coo.setString(11, addrs);

                        System.out.println("Connection Established");
                        int row =coo.executeUpdate();
                        if(row>0){

                            showMessageDialog(jp, "Data Added Successfully", "Notification", JOptionPane.INFORMATION_MESSAGE);

                            t1.setText(" Enter Name");
                            t2.setText(" Father Name");
                            t3.setText(" Mother Name");
                            t4.setText(" Student ID");
                            t5.setText(" Enter Course");
                            t6.setText(" Enter Email");
                            t7.setText(" Phone No");
                            t8.setText(" Enter City");
                            address.setText(" Address");

                            date.setSelectedIndex(0);
                            month.setSelectedIndex(0);
                            year.setSelectedIndex(0);

                            ma.setSelected(false);
                            fe.setSelected(false);
                            ot.setSelected(false);

                            t1.setForeground(Color.GRAY);
                            t2.setForeground(Color.GRAY);
                            t3.setForeground(Color.GRAY);
                            t4.setForeground(Color.GRAY);
                            t5.setForeground(Color.GRAY);
                            t6.setForeground(Color.GRAY);
                            t7.setForeground(Color.GRAY);
                            t8.setForeground(Color.GRAY);
                            date.setForeground(Color.GRAY);
                            month.setForeground(Color.GRAY);
                            year.setForeground(Color.GRAY);
                            address.setForeground(Color.GRAY);
                        }else{
                            showMessageDialog(jp,"Data Not Added");
                        }

                    } catch (Exception e) {
                        showMessageDialog(jp,"DataBase is not Connected");
                    }
                }

            }

        } else {

            showMessageDialog(this, "Select Your Gender");

        }
    }


    private void Clear() {


        t1.setText(" Enter Name");
        t2.setText(" Father Name");
        t3.setText(" Mother Name");
        t4.setText(" Student ID");
        t5.setText(" Enter Course");
        t6.setText(" Enter Email");
        t7.setText(" Phone No");
        t8.setText(" Enter City");
        address.setText(" Address");

        t1.setForeground(Color.GRAY);
        t2.setForeground(Color.GRAY);
        t3.setForeground(Color.GRAY);
        t4.setForeground(Color.GRAY);
        t5.setForeground(Color.GRAY);
        t6.setForeground(Color.GRAY);
        t7.setForeground(Color.GRAY);
        t8.setForeground(Color.GRAY);

        address.setForeground(Color.GRAY);

        date.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);

        ma.setSelected(false);
        fe.setSelected(false);
        ot.setSelected(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(clear)) {
            Clear();
        }

        if (e.getSource().equals(submit)) {
            Submit();
        }

    }

    @Override
    public void focusGained(FocusEvent e) {


        if (e.getSource().equals(ma)) {
            fe.setSelected(false);
            ot.setSelected(false);
        }

        if (e.getSource().equals(fe)) {
            ma.setSelected(false);
            ot.setSelected(false);
        }

        if (e.getSource().equals(ot)) {
            fe.setSelected(false);
            ma.setSelected(false);
        }

        if (e.getSource().equals(t1)) {
            if (t1.getText().equals(" Enter Name")) {
                t1.setForeground(Color.black);
                t1.setText("");
            }
        }

        if (e.getSource().equals(t2)) {
            if (t2.getText().equals(" Father Name")) {
                t2.setForeground(Color.black);
                t2.setText("");
            }
        }

        if (e.getSource().equals(t3)) {
            if (t3.getText().equals(" Mother Name")) {
                t3.setForeground(Color.black);
                t3.setText("");
            }
        }

        if (e.getSource().equals(t4)) {
            if (t4.getText().equals(" Student ID")) {
                t4.setForeground(Color.black);
                t4.setText("");
            }
        }

        if (e.getSource().equals(t5)) {
            if (t5.getText().equals(" Enter Course")) {
                t5.setForeground(Color.black);
                t5.setText("");
            }
        }

        if (e.getSource().equals(t6)) {
            if (t6.getText().equals(" Enter Email")) {
                t6.setForeground(Color.black);
                t6.setText("");
            }
        }

        if (e.getSource().equals(t7)) {
            if (t7.getText().equals(" Phone No")) {
                t7.setForeground(Color.black);
                t7.setText("");
            }
        }

        if (e.getSource().equals(t8)) {
            if (t8.getText().equals(" Enter City")) {
                t8.setForeground(Color.black);
                t8.setText("");
            }
        }

        if (e.getSource().equals(address)) {
            if (address.getText().equals(" Address")) {
                address.setForeground(Color.black);
                address.setText("");
            }
        }
        if (e.getSource().equals(date)) {
            date.setForeground(Color.black);
        }
        if (e.getSource().equals(month)) {
            month.setForeground(Color.black);
        }
        if (e.getSource().equals(year)) {
            year.setForeground(Color.black);
        }
    }


    @Override
    public void focusLost(FocusEvent e) {


        if (e.getSource().equals(t1)) {
            if (t1.getText().isEmpty()) {
                t1.setForeground(Color.gray);
                t1.setText(" Enter Name");
            }
        }

        if (e.getSource().equals(t2)) {
            if (t2.getText().isEmpty()) {
                t2.setForeground(Color.gray);
                t2.setText(" Father Name");
            }
        }

        if (e.getSource().equals(t3)) {
            if (t3.getText().isEmpty()) {
                t3.setForeground(Color.gray);
                t3.setText(" Mother Name");
            }
        }

        if (e.getSource().equals(t4)) {
            if (t4.getText().isEmpty()) {
                t4.setForeground(Color.gray);
                t4.setText(" Student ID");
            }
        }

        if (e.getSource().equals(t5)) {
            if (t5.getText().isEmpty()) {
                t5.setForeground(Color.gray);
                t5.setText(" Enter Course");
            }
        }

        if (e.getSource().equals(t6)) {
            if (t6.getText().isEmpty()) {
                t6.setForeground(Color.gray);
                t6.setText(" Enter Email");
            }
        }

        if (e.getSource().equals(t7)) {
            if (t7.getText().isEmpty()) {
                t7.setForeground(Color.gray);
                t7.setText(" Phone No");
            }
        }

        if (e.getSource().equals(t8)) {
            if (t8.getText().isEmpty()) {
                t8.setForeground(Color.gray);
                t8.setText(" Enter City");
            }
        }

        if (e.getSource().equals(address)) {
            if (address.getText().isEmpty()) {
                address.setForeground(Color.gray);
                address.setText(" Address");
            }
        }

        if (e.getSource().equals(date)) {
            if (Objects.equals(date.getSelectedItem(), "00")) {
                date.setForeground(Color.gray);
            }
        }
        if (e.getSource().equals(month)) {
            if (Objects.equals(month.getSelectedItem(), "00")) {
                month.setForeground(Color.gray);
            }
        }
        if (e.getSource().equals(year)) {
            if (Objects.equals(year.getSelectedItem(), "0000")) {
                year.setForeground(Color.gray);
            }
        }
    }

}