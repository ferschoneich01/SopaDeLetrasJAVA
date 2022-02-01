package view;


import view.*;
import view.MsgLike;
import java.awt.Color;
import java.util.Random;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import model.Music;
import model.Time;
import view.MsgLike;

/**
 *creado el 25-sep-2015
 * Daniel Diaz
 */
public class FrmHard extends javax.swing.JFrame 
{
    int x,y;
    Time ti;
    MsgLike fin;
    JLabel letra[][];
    JLabel palabra[];
    String palabras[];//al macenas las palabras en un arreglo de string
    int iniciox[];
    int inicioy[];
    boolean gano; 
    boolean direccion[];
    public FrmHard() 
    {
        initComponents();
        palabra = new JLabel[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        this.setLocationRelativeTo(null);
        cargar();
        palabras=new String[10];
        palabra=new JLabel[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};//
        for (int i = 0; i < letra.length; i++) {
            palabras[i]=palabra[i].getText();//pasa la palabra del arreglo label al al arreglo de string
        }
        ti = new Time(lblTime,this);
        ti.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        Sopa_de_letra = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOPA DE LETRA");
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setBackground(new java.awt.Color(51, 51, 51));
        escritorio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                escritorioMouseDragged(evt);
            }
        });
        escritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                escritorioMousePressed(evt);
            }
        });

        Sopa_de_letra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sopa_de_letra.setForeground(new java.awt.Color(51, 51, 51));
        Sopa_de_letra.setLayout(new java.awt.GridLayout(10, 14));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        p2.setBackground(new java.awt.Color(255, 51, 51));
        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setText("BARCA");
        p2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p2.setOpaque(true);

        p1.setBackground(new java.awt.Color(255, 51, 51));
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText("BALLENA");
        p1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p1.setOpaque(true);

        p4.setBackground(new java.awt.Color(255, 51, 51));
        p4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4.setText("PINOCHO");
        p4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p4.setOpaque(true);

        p3.setBackground(new java.awt.Color(255, 51, 51));
        p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3.setText("CIRCO");
        p3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p3.setOpaque(true);

        p6.setBackground(new java.awt.Color(255, 51, 51));
        p6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6.setText("CERPIENTE");
        p6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p6.setOpaque(true);

        p5.setBackground(new java.awt.Color(255, 51, 51));
        p5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5.setText("ABEJA");
        p5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p5.setOpaque(true);

        p8.setBackground(new java.awt.Color(255, 51, 51));
        p8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8.setText("COLIBRI");
        p8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p8.setOpaque(true);

        p7.setBackground(new java.awt.Color(255, 51, 51));
        p7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7.setText("GATO");
        p7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p7.setOpaque(true);

        p9.setBackground(new java.awt.Color(255, 51, 51));
        p9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9.setText("VIÑEDO");
        p9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p9.setOpaque(true);

        p10.setBackground(new java.awt.Color(255, 51, 51));
        p10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p10.setText("RELOJ");
        p10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p10.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(p2)
                .addGap(18, 18, 18)
                .addComponent(p3)
                .addGap(18, 18, 18)
                .addComponent(p4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p6)
                .addGap(18, 18, 18)
                .addComponent(p7)
                .addGap(18, 18, 18)
                .addComponent(p8)
                .addGap(18, 18, 18)
                .addComponent(p9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p10)
                .addGap(38, 38, 38))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PALABRA");

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon-hard.png"))); // NOI18N
        jLabel1.setText("SOPA DE LETRAS NIVEL DIFICIL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tiempo:");

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 255, 0));
        lblTime.setText("0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lblTime)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        escritorio.setLayer(Sopa_de_letra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(Sopa_de_letra, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sopa_de_letra, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 590, 430));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar1MousePressed(evt);
            }
        });

        jMenu2.setBackground(new java.awt.Color(51, 51, 51));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon-menu.png"))); // NOI18N
        jMenu2.setText("Menu");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon-reiniciar.png"))); // NOI18N
        jMenu1.setText("Reiniciar");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setBackground(new java.awt.Color(51, 51, 51));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon-salir.png"))); // NOI18N
        jMenu3.setText("Salir");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Music m = new Music();
        m.PlaySound("Click");
        //esta reinicia el juego
        for (int i = 0; i < letra.length; i++) {
            palabra[i].setText(palabras[i]);//asigna a los label de la derecha las palabras
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                Sopa_de_letra.remove(letra[i][j]);//quita el panel  Sopa_de_letra
            }
        }
        cargar();//carga el juego
        ti.restart();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Music m = new Music();
        m.PlaySound("Click");
        new FrmMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Music m = new Music();
        m.PlaySound("Click");
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jMenuBar1MousePressed

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jMenuBar1MouseDragged

    private void escritorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escritorioMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_escritorioMousePressed

    private void escritorioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escritorioMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_escritorioMouseDragged

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel2MouseDragged
    public void cargar()
    {
        gano=false;
        iniciox=new int[10];//crea un arreglo de enteros para guadar las posiciones de las palabras en x
        inicioy=new int[10];//crea un arreglo de enteros para guadar las posiciones de las palabras en y
        direccion=new boolean[10];//crea un arreglo de enteros para guadar las direcion de las palabras ya sea hacia alante o hacia tras
        celdasdeletras();
        colocarpalabras();
        llenarespaciosvacios();
    }
    public void celdasdeletras() 
    {
        letra=new JLabel[10][14];//crea la matriz de celdas donde va cada letra
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 14; j++) {
                letra[i][j]=new JLabel("", javax.swing.SwingConstants.CENTER);//crea la casilla la vacia y con una alineacion centrada
                letra[i][j].setName("");//le pone un nombre a la casilla en este caso no le pone ninguno
                letra[i][j].setBackground(Color.WHITE);//coloca la casilla de color blanco
                letra[i][j].setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // asigna el tipo y el tamaño de la letra
                letra[i][j].setForeground(new java.awt.Color(0, 5, 2));
                letra[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                letra[i][j].setOpaque(true);//esto es para que se pueda ver el color de la casilla o cajonsito donde va la letra
                letra[i][j].setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));//pone a la casiilla en borde con una linea negra
                letra[i][j].addMouseListener(new java.awt.event.MouseAdapter() {//pone a la casilla a la escucha del mouse para saber cuando se esta dando clic
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        presioneClic(evt);//llama al metodo que debe ejecutarse cuando se da clic
                    }
                });
                Sopa_de_letra.add(letra[i][j]);//coloca la pasilla en el panel Sopa_de_letra
            }
        }
    }
    //este metodo se ejecuta cuando se presiona clic en una casilla
    public void presioneClic(java.awt.event.MouseEvent evt) {
        if (!gano) {//verifica si gano el juego
            if (evt.getComponent().getBackground().equals(Color.WHITE))//verifica si la casilla esta de color blanco 
            {
                evt.getComponent().setBackground(new java.awt.Color(51, 51, 255));//si esta de color blanco la pone de color azul
                tachar();
            }else if(evt.getComponent().getName().equals(""))//pregunta si la casilla no tiene una letra de alguna palabra
            {
                evt.getComponent().setBackground(Color.WHITE);//pone la casilla de color blanco
            }
        }
    }
    public void tachar() 
    {
        for (int i = 0; i < 10; i++) 
        {
            if (!palabra[i].getText().substring(0, 1).equals("<")) {
                if (tacharLetra(iniciox[i],inicioy[i],palabra[i].getText().length(),direccion[i]))//pregunta si hay una palabra encontrada
                {
                    palabra[i].setText("<html><body><s>"+palabra[i].getText()+"</s></body></html>");//tacha la palabra
                    break;
                }
            }
        }
        boolean aux=true;//ayuda para saber si ya todas las palabras estan tachadas
        for (int i = 0; i < letra.length; i++)
        {
            if (!palabra[i].getText().substring(0, 1).equals("<")) 
            {
                aux=false;
                break;
            }
        }
        if (aux) {
            if (!(fin instanceof MsgLike)) 
            { //esto comprueba si la ventana no esta en memoria, entonces la instancia
                fin = new MsgLike();   
                gano=true;
            } 
            CentrarVentanaInterna(fin); //usamos el metodo generico para centrar
            //esta reinicia el juego
            for (int i = 0; i < letra.length; i++) {
                palabra[i].setText(palabras[i]);//asigna a los label de la derecha las palabras
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 14; j++) {
                    Sopa_de_letra.remove(letra[i][j]);//quita el panel  Sopa_de_letra
                }
            }
            cargar();//carga el juego
        }
    }
    public void CentrarVentanaInterna(JInternalFrame internalFrame) 
    { //pasamos como parametro un objeto de tipo JinternalFrame
        int x = (escritorio.getWidth() / 2) - internalFrame.getWidth() / 2;  //caculas las posiciones x y y 
        int y = (escritorio.getHeight() / 2) - internalFrame.getHeight() / 2;
        if (internalFrame.isShowing()) {// comprobamos si la ventana ya esta ejecutada
            internalFrame.setLocation(x, y); // si es asi solo le colocamos en la mitad
        } 
        else
        {
            escritorio.add(internalFrame); // si no es asi le insertamos dentro del desktoppane
            internalFrame.setLocation(x, y); 
            internalFrame.show(); // y mostramos
        }
    }
