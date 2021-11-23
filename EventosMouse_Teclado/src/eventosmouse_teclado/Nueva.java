package eventosmouse_teclado;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.swing.*; // Se importan todas las bibliotecas de swing


    
class Nueva extends JFrame implements MouseListener, KeyListener{
    
   JLabel tag_title1,tag_title2, tag_one, tag_two, tag_three, tag_four,tag_count_total,
           tag_etiqueta_in, tag_etiqueta_out, tag_out, tag_count_a, tag_count_j, tag_count_g, tag_count_c; // etiquetas
   JButton button_one, button_two, button_three, button_four; // Botones
   JTextArea tex_area, tex_area_out;
  JScrollPane scroll_Panel_in;
   
       int cantidadLeta=0;
  String leta="";
  int cantidadLetj=0;
  String letj="";
  int cantidadLetg=0;
  String letg="";
  int cantidadLetc=0;
  String letc="";
  int cantidadLetras=0;
  String letras="";
  
   
    public Nueva () {
        
        setLayout(null); // Layout para organizar las partes ventana
        
        tag_title1 = new JLabel (); //Etiquetas
        tag_title1.setText ("Eventos del Mouse y del Teclado");
        tag_title1.setFont(new java.awt.Font("Arial", 0, 38));// Propiedades de la fuente
        tag_title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tag_title1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tag_title1.setBounds(60, 10, 800, 40);
        tag_title2= new JLabel ();
        tag_title2.setText ("Agenda telefonica");
        tag_title2.setBounds (400, 40 ,800, 40);
        
        tag_one = new JLabel (); // Más etiquetas
        tag_one.setText("Nombre(s):");
        tag_one.setBounds(90, 100, 100, 50);
        tag_two = new JLabel ();
        tag_two.setText("Apellido Paterno:");
        tag_two.setBounds(90, 140, 110, 50);
        tag_three = new JLabel (); // Etiqueta donde se mostrará el mensaje 
        //cuando hagan mouse pressed o mouse clicke
        tag_three.setText ("Apellido Materno: ");
        tag_three.setBounds(390, 100, 110, 50);
        tag_four = new JLabel ();
        tag_four.setText ("Teléfono: ");
        tag_four.setBounds (390, 140, 110, 50);
        
        button_one = new JButton (); //Botones datos personales
        button_one.setText("Mostrar Nombre");
        button_one.setBounds(200, 110, 140, 30);
        button_one.addMouseListener ((MouseListener) this);
        button_two = new JButton ();
        button_two.setText("Mostrar Apaterno");
        button_two.setBounds(200, 150, 140, 30);
        button_two.addMouseListener ((MouseListener) this);
        
        button_three = new JButton (); //Botones datos de usuario
        button_three.setText ("Mostar Amaterno");
        button_three.setBounds (500, 110, 140, 30);
        button_three.addMouseListener ((MouseListener) this);
        button_four = new JButton (); //Botones datos de usuario
        button_four.setText ("Mostrar Teléfono");
        button_four.setBounds (500, 150, 140, 30);
        button_four.setBorder(BorderFactory.createLineBorder(Color.gray, 1, true));
        button_four.addMouseListener ((MouseListener) this);
        
        add(tag_title1); // A partir de aqui se agregan todos los componentes que ocupamos
        add (tag_title2);
        add(tag_one);
        add(tag_two);
        add(button_one);
        add(button_two);
        add(button_three);
        add(button_four);
        
        add(tag_three);
        add(tag_four);
        iniciaComponentes ();
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ventana con MouseListener y KeyListener");  //Titulo de la ventana
        setSize (900,700); // Tamaño de la ventana

    }
   
    public void mouseClicked(MouseEvent evento) {
        if (evento.getSource()== button_one){
            // Cuadro de dialogo
            javax.swing.JOptionPane.showMessageDialog(this, "Shalim"); 
        }
        if (evento.getSource () == button_two){
            javax.swing.JOptionPane.showMessageDialog (this, "Mora");
        }
        else if (evento.getSource () == button_three){
        
            javax.swing.JOptionPane.showMessageDialog(this, "Paredes");
        }
        if (evento.getSource () == button_four){ 
            javax.swing.JOptionPane.showMessageDialog (this,"55 11 22 33 44");
            
       }
    }

    public void mouseReleased(MouseEvent evento){
        
    }
    public void mouseEntered(MouseEvent evento){
        
    }
    public void mouseExited(MouseEvent evento){
        
    }

