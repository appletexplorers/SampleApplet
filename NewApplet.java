/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplet;

import java.applet.Applet;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author taewan
 */
public class NewApplet extends Applet {

    URL url;
    String mystring;

    public NewApplet() {

    }

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        
        try {
            mystring = readURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(NewApplet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewApplet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void paint(Graphics g) {
        g.drawString("Welcome in Java Applet.", 40, 20);
        g.drawString(mystring, 100, 50);
    }
    // TODO overwrite start(), stop() and destroy() methods

    public String readURL() throws MalformedURLException, IOException {

       // URL dataStream = new URL("http://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");
        URL dataStream = new URL("http://www.sbubooks.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(dataStream.openStream()));

        String str;
        str = in.readLine();
       // while ((str = in.readLine()) != null) {
       //     System.out.println(str);
            //... do your processing in here
        //}
        return str;
    }
}
