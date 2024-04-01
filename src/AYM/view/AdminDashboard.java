/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYM.view;

import AYM.dao.ClubDAO;
import AYM.dao.EventDAO;
import AYM.dao.UserDAO;
import AYM.model.AYclub;
import AYM.model.AYevent;
import AYM.model.AYmember;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER1
 */
public class AdminDashboard extends javax.swing.JFrame {
      
    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultTableModel clubtableModel = new DefaultTableModel();
    DefaultTableModel eventtablemodel = new DefaultTableModel();
    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
    initComponents();
    addColumnsHeaderNameToTable();
    addrowsdata();
    addColumnsHeaderNameToClubTable();
    addColumnsHeaderNameToEventTable();
    addrowsclubdata(); // Call this method to populate club data

    }

    private void addColumnsHeaderNameToTable(){
        tableModel.addColumn("UserName");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Role");
        tableModel.addColumn("Club");
        tableModel.addColumn("Password");
       usertable.setModel(tableModel);
       usertable.getTableHeader().setReorderingAllowed(false);
       usertable.getTableHeader().setResizingAllowed(false);
    }
    private void addColumnsHeaderNameToClubTable(){
        clubtableModel.addColumn("Club ID");
        clubtableModel.addColumn("Club Name");
        clubtableModel.addColumn("Club Description");
       clubtable.setModel(clubtableModel);
       clubtable.getTableHeader().setReorderingAllowed(false);
       clubtable.getTableHeader().setResizingAllowed(false);
    }
    private void addColumnsHeaderNameToEventTable(){
    eventtablemodel.addColumn("Event ID");
    eventtablemodel.addColumn("Event Name");
    eventtablemodel.addColumn("Date");
    eventtablemodel.addColumn("Location");
    eventtablemodel.addColumn("Organiser");
    eventtable.setModel(eventtablemodel);
    eventtable.getTableHeader().setReorderingAllowed(false);
    eventtable.getTableHeader().setResizingAllowed(false);
    }
    
    
    private void addrowsdata(){
    tableModel.setRowCount(0);
    UserDAO dao = new UserDAO();
    List<AYmember> aymember = dao.retrieveallusers();
    for(AYmember member : aymember){
    tableModel.addRow(new Object[]{
     member.getUserName(),
    member.getPhonenumber(),
    member.getRole(),
    member.getPassword()
    });
    }
    }

    private void addrowsclubdata() {
    clubtableModel.setRowCount(0); 
    ClubDAO clubdao = new ClubDAO();
    List<AYclub> ayclub = clubdao.retrieveallclubs();
    for (AYclub club : ayclub) {
        clubtableModel.addRow(new Object[]{
            club.getClubId(),
            club.getClubname(),
            club.getDescription()
        });
    }
}
    public void refreshclub(){
        ClubDAO clubdao = new ClubDAO();
        List<AYclub> clubList = clubdao.retrieveallclubs(); 
        DefaultTableModel clubmodel = (DefaultTableModel) clubtable.getModel();
        clubmodel.setRowCount(0); // Clear the table
        for (AYclub club : clubList) {
             clubmodel.addRow(new Object[]{club.getClubId(), club.getClubname(), club.getDescription()});
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menupanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        homebtn = new javax.swing.JButton();
        clubbtn = new javax.swing.JButton();
        userbtn = new javax.swing.JButton();
        attendancebtn = new javax.swing.JButton();
        eventbtn = new javax.swing.JButton();
        alltabs = new javax.swing.JTabbedPane();
        usetab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usertable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        phonefield = new javax.swing.JTextField();
        rolecombo = new javax.swing.JComboBox<>();
        passwordfield = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        refreshbtn = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        searchfield = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        clubcombo = new javax.swing.JComboBox<>();
        savebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        clubtab = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        clubidfield = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        updateclubbtn = new javax.swing.JButton();
        deleteclubbtn = new javax.swing.JButton();
        clubidtosearch = new javax.swing.JTextField();
        searchclubtn = new javax.swing.JButton();
        refreshclub = new javax.swing.JButton();
        descriptioncombo = new javax.swing.JComboBox<>();
        saveclubbtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        clubnamecombo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        clubtable = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        eventtab = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        eventtable = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        searcheventbtn = new javax.swing.JButton();
        updateeventbtn = new javax.swing.JButton();
        deleteeventbtn = new javax.swing.JButton();
        eventnamefield = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        eventidfield = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        addeventbtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        searcheventfield = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        locationeventfield = new javax.swing.JTextField();
        organisercombo = new javax.swing.JComboBox<>();
        datefield = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        attendancetab = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        backgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 740));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADVENTIST YOUTH ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MANAGEMENT SYSTEM");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        menupanel.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 33)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Developed by");

        jLabel6.setBackground(new java.awt.Color(0, 153, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("ASHIMWE Rushinga Cedrick");

        homebtn.setBackground(new java.awt.Color(51, 51, 51));
        homebtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 28)); // NOI18N
        homebtn.setForeground(new java.awt.Color(0, 204, 0));
        homebtn.setText("HOME");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        clubbtn.setBackground(new java.awt.Color(51, 51, 51));
        clubbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 28)); // NOI18N
        clubbtn.setForeground(new java.awt.Color(0, 153, 255));
        clubbtn.setText("CLUB");
        clubbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clubbtnMouseClicked(evt);
            }
        });
        clubbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubbtnActionPerformed(evt);
            }
        });

        userbtn.setBackground(new java.awt.Color(51, 51, 51));
        userbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 28)); // NOI18N
        userbtn.setForeground(new java.awt.Color(0, 153, 255));
        userbtn.setText("USER");
        userbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userbtnMouseClicked(evt);
            }
        });
        userbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnActionPerformed(evt);
            }
        });

        attendancebtn.setBackground(new java.awt.Color(51, 51, 51));
        attendancebtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        attendancebtn.setForeground(new java.awt.Color(0, 153, 255));
        attendancebtn.setText("ATTENDANCE");
        attendancebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendancebtnMouseClicked(evt);
            }
        });
        attendancebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendancebtnActionPerformed(evt);
            }
        });

        eventbtn.setBackground(new java.awt.Color(51, 51, 51));
        eventbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 28)); // NOI18N
        eventbtn.setForeground(new java.awt.Color(0, 153, 255));
        eventbtn.setText("EVENT");
        eventbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventbtnMouseClicked(evt);
            }
        });
        eventbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4))
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(attendancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clubbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menupanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eventbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clubbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attendancebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel2.add(menupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 230, 590));

        alltabs.setBackground(new java.awt.Color(51, 51, 51));
        alltabs.setForeground(new java.awt.Color(0, 153, 204));

        usetab.setBackground(new java.awt.Color(255, 204, 51));

        usertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(usertable);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 23)); // NOI18N
        jLabel7.setText("User Registration");

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("UserName:");

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Phone:");

        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Role:");

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Passsword:");

        phonefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonefieldActionPerformed(evt);
            }
        });

        rolecombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rolecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "Club leader", "Regular User" }));
        rolecombo.setSelectedIndex(-1);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        updatebtn.setBackground(new java.awt.Color(51, 51, 51));
        updatebtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(0, 153, 255));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(51, 51, 51));
        deletebtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(0, 153, 255));
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        refreshbtn.setBackground(new java.awt.Color(51, 51, 51));
        refreshbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        refreshbtn.setForeground(new java.awt.Color(0, 153, 255));
        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel27.setText("User's UserName:");

        searchbtn.setBackground(new java.awt.Color(51, 51, 51));
        searchbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(0, 102, 255));
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(refreshbtn)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletebtn)
                .addGap(11, 11, 11)
                .addComponent(refreshbtn)
                .addGap(25, 25, 25))
        );

        jLabel17.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Club:");

        clubcombo.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        clubcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Master guide", "Senior Youth", "Ambassador", "Pathfinder", "Adventures" }));
        clubcombo.setSelectedIndex(-1);

        savebtn.setBackground(new java.awt.Color(51, 51, 51));
        savebtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        savebtn.setForeground(new java.awt.Color(0, 153, 255));
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rolecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phonefield, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clubcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phonefield)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rolecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clubcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordfield))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("List of All Users");

        jLabel21.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 255));
        jLabel21.setText("USER MANAGEMENT");

        javax.swing.GroupLayout usetabLayout = new javax.swing.GroupLayout(usetab);
        usetab.setLayout(usetabLayout);
        usetabLayout.setHorizontalGroup(
            usetabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usetabLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(usetabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(usetabLayout.createSequentialGroup()
                .addGroup(usetabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usetabLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel5))
                    .addGroup(usetabLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        usetabLayout.setVerticalGroup(
            usetabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usetabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        alltabs.addTab("User", usetab);

        clubtab.setBackground(new java.awt.Color(255, 204, 51));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 23)); // NOI18N
        jLabel12.setText("Club Information");

        jLabel15.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Club ID:");

        jLabel16.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Description:");

        clubidfield.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clubidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubidfieldActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel18.setText("Club's Id");

        updateclubbtn.setBackground(new java.awt.Color(51, 51, 51));
        updateclubbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        updateclubbtn.setForeground(new java.awt.Color(0, 153, 255));
        updateclubbtn.setText("Update");
        updateclubbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateclubbtnActionPerformed(evt);
            }
        });

        deleteclubbtn.setBackground(new java.awt.Color(51, 51, 51));
        deleteclubbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        deleteclubbtn.setForeground(new java.awt.Color(0, 153, 255));
        deleteclubbtn.setText("Delete");
        deleteclubbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteclubbtnActionPerformed(evt);
            }
        });

        searchclubtn.setBackground(new java.awt.Color(51, 51, 51));
        searchclubtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        searchclubtn.setForeground(new java.awt.Color(0, 153, 255));
        searchclubtn.setText("Search");
        searchclubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchclubtnActionPerformed(evt);
            }
        });

        refreshclub.setBackground(new java.awt.Color(51, 51, 51));
        refreshclub.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        refreshclub.setForeground(new java.awt.Color(0, 153, 255));
        refreshclub.setText("Refresh");
        refreshclub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshclubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshclub)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(updateclubbtn)
                                .addComponent(searchclubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteclubbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(clubidtosearch, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clubidtosearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(searchclubtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateclubbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteclubbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshclub)
                .addGap(9, 9, 9))
        );

        descriptioncombo.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        descriptioncombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3-9years", "10-15years", "16-21years", "22-99years" }));
        descriptioncombo.setSelectedIndex(-1);

        saveclubbtn.setBackground(new java.awt.Color(51, 51, 51));
        saveclubbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        saveclubbtn.setForeground(new java.awt.Color(0, 153, 255));
        saveclubbtn.setText("Save");
        saveclubbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveclubbtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Club Name:");

        clubnamecombo.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        clubnamecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senior youth", "Ambassodor", "Pathfinder", "Adventures" }));
        clubnamecombo.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clubidfield)
                            .addComponent(descriptioncombo, 0, 170, Short.MAX_VALUE)
                            .addComponent(clubnamecombo, 0, 170, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saveclubbtn)
                        .addGap(110, 110, 110)))
                .addGap(13, 13, 13)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clubidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clubnamecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(descriptioncombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveclubbtn))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clubtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(clubtable);

        jLabel19.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jLabel19.setText("Club DataTable");

        jLabel22.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 255));
        jLabel22.setText("CLUB MANAGEMENT");

        javax.swing.GroupLayout clubtabLayout = new javax.swing.GroupLayout(clubtab);
        clubtab.setLayout(clubtabLayout);
        clubtabLayout.setHorizontalGroup(
            clubtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clubtabLayout.createSequentialGroup()
                .addGroup(clubtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clubtabLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(clubtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)))
                    .addGroup(clubtabLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel19))
                    .addGroup(clubtabLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel22)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        clubtabLayout.setVerticalGroup(
            clubtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clubtabLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        alltabs.addTab("Club", clubtab);

        eventtab.setBackground(new java.awt.Color(255, 204, 51));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        eventtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(eventtable);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 26)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Event's List");

        searcheventbtn.setBackground(new java.awt.Color(255, 204, 51));
        searcheventbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        searcheventbtn.setText("Search");
        searcheventbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcheventbtnActionPerformed(evt);
            }
        });

        updateeventbtn.setBackground(new java.awt.Color(255, 204, 51));
        updateeventbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        updateeventbtn.setText("Edit Event");

        deleteeventbtn.setBackground(new java.awt.Color(255, 204, 51));
        deleteeventbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        deleteeventbtn.setText("Delete Event");

        jLabel25.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Event Name:");

        jLabel26.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Date & Time:");

        jLabel28.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Event Id:");

        addeventbtn.setBackground(new java.awt.Color(255, 204, 51));
        addeventbtn.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        addeventbtn.setText("Add Event");
        addeventbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addeventbtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 21)); // NOI18N
        jLabel13.setText("Enter event id or Date:");

        jLabel29.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Organiser:");

        jLabel30.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Location/Venue:");

        organisercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MasterGuide", "Club leader" }));
        organisercombo.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(locationeventfield, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(updateeventbtn)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eventnamefield, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(eventidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datefield))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel13))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searcheventbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searcheventfield, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(organisercombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(addeventbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(deleteeventbtn)
                        .addGap(60, 60, 60))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(eventnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eventidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searcheventfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(searcheventbtn)
                    .addComponent(datefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateeventbtn)
                            .addComponent(jLabel30)
                            .addComponent(locationeventfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(deleteeventbtn))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(organisercombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addeventbtn)))
                .addGap(49, 49, 49)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel23.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 255));
        jLabel23.setText("EVENT MANAGEMENT");

        javax.swing.GroupLayout eventtabLayout = new javax.swing.GroupLayout(eventtab);
        eventtab.setLayout(eventtabLayout);
        eventtabLayout.setHorizontalGroup(
            eventtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(eventtabLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        eventtabLayout.setVerticalGroup(
            eventtabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventtabLayout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        alltabs.addTab("Event", eventtab);

        attendancetab.setBackground(new java.awt.Color(255, 204, 51));

        jLabel24.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 255));
        jLabel24.setText("ATTENDANCE MANAGEMENT");

        javax.swing.GroupLayout attendancetabLayout = new javax.swing.GroupLayout(attendancetab);
        attendancetab.setLayout(attendancetabLayout);
        attendancetabLayout.setHorizontalGroup(
            attendancetabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendancetabLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel24)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        attendancetabLayout.setVerticalGroup(
            attendancetabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendancetabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        alltabs.addTab("Attendance", attendancetab);

        jPanel2.add(alltabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 730, 590));

        backgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AYM/view/image/allbackground.png"))); // NOI18N
        backgound.setAutoscrolls(true);
        backgound.setFocusable(false);
        backgound.setPreferredSize(new java.awt.Dimension(1000, 740));
        backgound.setRequestFocusEnabled(false);
        jPanel2.add(backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1000, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        AYMaWELCOME welcome = new AYMaWELCOME();
        welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_homebtnMouseClicked

    private void clubbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clubbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clubbtnMouseClicked

    private void clubbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubbtnActionPerformed
        alltabs.setSelectedIndex(1);
    }//GEN-LAST:event_clubbtnActionPerformed

    private void userbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userbtnMouseClicked

    private void userbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnActionPerformed
       alltabs.setSelectedIndex(0);
    }//GEN-LAST:event_userbtnActionPerformed

    private void attendancebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendancebtnMouseClicked

    private void attendancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendancebtnActionPerformed
        alltabs.setSelectedIndex(3);
    }//GEN-LAST:event_attendancebtnActionPerformed

    private void eventbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eventbtnMouseClicked

    private void eventbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventbtnActionPerformed
        alltabs.setSelectedIndex(2);
    }//GEN-LAST:event_eventbtnActionPerformed

    private void deleteclubbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteclubbtnActionPerformed
        try {
    String clubIdToDelete = clubidfield.getText();
    if (clubIdToDelete.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the club ID to delete.");
        return;
    }
    int confirmDialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this club?",
            "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirmDialogResult == JOptionPane.YES_OPTION) {
        int clubId = Integer.parseInt(clubIdToDelete);
        AYclub clubToDelete = new AYclub();
        clubToDelete.setClubId(clubId);
        
        ClubDAO dao = new ClubDAO();
        int rowsAffected = dao.deleteClub(clubToDelete);
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Club deleted successfully.");
            clubidfield.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete club. Club not found or an error occurred.");
        }
    }
       } catch (Exception ex) {
    ex.printStackTrace();
    
}

    }//GEN-LAST:event_deleteclubbtnActionPerformed

    private void updateclubbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateclubbtnActionPerformed
         try {
        // Get the updated data from the UI fields
        String clubid = clubidfield.getText();
        String aclubname = (String) clubnamecombo.getSelectedItem();
        String clubdescription= (String) descriptioncombo.getSelectedItem();

        // Create a club object with updated data
        AYclub updatedclub = new AYclub();
        updatedclub.setClubId(Integer.parseInt(clubid));
        updatedclub.setClubname(aclubname);
        updatedclub.setDescription(clubdescription);
             ClubDAO dao = new ClubDAO();
        int rowsAffected = dao.updateclub(updatedclub);
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "club updated successfully");
                        clubidfield.setText("");
                        clubnamecombo.setSelectedIndex(-1);
                        descriptioncombo.setSelectedIndex(-1);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update club");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_updateclubbtnActionPerformed

    private void clubidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubidfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clubidfieldActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed

    try {
    String userNameToDelete = usernamefield.getText();
    if (userNameToDelete.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the username to delete.");
        return;
    }
    int confirmDialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?",
            "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirmDialogResult == JOptionPane.YES_OPTION) {
        AYmember memberToDelete = new AYmember();
        memberToDelete.setUserName(userNameToDelete);
        UserDAO dao = new UserDAO();
        int rowsAffected = dao.deleteUser(memberToDelete);
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "User deleted successfully.");
            
            usernamefield.setText("");
            phonefield.setText("");
            rolecombo.setSelectedIndex(-1);
            clubcombo.setSelectedIndex(-1);
            passwordfield.setText("");
            
            usernamefield.setEditable(true);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete user. User not found.");
        }
    }
} catch (Exception ex) {
    ex.printStackTrace();
    }

    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try {
        String username = usernamefield.getText();
        String phonenumber = phonefield.getText();
        String password = passwordfield.getText();
        String role = (String) rolecombo.getSelectedItem();
        String club = (String) clubcombo.getSelectedItem();
        AYmember updatedMember = new AYmember(username, phonenumber, role, club, password);
        UserDAO dao = new UserDAO();
        int rowsAffected = dao.updateUser(updatedMember);
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Member updated successfully");
            usernamefield.setText("");
                        phonefield.setText("");
                        passwordfield.setText("");
                        rolecombo.setSelectedIndex(-1);
                        clubcombo.setSelectedIndex(-1);
        
                        usernamefield.setEditable(true);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update member");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void phonefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonefieldActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
       try{
       if(usernamefield.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "UserName is required");
            }else if(phonefield.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Please enter Phone number");
        }else if (phonefield.getText().trim().length() != 10) {
        JOptionPane.showMessageDialog(this, "Phone number must be 10 digits long");
        }else if(rolecombo.getSelectedItem() == null){
        JOptionPane.showMessageDialog(this,"Please Select role");
        }else if(clubcombo.getSelectedItem() == null){
        JOptionPane.showMessageDialog(this,"Please Select club");
        }else if(passwordfield.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Please enter Password");
       }if(passwordfield.getText().length()>=8){
       
       AYmember themember = new AYmember();
    themember.setUserName(usernamefield.getText());
    themember.setPhonenumber(phonefield.getText()); 
    themember.setPassword(passwordfield.getText());
    String selectedRole = (String) rolecombo.getSelectedItem();
    themember.setRole(selectedRole);
    String selectedclub = (String) clubcombo.getSelectedItem();
    themember.setClub(selectedclub);
    UserDAO userdao = new UserDAO();
            Integer rowAffected = userdao.createUser(themember);
            if(rowAffected!= null){
            JOptionPane.showMessageDialog(this,"Member saved !!");
            usernamefield.setText("");
                        phonefield.setText("");
                        passwordfield.setText("");
                        rolecombo.setSelectedIndex(-1);
                        clubcombo.setSelectedIndex(-1);
                        
            }else{
            JOptionPane.showMessageDialog(this, "Member not saved !!");
            } 
       }else{
              JOptionPane.showMessageDialog(this, "Password must be 8 characters!!");
                 }
    
       }catch(Exception ex)
       {ex.printStackTrace();}
    }//GEN-LAST:event_savebtnActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
       try {
        
        UserDAO userDAO = new UserDAO();
        List<AYmember> memberList = userDAO.retrieveallusers(); 
        DefaultTableModel model = (DefaultTableModel) usertable.getModel();
        model.setRowCount(0);
        for (AYmember member : memberList) {
             model.addRow(new Object[]{member.getUserName(), member.getPhonenumber(), member.getRole(), member.getClub(),member.getPassword()});
        }
    } catch (Exception ex) {
        ex.printStackTrace();
 }
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        try{
            if(searchfield.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "User's Username to search is required");
            }else{
                String username = searchfield.getText();
            AYmember themember = new AYmember();
            themember.setUserName(username);
            UserDAO dao = new UserDAO();
            AYmember member = dao.findMemberByUsername(themember);
            if (member != null) {
                usernamefield.setText(member.getUserName());
                phonefield.setText(member.getPhonenumber());
                passwordfield.setText(member.getPassword());
                rolecombo.setSelectedItem(member.getRole());
                clubcombo.setSelectedItem(member.getClub());
                
                // username field uneditable
                usernamefield.setEditable(false);
             }else{
                    JOptionPane.showMessageDialog(this, "Data not found");
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchclubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchclubtnActionPerformed
        try{
            if (clubidtosearch.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Club ID to search is required");
        } else {
            int clubId = Integer.parseInt(clubidtosearch.getText());
            AYclub club = new AYclub();
            club.setClubId(clubId);
            ClubDAO clubdao = new ClubDAO();
            int status = clubdao.findClubById(club);
            if (status == 1) {
                clubidfield.setText(Integer.toString(club.getClubId()));
                clubnamecombo.setSelectedItem(club.getClubname());
                descriptioncombo.setSelectedItem(club.getDescription());
                
                clubidfield.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(this, "Club not found");
            }
        
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchclubtnActionPerformed

    private void saveclubbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveclubbtnActionPerformed
        try{
            boolean condition= true;
        if(clubidfield.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID is required");
            }else if(clubnamecombo.getSelectedItem()== null){
        JOptionPane.showMessageDialog(this,"Please select club name");
        }else if(descriptioncombo.getSelectedItem()== null){
        JOptionPane.showMessageDialog(this,"Please enter description");
        }if(clubidfield.getText().length()==5){
            AYclub theclub = new AYclub();
            int id = Integer.parseInt(clubidfield.getText());
            theclub.setClubId(id);
            String selectedname = (String) clubnamecombo.getSelectedItem();
            theclub.setClubname(selectedname);
            String selecteddescription = (String) descriptioncombo.getSelectedItem();
            theclub.setDescription(selecteddescription);
            ClubDAO clubdao = new ClubDAO();
            Integer rowAffected = clubdao.createClub(theclub);
            if(rowAffected!= null){
            JOptionPane.showMessageDialog(this,"Club saved !!");
                        clubidfield.setText("");
                        clubnamecombo.setSelectedIndex(-1);
                        descriptioncombo.setSelectedIndex(-1);
                        
            }else{
            JOptionPane.showMessageDialog(this, "Club not saved !!");
            } 
       }else{
              JOptionPane.showMessageDialog(this, "club id must be 5 numbers!!");
                 }
        
        
        }catch(Exception ex){
        ex.printStackTrace();}
    }//GEN-LAST:event_saveclubbtnActionPerformed

    private void refreshclubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshclubActionPerformed
        try {
        refreshclub();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_refreshclubActionPerformed

    private void searcheventbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcheventbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searcheventbtnActionPerformed

    private void addeventbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addeventbtnActionPerformed
  try {
    if (eventnamefield.getText().trim().isEmpty() || eventidfield.getText().trim().isEmpty()
            || datefield.getText().trim().isEmpty() || locationeventfield.getText().trim().isEmpty()
            || organisercombo.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, "Please fill all fields!!");
    }

    // Validate date format
    String dateInput = datefield.getText();
    if (!dateInput.matches("\\d{4}-\\d{2}-\\d{2},\\d{2}:\\d{2}")) {
        JOptionPane.showMessageDialog(this, "Invalid date format. Please use YYYY-MM-DD, HH:MM");
        return;
    }
    int eventId = Integer.parseInt(eventidfield.getText());
    String eventName = eventnamefield.getText();
    String datetime = datefield.getText();
    String eventlocation = locationeventfield.getText();
    String eventorganiser = (String) organisercombo.getSelectedItem();
    AYevent theevent = new AYevent();
    EventDAO eventdao = new EventDAO();
    int rowAffected = eventdao.createEvent(theevent);
    if (rowAffected > 0) {
        JOptionPane.showMessageDialog(this, "Event created successfully");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to create Event!!");
    }

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid Event ID. Please enter a valid integer.");
} catch (Exception ex) {
    ex.printStackTrace();
}
      
    }//GEN-LAST:event_addeventbtnActionPerformed
    


    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addeventbtn;
    private javax.swing.JTabbedPane alltabs;
    private javax.swing.JButton attendancebtn;
    private javax.swing.JPanel attendancetab;
    private javax.swing.JLabel backgound;
    private javax.swing.JButton clubbtn;
    private javax.swing.JComboBox<String> clubcombo;
    private javax.swing.JTextField clubidfield;
    private javax.swing.JTextField clubidtosearch;
    private javax.swing.JComboBox<String> clubnamecombo;
    private javax.swing.JPanel clubtab;
    private javax.swing.JTable clubtable;
    private javax.swing.JFormattedTextField datefield;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton deleteclubbtn;
    private javax.swing.JButton deleteeventbtn;
    private javax.swing.JComboBox<String> descriptioncombo;
    private javax.swing.JButton eventbtn;
    private javax.swing.JTextField eventidfield;
    private javax.swing.JTextField eventnamefield;
    private javax.swing.JPanel eventtab;
    private javax.swing.JTable eventtable;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField locationeventfield;
    private javax.swing.JPanel menupanel;
    private javax.swing.JComboBox<String> organisercombo;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField phonefield;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JButton refreshclub;
    private javax.swing.JComboBox<String> rolecombo;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton saveclubbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton searchclubtn;
    private javax.swing.JButton searcheventbtn;
    private javax.swing.JTextField searcheventfield;
    private javax.swing.JTextField searchfield;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton updateclubbtn;
    private javax.swing.JButton updateeventbtn;
    private javax.swing.JButton userbtn;
    private javax.swing.JTextField usernamefield;
    private javax.swing.JTable usertable;
    private javax.swing.JPanel usetab;
    // End of variables declaration//GEN-END:variables
}
