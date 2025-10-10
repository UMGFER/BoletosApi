/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boletos.boletosapiu.utils;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;
/**
 *
 * @author josef
 */
public class RoundedGradientPanelGlassBoletos extends JPanel{
    private int cornerRadius;
    private Color color1;
    private Color color2;

    public RoundedGradientPanelGlassBoletos(int radius, Color c1, Color c2) {
        this.cornerRadius = radius;
        this.color1 = c1;
        this.color2 = c2;
        setOpaque(false); // permite ver lo que hay detrás (necesario para efecto glass)
    }
    
     @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();

        // Suavizado de bordes
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Degradado vertical con transparencia
        GradientPaint gradient = new GradientPaint(
            0, 0, color1,
            0, height, color2
        );

        g2.setPaint(gradient);
        
        // Panel redondeado
        Shape roundedRect = new RoundRectangle2D.Float(0, 0, width, height, cornerRadius, cornerRadius);
        g2.fill(roundedRect);

        // Capa blanca semitransparente arriba (simula reflejo del vidrio)
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fill(new RoundRectangle2D.Float(0, 0, width, height / 2f, cornerRadius, cornerRadius));

        // Borde sutil blanco translúcido
        g2.setColor(new Color(255, 255, 255, 90));
        g2.setStroke(new BasicStroke(1.2f));
        g2.draw(roundedRect);

        g2.dispose();
        super.paintComponent(g);
    }
}