//    verifica si se puede tachar la letra
    public boolean  tacharLetra(int x,int y,int tamaño,boolean direccion) {
        boolean respuesta=true;
        if (direccion) {
            for (int i = y; i < tamaño+y; i++) {
                if (letra[x][i].getBackground().equals(Color.WHITE)) {
                    respuesta=false;
                    break;
                }
            }
        }else
        {
            for (int j = y; j >y-tamaño; j--) {
                if (letra[x][j].getBackground().equals(Color.WHITE)) {
                    respuesta=false;
                    break;
                }
            }
        }
        return respuesta;
    }
    public void colocarpalabras() 
    {
        String palabra[]={p1.getText(),p2.getText(),p3.getText(),p4.getText(),p5.getText(),p6.getText(),p7.getText(),p8.getText(),p9.getText(),p10.getText()};
        Random random=new Random();//estemetodo ayuda a crear numeros aleatorios
        int iniciax=0;//posicion x donde inicia la palabra
        int iniciay;//posicion y donde inicia la palabra
        int unico[]=NumerosSinRepeticiones(10);//evita que en una fila se generen mas de una vez
        iniciox=unico;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length()<14) {
                iniciax=unico[i];
                iniciay=(int)(random.nextDouble()*14-1);
                int estrae=0;//ayuda para estraer las letras de la palabra
                if (iniciay+palabra[i].length()<14) {
                    for (int j = iniciay; j < iniciay+palabra[i].length(); j++) {
                        letra[iniciax][j].setText(palabra[i].substring(estrae, estrae+1));//estrae una letra de la palabra
                        letra[iniciax][j].setName("1");//pone el nombre a la casilla para que se sepa que hay va una letra de una palabra
                        estrae++;//esto es para que se estraiga la siguiente letra de la palabra
                        inicioy[i]=iniciay;
                        direccion[i]=true;
                    }
                } else if (iniciay-palabra[i].length()>0)
                {
                    for (int j = iniciay; j >iniciay-palabra[i].length() ; j--) {
                        letra[iniciax][j].setText(palabra[i].substring(estrae, estrae+1));
                        letra[iniciax][j].setName("1");
                        estrae++;
                        inicioy[i]=iniciay;
                        direccion[i]=false;
                    }
                }
            }
        }
    }
    public int[] NumerosSinRepeticiones(int repeticiones) {
        int numeros[]=new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            numeros[i]=-1;
        }
        Random random=new Random();
        boolean aux ;//informa si la fila esta o no repetida
        int numero=0;
        for (int x = 0; x < repeticiones; x++) 
        {
            aux = true;
            while (aux) {  
                aux=false;
                numero=(int)(random.nextDouble()*11-1);
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[j]==numero) {
                        aux=true;
                        break;
                    }
                }
            }
            numeros[x]=numero;
        }
        return numeros;
    }
    public void llenarespaciosvacios() 
    {
        //este arreglo ayuda a poner las letras del avecedario
        String abc[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                if (letra[i][j].getText().equals("")) {//si la casilla esta vacia pongale una letra del arreglo abc
                    letra[i][j].setText(abc[(int)(random.nextDouble()*abc.length-1)]);//aqui pone la letra
                }
            }
        }
    }
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(FrmHard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new FrmHard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel Sopa_de_letra;
    javax.swing.JDesktopPane escritorio;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenu jMenu2;
    javax.swing.JMenu jMenu3;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JLabel lblTime;
    javax.swing.JLabel p1;
    javax.swing.JLabel p10;
    javax.swing.JLabel p2;
    javax.swing.JLabel p3;
    javax.swing.JLabel p4;
    javax.swing.JLabel p5;
    javax.swing.JLabel p6;
    javax.swing.JLabel p7;
    javax.swing.JLabel p8;
    javax.swing.JLabel p9;
    // End of variables declaration//GEN-END:variables
}
