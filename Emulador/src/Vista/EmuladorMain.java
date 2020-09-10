
package Vista;

import Clases.DispositivoES;
import Clases.PCB;
import Clases.Proceso;
import DB.Conexion;
import Sistema.Dispatcher;
import Sistema.GestionCola;
import Sistema.GestionError;
import Sistema.Interrupcion;
import Sistema.Scheduler;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;




public class EmuladorMain extends javax.swing.JFrame {

    
    public EmuladorMain() {
        
        initComponents();
        colocarBitsMemoria();
        this.setTitle("Emulador de Sistema Operativo");
        Politica.setVisible(false);
        Modo.setVisible(false);
        Velocidad.setVisible(false);
    }
    public void colocarBitsMemoria(){
        for(int i=0;i<100;i++){
            TablaMemoria.setValueAt(i+1, i, 0);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        bgV = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();
        bgM = new javax.swing.ButtonGroup();
        bgP = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Politica = new javax.swing.JComboBox<>();
        Modo = new javax.swing.JComboBox<>();
        Start = new javax.swing.JToggleButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jProgressBar6 = new javax.swing.JProgressBar();
        jProgressBar7 = new javax.swing.JProgressBar();
        jProgressBar8 = new javax.swing.JProgressBar();
        jProgressBar9 = new javax.swing.JProgressBar();
        jProgressBar10 = new javax.swing.JProgressBar();
        jProgressBar11 = new javax.swing.JProgressBar();
        jProgressBar12 = new javax.swing.JProgressBar();
        jProgressBar13 = new javax.swing.JProgressBar();
        jProgressBar14 = new javax.swing.JProgressBar();
        jProgressBar15 = new javax.swing.JProgressBar();
        jProgressBar16 = new javax.swing.JProgressBar();
        jProgressBar17 = new javax.swing.JProgressBar();
        jProgressBar18 = new javax.swing.JProgressBar();
        jProgressBar19 = new javax.swing.JProgressBar();
        jProgressBar20 = new javax.swing.JProgressBar();
        jProgressBar21 = new javax.swing.JProgressBar();
        jProgressBar22 = new javax.swing.JProgressBar();
        jProgressBar23 = new javax.swing.JProgressBar();
        jProgressBar24 = new javax.swing.JProgressBar();
        jProgressBar25 = new javax.swing.JProgressBar();
        jProgressBar26 = new javax.swing.JProgressBar();
        jProgressBar27 = new javax.swing.JProgressBar();
        jProgressBar28 = new javax.swing.JProgressBar();
        Velocidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar29 = new javax.swing.JProgressBar();
        jProgressBar30 = new javax.swing.JProgressBar();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        IngresarProceso = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BTime = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        NInt = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        Prio = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        PMB = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();
        IndicadorIngresar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jProgressBar31 = new javax.swing.JProgressBar();
        jProgressBar32 = new javax.swing.JProgressBar();
        jProgressBar33 = new javax.swing.JProgressBar();
        jProgressBar34 = new javax.swing.JProgressBar();
        jProgressBar35 = new javax.swing.JProgressBar();
        ProcesoES1 = new javax.swing.JTextField();
        ProcesoES2 = new javax.swing.JTextField();
        ProcesoES3 = new javax.swing.JTextField();
        ProcesoES5 = new javax.swing.JTextField();
        ProcesoES4 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        MostrarPC = new javax.swing.JTextPane();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        MostrarProceso = new javax.swing.JTextPane();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        cazul = new javax.swing.JTextField();
        cnegro = new javax.swing.JTextField();
        crojo = new javax.swing.JTextField();
        cblanco = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaES = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        TablaListo = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        TablaPCB = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        TablaMemoria = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        butFCFS = new javax.swing.JRadioButtonMenuItem();
        butSJF = new javax.swing.JRadioButtonMenuItem();
        butRR = new javax.swing.JRadioButtonMenuItem();
        butPrioridades = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        butExp = new javax.swing.JRadioButtonMenuItem();
        butNoExp = new javax.swing.JRadioButtonMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel8.setText("Politica:");

        jRadioButtonMenuItem7.setSelected(true);
        jRadioButtonMenuItem7.setText("jRadioButtonMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setText("Emulador de Sistema Operativo");

        Politica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Politica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "RoundRobin", "Prioridades" }));
        Politica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PoliticaMouseClicked(evt);
            }
        });
        Politica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliticaActionPerformed(evt);
            }
        });

        Modo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expropiativo", "No Expropiativo" }));
        Modo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModoActionPerformed(evt);
            }
        });

        Start.setSelected(true);
        Start.setText("Iniciar Simulación");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        jProgressBar1.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar1.setOrientation(1);
        jProgressBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setVerifyInputWhenFocusTarget(false);
        jProgressBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProgressBar1MouseClicked(evt);
            }
        });

        jProgressBar2.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar2.setOrientation(1);
        jProgressBar2.setStringPainted(true);

        jProgressBar3.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar3.setOrientation(1);
        jProgressBar3.setStringPainted(true);

        jProgressBar4.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar4.setOrientation(1);
        jProgressBar4.setStringPainted(true);

        jProgressBar5.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar5.setOrientation(1);
        jProgressBar5.setStringPainted(true);

        jProgressBar6.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar6.setOrientation(1);
        jProgressBar6.setStringPainted(true);

        jProgressBar7.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar7.setOrientation(1);
        jProgressBar7.setStringPainted(true);

        jProgressBar8.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar8.setOrientation(1);
        jProgressBar8.setStringPainted(true);

        jProgressBar9.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar9.setOrientation(1);
        jProgressBar9.setStringPainted(true);

        jProgressBar10.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar10.setOrientation(1);
        jProgressBar10.setStringPainted(true);

        jProgressBar11.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar11.setOrientation(1);
        jProgressBar11.setStringPainted(true);

        jProgressBar12.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar12.setOrientation(1);
        jProgressBar12.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jProgressBar12.setStringPainted(true);

        jProgressBar13.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar13.setOrientation(1);
        jProgressBar13.setStringPainted(true);

        jProgressBar14.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar14.setOrientation(1);
        jProgressBar14.setStringPainted(true);

        jProgressBar15.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar15.setOrientation(1);
        jProgressBar15.setStringPainted(true);

        jProgressBar16.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar16.setOrientation(1);
        jProgressBar16.setStringPainted(true);

        jProgressBar17.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar17.setOrientation(1);
        jProgressBar17.setStringPainted(true);

        jProgressBar18.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar18.setOrientation(1);
        jProgressBar18.setStringPainted(true);

        jProgressBar19.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar19.setOrientation(1);
        jProgressBar19.setStringPainted(true);

        jProgressBar20.setForeground(new java.awt.Color(51, 51, 255));
        jProgressBar20.setOrientation(1);
        jProgressBar20.setStringPainted(true);

        jProgressBar21.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar21.setOrientation(1);
        jProgressBar21.setStringPainted(true);

        jProgressBar22.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar22.setOrientation(1);
        jProgressBar22.setStringPainted(true);

        jProgressBar23.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar23.setOrientation(1);
        jProgressBar23.setStringPainted(true);

        jProgressBar24.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar24.setOrientation(1);
        jProgressBar24.setStringPainted(true);

        jProgressBar25.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar25.setOrientation(1);
        jProgressBar25.setStringPainted(true);

        jProgressBar26.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar26.setOrientation(1);
        jProgressBar26.setStringPainted(true);

        jProgressBar27.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar27.setOrientation(1);
        jProgressBar27.setStringPainted(true);

        jProgressBar28.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar28.setOrientation(1);
        jProgressBar28.setStringPainted(true);

        Velocidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muy Rápido", "Rápido", "Normal", "Lento", " " }));
        Velocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelocidadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Ingresar Proceso:");

        jProgressBar29.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar29.setOrientation(1);
        jProgressBar29.setStringPainted(true);

        jProgressBar30.setForeground(new java.awt.Color(0, 204, 51));
        jProgressBar30.setOrientation(1);
        jProgressBar30.setStringPainted(true);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setText("Burst Time:");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel11.setText("# Interrupciones:");

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel12.setText("Peso (MB):");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel13.setText("Tiempo de Arribo:");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel14.setText("Prioridad:");

        IngresarProceso.setSelected(true);
        IngresarProceso.setText("Ingresar");
        IngresarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarProcesoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(BTime);

        jScrollPane3.setViewportView(NInt);

        jScrollPane4.setViewportView(TA);

        jScrollPane5.setViewportView(Prio);

        jScrollPane6.setViewportView(PMB);

        TablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Tiempo de Ejecución", "Tiempo de Espera Promedio", "Tiempo de Retorno Promedio", "% de uso de CPU"
            }
        ));
        jScrollPane1.setViewportView(TablaResultados);

        IndicadorIngresar.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        IndicadorIngresar.setText("\"                                                                              \"       ");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel15.setText("1");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel16.setText("2");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel17.setText("3");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel18.setText("4");

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel19.setText("5");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel20.setText("6");

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel21.setText("7");

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel22.setText("8");

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel23.setText("9");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel24.setText("19");

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel25.setText("11");

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel26.setText("12");

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel27.setText("10");

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel28.setText("17");

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel29.setText("18");

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel30.setText("16");

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel31.setText("15");

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel32.setText("14");

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel33.setText("13");

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel34.setText("20");

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel35.setText("21");

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel36.setText("22");

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel37.setText("23");

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel38.setText("24");

        jLabel39.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel39.setText("25");

        jLabel40.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel40.setText("26");

        jLabel41.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel41.setText("27");

        jLabel42.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel42.setText("28");

        jLabel43.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel43.setText("29");

        jLabel44.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel44.setText("30");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel5.setText("Interrupciones E/S:");

        jLabel45.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel45.setText("✓Impresora:");

        jLabel46.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel46.setText("✓Teclado:");

        jLabel47.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel47.setText("✓Mouse:");

        jLabel48.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel48.setText("✓Scanner:");

        jLabel49.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel49.setText("✓Microfono:");

        jProgressBar31.setMaximum(10);
        jProgressBar31.setStringPainted(true);

        jProgressBar32.setMaximum(10);
        jProgressBar32.setStringPainted(true);

        jProgressBar33.setMaximum(10);
        jProgressBar33.setStringPainted(true);

        jProgressBar34.setMaximum(10);
        jProgressBar34.setStringPainted(true);

        jProgressBar35.setMaximum(10);
        jProgressBar35.setStringPainted(true);

        ProcesoES1.setText("P0");
        ProcesoES1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesoES1ActionPerformed(evt);
            }
        });

        ProcesoES2.setText("P0");
        ProcesoES2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesoES2ActionPerformed(evt);
            }
        });

        ProcesoES3.setText("P0");
        ProcesoES3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesoES3ActionPerformed(evt);
            }
        });

        ProcesoES5.setText("P0");
        ProcesoES5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesoES5ActionPerformed(evt);
            }
        });

        ProcesoES4.setText("P0");
        ProcesoES4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesoES4ActionPerformed(evt);
            }
        });

        jScrollPane9.setViewportView(MostrarPC);

        jLabel52.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel52.setText("Ejecutando Proceso:");

        jLabel53.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel53.setText("PC:");

        jScrollPane10.setViewportView(MostrarProceso);

        jLabel51.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel51.setText("Lstos");

        jLabel54.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel54.setText("Leyenda:");

        jLabel55.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel55.setText("En Ejecución");

        jLabel56.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel56.setText("Bloqueado");

        jLabel57.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel57.setText("Finalizado");

        cazul.setSelectionEnd(1);
        cazul.setSelectionStart(1);
        cazul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cazulActionPerformed(evt);
            }
        });

        cnegro.setSelectionEnd(1);
        cnegro.setSelectionStart(1);
        cnegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnegroActionPerformed(evt);
            }
        });

        crojo.setSelectionEnd(1);
        crojo.setSelectionStart(1);
        crojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crojoActionPerformed(evt);
            }
        });

        cblanco.setSelectionEnd(1);
        cblanco.setSelectionStart(1);
        cblanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblancoActionPerformed(evt);
            }
        });

        TablaES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#Proceso", "Burst Time", "Tiempo Restante", "Id Dispositivo"
            }
        ));
        jScrollPane8.setViewportView(TablaES);

        jTabbedPane1.addTab("Cola E/S:", jScrollPane8);

        TablaListo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PID", "Burst Time", "Peso", "TiempoArribo"
            }
        ));
        jScrollPane11.setViewportView(TablaListo);

        jTabbedPane1.addTab("Cola Listo:", jScrollPane11);

        TablaPCB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "PID", "Burst Time", "Prioridad", "Estado", "PC", "Peso"
            }
        ));
        jScrollPane12.setViewportView(TablaPCB);

        jTabbedPane1.addTab("PCB:", jScrollPane12);

        TablaMemoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nro Bits", "Estado", " PID Ocupado"
            }
        ));
        jScrollPane13.setViewportView(TablaMemoria);

        jTabbedPane1.addTab("Memoria", jScrollPane13);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(Politica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Modo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cazul, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cnegro, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(49, 49, 49)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(crojo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jProgressBar12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jProgressBar15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jProgressBar16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(PanelLayout.createSequentialGroup()
                                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLabel34)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel35)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel36)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel37)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel38)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel39)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel40)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel42)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel43)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel44))
                                                    .addGroup(PanelLayout.createSequentialGroup()
                                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(cblanco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(PanelLayout.createSequentialGroup()
                                                                .addComponent(jProgressBar17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jProgressBar18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jProgressBar19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jProgressBar20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jProgressBar21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jProgressBar22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jProgressBar23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jProgressBar24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jProgressBar25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jProgressBar28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jProgressBar27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(7, 7, 7)
                                                        .addComponent(jProgressBar26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jProgressBar29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jProgressBar30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(PanelLayout.createSequentialGroup()
                                                        .addGap(276, 276, 276)
                                                        .addComponent(Start))))))))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel12)
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(IngresarProceso))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(IndicadorIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel14)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel3)))
                .addGap(29, 29, 29)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addGap(0, 73, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(367, 367, 367))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel49))
                                .addGap(28, 28, 28)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jProgressBar31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jProgressBar32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ProcesoES1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(ProcesoES2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 217, Short.MAX_VALUE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(jProgressBar35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ProcesoES5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(jProgressBar34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ProcesoES4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(jProgressBar33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ProcesoES3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel10)
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel11))
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addComponent(IngresarProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IndicadorIngresar)
                                .addGap(7, 7, 7)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Politica, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel54))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cazul, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cnegro, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crojo, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cblanco, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProgressBar12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProgressBar29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel52)
                                        .addComponent(jLabel53))))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(PanelLayout.createSequentialGroup()
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel45)
                                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jProgressBar31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ProcesoES1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel46)
                                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jProgressBar32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ProcesoES2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel47))
                                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jProgressBar33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ProcesoES3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel48))
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jProgressBar34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ProcesoES4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel49)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jProgressBar35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ProcesoES5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );

        jMenu3.setText("Politica");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });

        bgP.add(butFCFS);
        butFCFS.setSelected(true);
        butFCFS.setText("FCFS");
        butFCFS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butFCFSMouseClicked(evt);
            }
        });
        butFCFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFCFSActionPerformed(evt);
            }
        });
        jMenu3.add(butFCFS);

        bgP.add(butSJF);
        butSJF.setText("SJF");
        butSJF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butSJFMouseClicked(evt);
            }
        });
        butSJF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSJFActionPerformed(evt);
            }
        });
        jMenu3.add(butSJF);

        bgP.add(butRR);
        butRR.setText("Round Robin");
        butRR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butRRMouseClicked(evt);
            }
        });
        butRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRRActionPerformed(evt);
            }
        });
        jMenu3.add(butRR);

        bgP.add(butPrioridades);
        butPrioridades.setText("Prioridades");
        butPrioridades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butPrioridadesMouseClicked(evt);
            }
        });
        butPrioridades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPrioridadesActionPerformed(evt);
            }
        });
        jMenu3.add(butPrioridades);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Modo");

        bgM.add(butExp);
        butExp.setSelected(true);
        butExp.setText("Expropiativo");
        butExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExpActionPerformed(evt);
            }
        });
        jMenu4.add(butExp);

        bgM.add(butNoExp);
        butNoExp.setText("No Expropiativo");
        butNoExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoExpActionPerformed(evt);
            }
        });
        jMenu4.add(butNoExp);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Velocidad");

        bgV.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Muy Rápido");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.getAccessibleContext().setAccessibleDescription("");

        bgV.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("Rápido");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem2);

        bgV.add(jRadioButtonMenuItem5);
        jRadioButtonMenuItem5.setText("Normal");
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem5);

        bgV.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setText("Lento");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem4);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int I = 21;
    ArrayList<Proceso> process = new ArrayList<>();


    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


    }//GEN-LAST:event_formWindowActivated

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
    Velocidad.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void butSJFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSJFActionPerformed
        Politica.setSelectedIndex(1);        // TODO add your handling code here:
    }//GEN-LAST:event_butSJFActionPerformed

    private void butPrioridadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPrioridadesActionPerformed
        Politica.setSelectedIndex(3);        // TODO add your handling code here:
    }//GEN-LAST:event_butPrioridadesActionPerformed

    private void ProcesoES4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesoES4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcesoES4ActionPerformed

    private void ProcesoES5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesoES5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcesoES5ActionPerformed

    private void ProcesoES3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesoES3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcesoES3ActionPerformed

    private void ProcesoES2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesoES2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcesoES2ActionPerformed

    private void ProcesoES1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesoES1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcesoES1ActionPerformed

    private void IngresarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarProcesoActionPerformed

        try {
            I = AgregarP(process, I);
            int W = I - 1;
            IndicadorIngresar.setText("...Proceso " + W + " ingresado Correctamente!");
        } catch (Exception e) {
            IndicadorIngresar.setText("No se ha registrado ningun proceso...");

        }

        BTime.setText("");
        if (I == 22) {
            jProgressBar21.setForeground(Color.blue);
        }
        if (I == 23) {
            jProgressBar22.setForeground(Color.blue);
        }
        if (I == 24) {
            jProgressBar23.setForeground(Color.blue);
        }
        if (I == 25) {
            jProgressBar24.setForeground(Color.blue);
        }
        if (I == 26) {
            jProgressBar25.setForeground(Color.blue);
        }

        NInt.setText("");
        TA.setText("");
        Prio.setText("");
        PMB.setText("");
        BTime.requestFocus();//pone el cursor en la casilla de BusrtTime
    }//GEN-LAST:event_IngresarProcesoActionPerformed

    private void VelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VelocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VelocidadActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        new Thread(new Hilo()).start();
    }//GEN-LAST:event_StartActionPerformed

    private void ModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModoActionPerformed

    private void PoliticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoliticaActionPerformed

    private void butFCFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFCFSActionPerformed
        //comboboton();
        Politica.setSelectedIndex(0);
    }//GEN-LAST:event_butFCFSActionPerformed

    private void cazulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cazulActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cazulActionPerformed

    private void cnegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnegroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnegroActionPerformed

    private void crojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crojoActionPerformed

    private void cblancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cblancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cblancoActionPerformed

    private void butRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRRActionPerformed
                Politica.setSelectedIndex(2);        // TODO add your handling code here:

    }//GEN-LAST:event_butRRActionPerformed

    private void butFCFSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butFCFSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_butFCFSMouseClicked

    private void PoliticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PoliticaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PoliticaMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void butSJFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butSJFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_butSJFMouseClicked

    private void butRRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butRRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_butRRMouseClicked

    private void butPrioridadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butPrioridadesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_butPrioridadesMouseClicked

    private void butExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExpActionPerformed
    Modo.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_butExpActionPerformed

    private void butNoExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoExpActionPerformed
      Modo.setSelectedIndex(1);  // TODO add your handling code here:
    }//GEN-LAST:event_butNoExpActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        Velocidad.setSelectedIndex(1);        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
        Velocidad.setSelectedIndex(2);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        Velocidad.setSelectedIndex(3);// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void jProgressBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProgressBar1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelPCB = (DefaultTableModel) TablaPCB.getModel();
        PCB pcb = new PCB();
        ActualizarTablaPCB(modelPCB, pcb);
    }//GEN-LAST:event_jProgressBar1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(EmuladorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmuladorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmuladorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmuladorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EmuladorMain().setVisible(true);
        });
        // Comentar si quieres verlos

        boolean except = false, exec = false, so = true;

    }

    private class Hilo implements Runnable {

        @Override
        public void run() {

            try {
                SO(process);
            } catch (SQLException ex) {
                try {

                    SO(process);
                } catch (SQLException ex1) {
                    Logger.getLogger(EmuladorMain.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }

        }
    }
    
    ArrayList<Proceso> procesos;
    
    public void SO(ArrayList<Proceso> process) throws SQLException {
        boolean except = false, exec = false, so = true;
        DefaultTableModel model = (DefaultTableModel) TablaResultados.getModel();
        DefaultTableModel model1 = (DefaultTableModel) TablaES.getModel();
        DefaultTableModel modelListo = (DefaultTableModel) TablaListo.getModel();
        DefaultTableModel modelMemoria = (DefaultTableModel) TablaListo.getModel();
        DefaultTableModel modelPCB = (DefaultTableModel) TablaPCB.getModel();
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        cazul.setBackground(Color.blue);
        crojo.setBackground(Color.RED);
        cnegro.setBackground(Color.black);
        cblanco.setBackground(Color.white);

        TablaResultados.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        int numpolitica = Politica.getSelectedIndex(); //Jalar del cuadro proceso ; Crear Objeto
        //int numpolitica = bgP.getButtonCount();
        int TiempoEjec = 0;
        int num1 = 20; //Jalar del cuadro proceso ; Crear Objeto
        int timer = 30, tSO = 10, Q;
        int politica = numpolitica;
        double PorcCPU = 0;
        //Object[] ElementColaES = new Object[4];
        ArrayList<Proceso> ColaTotal = new ArrayList<Proceso>();

        ArrayList<Proceso> ColaListos = new ArrayList<>();
        ArrayList<Proceso> ColaES = new ArrayList<>();
        

        ArrayList<DispositivoES> DES = new ArrayList<>();
        for (int i = 1; i <= 5; i++) { //Longitud de la cola de Dispositivos
            DispositivoES d = new DispositivoES(i);
            DES.add(d);
        }

        //Se crean los procesos mediante la clase Proceso, la cual recive su id y añade los demas parametros mediante
        //los metodos random.
        for (int i = 1; i <= num1; i++) {
            Proceso p = new Proceso(i);
            process.add(p);
        }
        procesos = process;

        Q = (int) CalcQuantum(process); //No es necesario
        GestionCola admin = new GestionCola();
        Scheduler sched = new Scheduler();
        Dispatcher dis = new Dispatcher();
        GestionError error = new GestionError();
        PCB pcb = new PCB();
        Proceso p = new Proceso(0);
        Interrupcion interrupcion = new Interrupcion();
        int i = 0;
        int quantum = Q;
        boolean modo;
        boolean procesoNuevo = false;
        modo = Modo.getSelectedIndex() == 0;
        //modo = bgM.equals(0);

        do {

            ColaListos = admin.adminLlegadaColaL(process, ColaListos, i);
            ColaTotal = admin.iniTiempoRetornoColaTotal(process, ColaTotal, i);
            if (ColaListos.size() > 0) {
                if (exec) {
                    ColaTotal = admin.actualizarColaTotalTiempoEspera(ColaTotal, pcb);
                    TiempoEjec = TiempoEjec + 1;
                    timer = timer - 1;
                    quantum = quantum - 1; //IF RR is true

                    pcb.setEstado("En Ejecución");/////////////////////*******************************************
                    if(pcb.getEstado()=="En Ejecución"){
                        ActualizarTablaPCB(modelPCB,pcb);
                    }
                    System.out.println("Ejecutando instrucciones de proceso :" + pcb.id + " // Burst time = " + (pcb.burstTime - 1) + "  //tiempo actual  :" + i + "// tamaño actual de colaListos:  " + ColaListos.size() + "  // colaES: " + ColaES);
                    if (p.getEstado() == "Listo"){
                        ActualizarTablaListos(modelListo, ColaListos);
                    }
                    ActualizarTablaES(model1, ColaES);
                    PintarEjec(pcb.id, pcb);
                    ActualizarTablaMemoria(modelMemoria,ColaListos);
                    so = false;
                    if (!except) {

                        pcb.setBurstTime(pcb.burstTime - 1);
                    }
                    PintarBarra(pcb.id, pcb);
                    MostrarProceso.setText(Integer.toString(pcb.id));
                    String hexadecimal = Integer.toHexString(pcb.getPC());
                    MostrarPC.setText(hexadecimal);
                    pcb.setPC(pcb.PC + 1);
                    try {

                        Delay((((Velocidad.getSelectedIndex()) + 1) * 200) - 200);
                        //Delay ((((bgV.getButtonCount())+1)*200)-200);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(EmuladorMain.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (!except & error.bucleinf()) {
                        except = true;
                        pcb = error.codigoError(pcb);
                        pcb.setEstado("Bloqueado");//***********************************************************
                        ColaListos = admin.removerDeCola(ColaListos, pcb);
                        process = admin.removerDeCola(process, pcb);
                        System.out.println("bucle infinito");
                        ColaTotal = admin.actualizarColaTotal(ColaTotal, pcb);
                    }

                    if (pcb.burstTime == 0) {
                        exec = false;
                        so = true;
                        process = admin.removerDeCola(process, pcb);
                        pcb.setEstado("Finalizado");/////////////////************************************************
                        PintarEjec(pcb.id, pcb);
                        ColaListos = admin.removerDeCola(ColaListos, pcb);
                        ColaTotal = admin.actualizarColaTotalTiempoRetorno(ColaTotal, pcb, i);
                        ColaTotal = admin.actualizarColaTotal(ColaTotal, pcb);

                    }

                    if (timer == 0 & modo) {
                        System.out.println("interrupcion de timer");
                        pcb.setEstado("Bloqueado");//***********************************************************
                        ColaListos = admin.removerDeCola(ColaListos, pcb);
                        exec = false;

                        so = true;
                    }

                    if (interrupcion.nuevoProceso(process, i) & modo) {
                        System.out.println("interrupcion de llegadas");
                        pcb.setEstado("Bloqueado");//***********************************************************
                        ColaListos = admin.removerDeCola(ColaListos, pcb);
                        procesoNuevo = true;
                        exec = false;

                        so = true;

                    }

                    if (quantum == 0 & politica == 3 & modo) {
                        System.out.println("interrupcion de quantum");
                        pcb.setEstado("Bloqueado");//***********************************************************
                        ColaListos = admin.removerDeCola(ColaListos, pcb);
                        exec = false;
                        so = true;

                    }
                    //Si hay alguna interrupcion de E/S, se manda a la ColaES y se actualiza la cola de listos    
                    if (!so & (pcb.periodoInterrupcion > 0) && (interrupcion.InterrupionES(pcb))) {
                        //asignar dispositivopcb
                        ColaES = admin.adminColaES(ColaES, pcb);
                        PintarBarraES(pcb.id, pcb);
                        pcb.setEstado("Bloqueado");//***********************************************************
                        ColaListos = admin.removerDeCola(ColaListos, pcb);
                        exec = false;
                        so = true;
                    }
                }
            }
            if (ColaListos.size() > 0) {
                if (so) {
                    System.out.println("Modo Kernel " + "  //tiempo actual  :" + i + "// tamaño actual de colaListos:  " + ColaListos.size() + "  // colaES: " + ColaES);
                    ActualizarTablaES(model1, ColaES);

                    tSO = tSO - 1;
                    if (tSO == 5) {
                        p = sched.pNext(ColaListos, politica);
                    }
                    if (tSO == 0) {

                        if (pcb.burstTime > 0 & (timer == 0 || quantum == 0 || procesoNuevo) & !except) {
                            ColaListos.add(dis.guardar(pcb));
                            procesoNuevo = false;
///aqui
                        }

                        pcb = dis.cargar(p, pcb);
                        tSO = 10;
                        timer = 30;
                        exec = true;
                        quantum = Q;
                        except = false;
                    }
                }
            }
            // simpre se debe ejecutar
            if (ColaES.size() > 0) {
                if (ColaListos.size() == 0) {
                    System.out.println("Esperando Procesos... " + "  //tiempo actual  :" + i + "// tamaño actual de colaListos:  " + ColaListos.size() + "  // colaES: " + ColaES);
                    ActualizarTablaES(model1, ColaES);

                }
                ColaES = admin.actualizarColaES(ProcesoES1, ProcesoES2, ProcesoES3, ProcesoES4, ProcesoES5, jProgressBar31, jProgressBar32, jProgressBar33, jProgressBar34, jProgressBar35, ColaES, DES);

                if (admin.requerimientoListo(ColaES)) {
                    if (ColaListos.size() == 0) {

                        so = true;
                    }
                    ColaListos = admin.actualizarColaListos(ColaListos, ColaES);
                    ColaES = admin.eliminarProcesosListosColaES(ColaES);

                    //cambiar
                }
            }
            if (process.size() < 1) {
                System.out.println("PROCESOS TERMINADOS");

                for (Proceso proc : ColaTotal) {

                    System.out.println("tiempo de espera del proceso " + proc.id + " : " + proc.tiempoEspera + "  tiempo de retorno: " + proc.tiempoRetorno + "  burst time restante= " + proc.burstTime + " codigo de error:  " + proc.getCodError() + "  estado : " + proc.estado);

                }
                PorcCPU = (1.0 * TiempoEjec / i) * 100;
                System.out.println("Rendimiento del CPU:" + PorcCPU + "%");
                System.out.println("Tiempo de espera  promedio = " + Promedios(ColaTotal, 0));
                System.out.println("Tiempo de retorno  promedio = " + Promedios(ColaTotal, 1));
                String TPromedios[] = new String[4];
                TPromedios[1] = Double.toString(Promedios(ColaTotal, 0));
                TPromedios[2] = Double.toString(Promedios(ColaTotal, 1));
                TPromedios[3] = Double.toString(PorcCPU);
                TPromedios[0] = Integer.toString(i);
                model.addRow(TPromedios);

                break;

            }

            i++;
        } while (true);
    }

    public double Promedios(ArrayList<Proceso> ColaTotal, int tipo) {
        double suma1 = 0;

        for (Proceso process : ColaTotal) {
            if (tipo == 0) {
                suma1 = suma1 + process.getTiempoEspera();
            } else {

                suma1 = suma1 + process.getTiempoRetorno();

            }

        }
        suma1 = suma1 / ColaTotal.size();

        return suma1;
    }

    public int AgregarP(ArrayList<Proceso> process, int I) {
        try {
            Proceso pi = new Proceso(I);
            pi.burstTime = Integer.parseInt(BTime.getText());
            pi.id = I;
            pi.interrupciones = Integer.parseInt(NInt.getText());
            pi.periodoInterrupcion = Integer.parseInt(BTime.getText()) / Integer.parseInt(NInt.getText());;
            pi.peso = Integer.parseInt(PMB.getText());;
            pi.prioridad = Integer.parseInt(Prio.getText());;
            pi.tiempoArribo = Integer.parseInt(TA.getText());
            pi.tiempoInterrupcion = 0;
            pi.tiempoEspera = 0;
            pi.tiempoRetorno = 0;
            pi.estado = "iniciado";
            pi.codError = "";
            pi.idDES = 0;
            pi.PC = 0;
            process.add(pi);
            System.out.println("Se agrego el proceso: " + I);
        } catch (SQLException ex) {
            Logger.getLogger(EmuladorMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return I + 1;
    }

    public void PintarBarra(int opcion, PCB pcb) {
        switch (opcion) {
            case 1:
                jProgressBar1.setValue(pcb.burstTime);
                jProgressBar1.setForeground(Color.BLACK);
                jProgressBar1.setBackground(Color.BLACK);
                jProgressBar1.repaint();
                break;
            case 2:
                jProgressBar2.setValue(pcb.burstTime);
                jProgressBar2.setForeground(Color.BLACK);
                jProgressBar2.setBackground(Color.BLACK);
                jProgressBar2.repaint();
                break;
            case 3:
                jProgressBar3.setValue(pcb.burstTime);
                jProgressBar3.setForeground(Color.BLACK);
                jProgressBar3.setBackground(Color.BLACK);
                jProgressBar3.repaint();
                break;
            case 4:
                jProgressBar4.setValue(pcb.burstTime);
                jProgressBar4.setForeground(Color.BLACK);
                jProgressBar4.setBackground(Color.BLACK);
                jProgressBar4.repaint();

                break;
            case 5:
                jProgressBar5.setValue(pcb.burstTime);
                jProgressBar5.setForeground(Color.BLACK);
                jProgressBar5.setBackground(Color.BLACK);
                jProgressBar5.repaint();

                break;
            case 6:
                jProgressBar6.setValue(pcb.burstTime);
                jProgressBar6.setForeground(Color.BLACK);
                jProgressBar6.setBackground(Color.BLACK);
                jProgressBar6.repaint();

                break;
            case 7:
                jProgressBar7.setValue(pcb.burstTime);
                jProgressBar7.setForeground(Color.BLACK);
                jProgressBar7.setBackground(Color.BLACK);
                jProgressBar7.repaint();

                break;
            case 8:
                jProgressBar8.setValue(pcb.burstTime);
                jProgressBar8.setForeground(Color.BLACK);
                jProgressBar8.setBackground(Color.BLACK);
                jProgressBar8.repaint();

                break;
            case 9:
                jProgressBar9.setValue(pcb.burstTime);
                jProgressBar9.setForeground(Color.BLACK);
                jProgressBar9.setBackground(Color.BLACK);
                jProgressBar9.repaint();

                break;
            case 10:
                jProgressBar10.setValue(pcb.burstTime);
                jProgressBar10.setForeground(Color.BLACK);
                jProgressBar10.setBackground(Color.BLACK);
                jProgressBar10.repaint();

                break;
            case 11:
                jProgressBar11.setValue(pcb.burstTime);
                jProgressBar11.setForeground(Color.BLACK);
                jProgressBar11.setBackground(Color.BLACK);
                jProgressBar11.repaint();

                break;
            case 12:
                jProgressBar12.setValue(pcb.burstTime);
                jProgressBar12.setForeground(Color.BLACK);
                jProgressBar12.setBackground(Color.BLACK);
                jProgressBar12.repaint();

                break;
            case 13:
                jProgressBar13.setValue(pcb.burstTime);
                jProgressBar13.setForeground(Color.BLACK);
                jProgressBar13.setBackground(Color.BLACK);
                jProgressBar13.repaint();

                break;
            case 14:
                jProgressBar14.setValue(pcb.burstTime);
                jProgressBar14.setForeground(Color.BLACK);
                jProgressBar14.setBackground(Color.BLACK);
                jProgressBar14.repaint();

                break;
            case 15:
                jProgressBar15.setValue(pcb.burstTime);
                jProgressBar15.setForeground(Color.BLACK);
                jProgressBar15.setBackground(Color.BLACK);
                jProgressBar15.repaint();

                break;
            case 16:
                jProgressBar16.setValue(pcb.burstTime);
                jProgressBar16.setForeground(Color.BLACK);
                jProgressBar16.setBackground(Color.BLACK);
                jProgressBar16.repaint();

                break;
            case 17:
                jProgressBar17.setValue(pcb.burstTime);
                jProgressBar17.setForeground(Color.BLACK);
                jProgressBar17.setBackground(Color.BLACK);
                jProgressBar17.repaint();

                break;
            case 18:
                jProgressBar18.setValue(pcb.burstTime);
                jProgressBar18.setForeground(Color.BLACK);
                jProgressBar18.setBackground(Color.BLACK);
                jProgressBar18.repaint();

                break;
            case 19:
                jProgressBar19.setValue(pcb.burstTime);
                jProgressBar19.setForeground(Color.BLACK);
                jProgressBar19.setBackground(Color.BLACK);
                jProgressBar19.repaint();

                break;
            case 20:
                jProgressBar20.setValue(pcb.burstTime);
                jProgressBar20.setForeground(Color.BLACK);
                jProgressBar20.setBackground(Color.BLACK);
                jProgressBar20.repaint();

                break;
            case 21:
                jProgressBar21.setValue(pcb.burstTime);
                jProgressBar21.setForeground(Color.BLACK);
                jProgressBar21.setBackground(Color.BLACK);
                ;
                jProgressBar21.repaint();

                break;
            case 22:
                jProgressBar22.setValue(pcb.burstTime);
                jProgressBar22.setForeground(Color.BLACK);
                jProgressBar22.setBackground(Color.BLACK);
                jProgressBar22.repaint();

                break;
            case 23:
                jProgressBar23.setValue(pcb.burstTime);
                jProgressBar23.setForeground(Color.BLACK);
                jProgressBar23.setBackground(Color.BLACK);
                jProgressBar23.repaint();

                break;
            case 24:
                jProgressBar24.setValue(pcb.burstTime);
                jProgressBar24.setForeground(Color.BLACK);
                jProgressBar24.setBackground(Color.BLACK);
                jProgressBar24.repaint();

                break;
            case 25:
                jProgressBar25.setValue(pcb.burstTime);
                jProgressBar25.setForeground(Color.BLACK);
                jProgressBar25.setBackground(Color.BLACK);
                jProgressBar25.repaint();

                break;

            default:
                System.out.println("Excedio El Limite de la grafica...");
        }
    }

    public void PintarEjec(int opcion, PCB pcb) {
        switch (opcion) {
            case 1:
                jProgressBar1.setValue(pcb.burstTime);
                jProgressBar1.setForeground(Color.WHITE);
                jProgressBar1.setBackground(Color.WHITE);
                jProgressBar1.repaint();
                break;
            case 2:
                jProgressBar2.setValue(pcb.burstTime);
                jProgressBar2.setForeground(Color.WHITE);
                jProgressBar2.setBackground(Color.WHITE);
                jProgressBar2.repaint();
                break;
            case 3:
                jProgressBar3.setValue(pcb.burstTime);
                jProgressBar3.setForeground(Color.WHITE);
                jProgressBar3.setBackground(Color.WHITE);
                jProgressBar3.repaint();
                break;
            case 4:
                jProgressBar4.setValue(pcb.burstTime);
                jProgressBar4.setForeground(Color.WHITE);
                jProgressBar4.setBackground(Color.WHITE);
                jProgressBar4.repaint();

                break;
            case 5:
                jProgressBar5.setValue(pcb.burstTime);
                jProgressBar5.setForeground(Color.WHITE);
                jProgressBar5.setBackground(Color.WHITE);
                jProgressBar5.repaint();

                break;
            case 6:
                jProgressBar6.setValue(pcb.burstTime);
                jProgressBar6.setForeground(Color.WHITE);
                jProgressBar6.setBackground(Color.WHITE);
                jProgressBar6.repaint();

                break;
            case 7:
                jProgressBar7.setValue(pcb.burstTime);
                jProgressBar7.setForeground(Color.WHITE);
                jProgressBar7.setBackground(Color.WHITE);
                jProgressBar7.repaint();

                break;
            case 8:
                jProgressBar8.setValue(pcb.burstTime);
                jProgressBar8.setForeground(Color.WHITE);
                jProgressBar8.setBackground(Color.WHITE);
                jProgressBar8.repaint();

                break;
            case 9:
                jProgressBar9.setValue(pcb.burstTime);
                jProgressBar9.setForeground(Color.WHITE);
                jProgressBar9.setBackground(Color.WHITE);
                jProgressBar9.repaint();

                break;
            case 10:
                jProgressBar10.setValue(pcb.burstTime);
                jProgressBar10.setForeground(Color.WHITE);
                jProgressBar10.setBackground(Color.WHITE);
                jProgressBar10.repaint();

                break;
            case 11:
                jProgressBar11.setValue(pcb.burstTime);
                jProgressBar11.setForeground(Color.WHITE);
                jProgressBar11.setBackground(Color.WHITE);
                jProgressBar11.repaint();

                break;
            case 12:
                jProgressBar12.setValue(pcb.burstTime);
                jProgressBar12.setForeground(Color.WHITE);
                jProgressBar12.setBackground(Color.WHITE);
                jProgressBar12.repaint();

                break;
            case 13:
                jProgressBar13.setValue(pcb.burstTime);
                jProgressBar13.setForeground(Color.WHITE);
                jProgressBar13.setBackground(Color.WHITE);
                jProgressBar13.repaint();

                break;
            case 14:
                jProgressBar14.setValue(pcb.burstTime);
                jProgressBar14.setForeground(Color.WHITE);
                jProgressBar14.setBackground(Color.WHITE);
                jProgressBar14.repaint();

                break;
            case 15:
                jProgressBar15.setValue(pcb.burstTime);
                jProgressBar15.setForeground(Color.WHITE);
                jProgressBar15.setBackground(Color.WHITE);
                jProgressBar15.repaint();

                break;
            case 16:
                jProgressBar16.setValue(pcb.burstTime);
                jProgressBar16.setForeground(Color.WHITE);
                jProgressBar16.setBackground(Color.WHITE);
                jProgressBar16.repaint();

                break;
            case 17:
                jProgressBar17.setValue(pcb.burstTime);
                jProgressBar17.setForeground(Color.WHITE);
                jProgressBar17.setBackground(Color.WHITE);
                jProgressBar17.repaint();

                break;
            case 18:
                jProgressBar18.setValue(pcb.burstTime);
                jProgressBar18.setForeground(Color.WHITE);
                jProgressBar18.setBackground(Color.WHITE);
                jProgressBar18.repaint();

                break;
            case 19:
                jProgressBar19.setValue(pcb.burstTime);
                jProgressBar19.setForeground(Color.WHITE);
                jProgressBar19.setBackground(Color.WHITE);
                jProgressBar19.repaint();

                break;
            case 20:
                jProgressBar20.setValue(pcb.burstTime);
                jProgressBar20.setForeground(Color.WHITE);
                jProgressBar20.setBackground(Color.WHITE);
                jProgressBar20.repaint();

                break;
            case 21:
                jProgressBar21.setValue(pcb.burstTime);
                jProgressBar21.setForeground(Color.WHITE);
                jProgressBar21.setBackground(Color.WHITE);
                ;
                jProgressBar21.repaint();

                break;
            case 22:
                jProgressBar22.setValue(pcb.burstTime);
                jProgressBar22.setForeground(Color.WHITE);
                jProgressBar22.setBackground(Color.WHITE);
                jProgressBar22.repaint();

                break;
            case 23:
                jProgressBar23.setValue(pcb.burstTime);
                jProgressBar23.setForeground(Color.WHITE);
                jProgressBar23.setBackground(Color.WHITE);
                jProgressBar23.repaint();

                break;
            case 24:
                jProgressBar24.setValue(pcb.burstTime);
                jProgressBar24.setForeground(Color.WHITE);
                jProgressBar24.setBackground(Color.WHITE);
                jProgressBar24.repaint();

                break;
            case 25:
                jProgressBar25.setValue(pcb.burstTime);
                jProgressBar25.setForeground(Color.WHITE);
                jProgressBar25.setBackground(Color.WHITE);
                jProgressBar25.repaint();

                break;

            default:
                System.out.println("Excedio El Limite de la grafica...");
        }
    }

    public void PintarBarraES(int opcion, PCB pcb) {
        switch (opcion) {
            case 1:
                jProgressBar1.setValue(pcb.burstTime);
                jProgressBar1.setForeground(Color.RED);
                jProgressBar1.setBackground(Color.RED);
                jProgressBar1.repaint();
                break;
            case 2:
                jProgressBar2.setValue(pcb.burstTime);
                jProgressBar2.setForeground(Color.RED);
                jProgressBar2.setBackground(Color.RED);
                jProgressBar2.repaint();
                break;
            case 3:
                jProgressBar3.setValue(pcb.burstTime);
                jProgressBar3.setForeground(Color.RED);
                jProgressBar3.setBackground(Color.RED);
                jProgressBar3.repaint();
                break;
            case 4:
                jProgressBar4.setValue(pcb.burstTime);
                jProgressBar4.setForeground(Color.RED);
                jProgressBar4.setBackground(Color.RED);
                jProgressBar4.repaint();

                break;
            case 5:
                jProgressBar5.setValue(pcb.burstTime);
                jProgressBar5.setForeground(Color.RED);
                jProgressBar5.setBackground(Color.RED);
                jProgressBar5.repaint();

                break;
            case 6:
                jProgressBar6.setValue(pcb.burstTime);
                jProgressBar6.setForeground(Color.RED);
                jProgressBar6.setBackground(Color.RED);
                jProgressBar6.repaint();

                break;
            case 7:
                jProgressBar7.setValue(pcb.burstTime);
                jProgressBar7.setForeground(Color.RED);
                jProgressBar7.setBackground(Color.RED);
                jProgressBar7.repaint();

                break;
            case 8:
                jProgressBar8.setValue(pcb.burstTime);
                jProgressBar8.setForeground(Color.RED);
                jProgressBar8.setBackground(Color.RED);
                jProgressBar8.repaint();

                break;
            case 9:
                jProgressBar9.setValue(pcb.burstTime);
                jProgressBar9.setForeground(Color.RED);
                jProgressBar9.setBackground(Color.RED);
                jProgressBar9.repaint();

                break;
            case 10:
                jProgressBar10.setValue(pcb.burstTime);
                jProgressBar10.setForeground(Color.RED);
                jProgressBar10.setBackground(Color.RED);
                jProgressBar10.repaint();

                break;
            case 11:
                jProgressBar11.setValue(pcb.burstTime);
                jProgressBar11.setForeground(Color.RED);
                jProgressBar11.setBackground(Color.RED);
                jProgressBar11.repaint();

                break;
            case 12:
                jProgressBar12.setValue(pcb.burstTime);
                jProgressBar12.setForeground(Color.RED);
                jProgressBar12.setBackground(Color.RED);
                jProgressBar12.repaint();

                break;
            case 13:
                jProgressBar13.setValue(pcb.burstTime);
                jProgressBar13.setForeground(Color.RED);
                jProgressBar13.setBackground(Color.RED);
                jProgressBar13.repaint();

                break;
            case 14:
                jProgressBar14.setValue(pcb.burstTime);
                jProgressBar14.setForeground(Color.RED);
                jProgressBar14.setBackground(Color.RED);
                jProgressBar14.repaint();

                break;
            case 15:
                jProgressBar15.setValue(pcb.burstTime);
                jProgressBar15.setForeground(Color.RED);
                jProgressBar15.setBackground(Color.RED);
                jProgressBar15.repaint();

                break;
            case 16:
                jProgressBar16.setValue(pcb.burstTime);
                jProgressBar16.setForeground(Color.RED);
                jProgressBar16.setBackground(Color.RED);
                jProgressBar16.repaint();

                break;
            case 17:
                jProgressBar17.setValue(pcb.burstTime);
                jProgressBar17.setForeground(Color.RED);
                jProgressBar17.setBackground(Color.RED);
                jProgressBar17.repaint();

                break;
            case 18:
                jProgressBar18.setValue(pcb.burstTime);
                jProgressBar18.setForeground(Color.RED);
                jProgressBar18.setBackground(Color.RED);
                jProgressBar18.repaint();

                break;
            case 19:
                jProgressBar19.setValue(pcb.burstTime);
                jProgressBar19.setForeground(Color.RED);
                jProgressBar19.setBackground(Color.RED);
                jProgressBar19.repaint();

                break;
            case 20:
                jProgressBar20.setValue(pcb.burstTime);
                jProgressBar20.setForeground(Color.RED);
                jProgressBar20.setBackground(Color.RED);
                jProgressBar20.repaint();

                break;
            case 21:
                jProgressBar21.setValue(pcb.burstTime);
                jProgressBar21.setForeground(Color.RED);
                jProgressBar21.setBackground(Color.RED);
                jProgressBar21.repaint();

                break;
            case 22:
                jProgressBar22.setValue(pcb.burstTime);
                jProgressBar22.setForeground(Color.RED);
                jProgressBar22.setBackground(Color.RED);
                jProgressBar22.repaint();

                break;
            case 23:
                jProgressBar23.setValue(pcb.burstTime);
                jProgressBar23.setForeground(Color.RED);
                jProgressBar23.setBackground(Color.RED);
                jProgressBar23.repaint();

                break;
            case 24:
                jProgressBar24.setValue(pcb.burstTime);
                jProgressBar24.setForeground(Color.RED);
                jProgressBar24.setBackground(Color.RED);
                jProgressBar24.repaint();

                break;
            case 25:
                jProgressBar25.setValue(pcb.burstTime);
                jProgressBar25.setForeground(Color.RED);
                jProgressBar25.setBackground(Color.RED);
                jProgressBar25.repaint();

                break;

            default:
                System.out.println("Excedio El Limite de la grafica...");
        }

    }

    public void Delay(long dly) throws InterruptedException {
        Thread.sleep(dly);

    }

    public double CalcQuantum(ArrayList<Proceso> ColaTotal) {

        String sql;
        double prom = 0, quantum = 0;
        for (Proceso process : ColaTotal) {
            prom = prom + (double) process.getBurstTime();
        }
        prom = prom / ColaTotal.size();

        try {

            Connection con = Conexion.conectar();

            sql = "SELECT *  FROM Promedios";
            PreparedStatement stt = con.prepareStatement(sql);
            ResultSet resul = stt.executeQuery();

            resul.next();

            quantum = resul.getDouble("quantum");

            sql = "update Promedios set quantum=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setDouble(1, prom);

            st.executeUpdate();

            con.close();
        } catch (Exception ex) {

        }

        return quantum;
    }

    public void ActualizarTablaES(DefaultTableModel model1, ArrayList<Proceso> ColaES) {

        Object[] ElementColaES = new Object[4];
        for (Proceso pES : ColaES) {
            ElementColaES[0] = pES.id;
            ElementColaES[1] = pES.burstTime;
            ElementColaES[2] = pES.tiempoInterrupcion;
            ElementColaES[3] = pES.idDES;
            model1.addRow(ElementColaES);
            TablaES.getAutoscrolls();
            TablaES.scrollRectToVisible(TablaES.getCellRect(TablaES.getRowCount() - 1, 0, true));

        }

    }
    
    public void ActualizarTablaListos(DefaultTableModel modelListo, ArrayList<Proceso> ColaListos) {
        
        Object[] ElementColaListos = new Object[4];
        TablaListo.clearSelection(); //werowaruwatutas
        for (Proceso pListo : ColaListos) {
            ElementColaListos[0] = pListo.id;
            ElementColaListos[1] = pListo.burstTime;
            ElementColaListos[2] = pListo.peso;
            ElementColaListos[3] = pListo.prioridad;
            modelListo.addRow(ElementColaListos);
            TablaListo.getAutoscrolls();
            TablaListo.scrollRectToVisible(TablaListo.getCellRect(TablaListo.getRowCount() - 1, 0, true));

        }

    }
    
    
    public void ActualizarTablaPCB(DefaultTableModel modelPCB, PCB pcb) {
            
        Object[] ElementColaPCB = new Object[6];
        
            ElementColaPCB[0] = pcb.id;
            ElementColaPCB[1] = pcb.burstTime;
            ElementColaPCB[2] = pcb.prioridad;
            ElementColaPCB[3] = pcb.estado;
            ElementColaPCB[4] = pcb.PC;
            ElementColaPCB[5] = pcb.peso;
            modelPCB.removeRow(0);                           
            modelPCB.addRow(ElementColaPCB);
            TablaPCB.getAutoscrolls();
            TablaPCB.scrollRectToVisible(TablaPCB.getCellRect(TablaPCB.getRowCount() - 1, 0, true));

        

    }

    public void ActualizarTablaMemoria(DefaultTableModel modelMemoria, ArrayList<Proceso> ColaListos) {
        for (Proceso pListo : ColaListos){
            for(int i=0;i<100;i++){
            double rdn = Math.random();
            if(rdn>0.45){
                if(pListo.burstTime==0){
                    TablaMemoria.setValueAt("LIBRE",i,1);
                    TablaMemoria.setValueAt("-",i,2);
                    if(TablaMemoria.getValueAt(i,1).equals("LIBRE")){
                        TablaMemoria.setValueAt("OCUPADO",i,1);
                        TablaMemoria.setValueAt(pListo.id,i,2);
                    }
                }else{
                    TablaMemoria.setValueAt("OCUPADO",i,1);
                    TablaMemoria.setValueAt(pListo.id,i,2);
                }
            }else{
                TablaMemoria.setValueAt("LIBRE",i,1);
                TablaMemoria.setValueAt("-",i,2);
            }
        }
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane BTime;
    private javax.swing.JLabel IndicadorIngresar;
    private javax.swing.JToggleButton IngresarProceso;
    private javax.swing.JComboBox<String> Modo;
    private javax.swing.JTextPane MostrarPC;
    private javax.swing.JTextPane MostrarProceso;
    private javax.swing.JTextPane NInt;
    private javax.swing.JTextPane PMB;
    private javax.swing.JPanel Panel;
    private javax.swing.JComboBox<String> Politica;
    private javax.swing.JTextPane Prio;
    public javax.swing.JTextField ProcesoES1;
    public javax.swing.JTextField ProcesoES2;
    public javax.swing.JTextField ProcesoES3;
    public javax.swing.JTextField ProcesoES4;
    public javax.swing.JTextField ProcesoES5;
    private javax.swing.JToggleButton Start;
    private javax.swing.JTextPane TA;
    private javax.swing.JTable TablaES;
    private javax.swing.JTable TablaListo;
    private javax.swing.JTable TablaMemoria;
    private javax.swing.JTable TablaPCB;
    private javax.swing.JTable TablaResultados;
    private javax.swing.JComboBox<String> Velocidad;
    private javax.swing.ButtonGroup bgM;
    public static javax.swing.ButtonGroup bgP;
    private javax.swing.ButtonGroup bgV;
    private javax.swing.JRadioButtonMenuItem butExp;
    private javax.swing.JRadioButtonMenuItem butFCFS;
    private javax.swing.JRadioButtonMenuItem butNoExp;
    private javax.swing.JRadioButtonMenuItem butPrioridades;
    private javax.swing.JRadioButtonMenuItem butRR;
    private javax.swing.JRadioButtonMenuItem butSJF;
    private javax.swing.JTextField cazul;
    private javax.swing.JTextField cblanco;
    private javax.swing.JTextField cnegro;
    private javax.swing.JTextField crojo;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar10;
    private javax.swing.JProgressBar jProgressBar11;
    private javax.swing.JProgressBar jProgressBar12;
    private javax.swing.JProgressBar jProgressBar13;
    private javax.swing.JProgressBar jProgressBar14;
    private javax.swing.JProgressBar jProgressBar15;
    private javax.swing.JProgressBar jProgressBar16;
    private javax.swing.JProgressBar jProgressBar17;
    private javax.swing.JProgressBar jProgressBar18;
    private javax.swing.JProgressBar jProgressBar19;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar20;
    private javax.swing.JProgressBar jProgressBar21;
    private javax.swing.JProgressBar jProgressBar22;
    private javax.swing.JProgressBar jProgressBar23;
    private javax.swing.JProgressBar jProgressBar24;
    private javax.swing.JProgressBar jProgressBar25;
    private javax.swing.JProgressBar jProgressBar26;
    private javax.swing.JProgressBar jProgressBar27;
    private javax.swing.JProgressBar jProgressBar28;
    private javax.swing.JProgressBar jProgressBar29;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar30;
    public javax.swing.JProgressBar jProgressBar31;
    public javax.swing.JProgressBar jProgressBar32;
    public javax.swing.JProgressBar jProgressBar33;
    public javax.swing.JProgressBar jProgressBar34;
    public javax.swing.JProgressBar jProgressBar35;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JProgressBar jProgressBar9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