    void setVisble(boolean b) {
       
    }

    @Override
    public void mousePressed(MouseEvent evento) {
    }
    private void iniciaComponentes() {
    
 
  tag_etiqueta_in= new JLabel();
  tag_etiqueta_in.setBounds(30, 300, 350, 40);
  tag_etiqueta_in.setText("Escriba un párrafo con sus pasatiempos favoritos");
  tex_area = new JTextArea();
  tex_area.setLineWrap(true);
  tex_area.addKeyListener(this);
  scroll_Panel_in = new JScrollPane();
  scroll_Panel_in.setBounds(30, 350, 350, 150);
  scroll_Panel_in.setViewportView(tex_area);
  
   //Etiqueta y area del segundo cuadro de texto
  tag_etiqueta_out= new JLabel();
  tag_etiqueta_out.setBounds(550, 300, 180, 40);
  tag_etiqueta_out.setText("Contador de letras");// Al escribir las letras A, J, G y C el contador nos va a decir cuantas veces se escribieron estasletras en tiempo real
  tex_area_out = new JTextArea();
  tex_area_out.setLineWrap(true);
  tex_area_out.addKeyListener(this);

  
  //Impresión del contador de las vocales
  tag_count_a = new JLabel();
  tag_count_a.setBounds(500, 350, 210, 20);
  tag_count_j = new JLabel();
  tag_count_j.setBounds(500, 370, 230, 20);
  tag_count_g = new JLabel();
  tag_count_g.setBounds(500, 390, 230, 20);
  tag_count_c = new JLabel();
  tag_count_c.setBounds(500, 410, 230, 20);
  
  tag_count_total = new JLabel();
  tag_count_total.setBounds(500, 460, 230, 20);
    
  tag_out = new JLabel();
  tag_out.setText("Para cerrar la ventana presione Esc");
  tag_out.setBounds(30, 600, 210, 50);
   
  //Agregamos a nuestra ventana las 
  //etiquetas y cuadros de texto
  
  add(tag_out);
  add(tag_count_total);
  add(tag_count_a);
  add(tag_count_j);
  add(tag_count_g);
  add(tag_count_c);    
  add(tag_etiqueta_in);
  add(tag_etiqueta_out);
  add(scroll_Panel_in);
   
}
 
    /**Este metodo se ejecuta cuando se presiona una tecla*/
 @Override
public void keyPressed(KeyEvent e) {
   
  if (e.getSource()==tex_area)
   {
 if (e.VK_A==e.getKeyCode())
         {
    letras+="a+";
    cantidadLeta++;
    cantidadLetras++;
  }
 if (e.VK_J==e.getKeyCode())
  {
    letras+="j+"; 
    cantidadLetj++;
    cantidadLetras++;
  }
 if (e.VK_G==e.getKeyCode())
  {
    letras+="g+";
    cantidadLetg++;
    cantidadLetras++;
  }
 if (e.VK_C==e.getKeyCode())
  {
    letras+="c+";
    cantidadLetc++;
    cantidadLetras++;
  }
 
  } 
  tex_area_out.setText(letras);
  tag_count_a.setText("Contador de Letras A: "+cantidadLeta);
  tag_count_j.setText("Contador de Letras J: "+cantidadLetj);
  tag_count_g.setText("Contador de Letras G: "+cantidadLetg);
  tag_count_c.setText("Contador de Letras C: "+cantidadLetc);
  
  tag_count_total.setText("Total de Letras: "+cantidadLetras);
}
 
/**Este metodo se ejecuta cuando se suelta una tecla*/
@Override
public void keyReleased(KeyEvent e) {
  System.out.println("Soltó la tecla:  "+e.getKeyText(e.getKeyCode()));
   if (e.getSource()==tex_area)
     {
 if (e.VK_ESCAPE==e.getKeyCode())
        {
 int respuesta = JOptionPane.showConfirmDialog(this,
  "¿Desea cerrar la ventana y salir?", "Confirmación de Salida",
  JOptionPane.YES_NO_OPTION);
 if (respuesta == JOptionPane.YES_NO_OPTION)
 {
  System.exit(0);
 }
      }
   } 
}
 
/**Este metodo funcionará solo cuando se presionan caracteres, 
 *si se presionan teclas como F1, F2, inicio etc no ejecutará 
 *ningun evento*/
  @Override
  public void keyTyped(KeyEvent e) {
  }
}
    
 